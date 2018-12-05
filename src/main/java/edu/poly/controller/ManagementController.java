package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.dao.ManagementTourDAO;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import edu.poly.model.ManagementTourDTO;
import edu.poly.valaditor.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.MANAGEMENT_URL)
public class ManagementController {

    public static final String INDEX_SCREEN = "index";

    public static final String INFOMATION_SCREEN = "infomation";

    public static final String MANAGEMENT_TOUR_SCREEN = "management-tour";

    @Autowired
    ManagementTourDAO managementTourDAO;

    @Autowired
    private UserImpl user;

    @Autowired
    private UserValidator userValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
        binder.addValidators(userValidator);
    }

    @GetMapping(Constants.Url.PROFILE_URL)
    public ModelAndView managementInformation(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.isLogin(session)) {
            mav.setViewName(INDEX_SCREEN);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        mav.addObject("userInfo", users);
        mav.setViewName(INFOMATION_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.MANAGEMENT_TOUR_URL)
    public ModelAndView managementTour(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        List<ManagementTourDTO> managementTourDTO = managementTourDAO.getTourDTOById(users.getId());

        mav.setViewName(MANAGEMENT_TOUR_SCREEN);
        mav.addObject("listTour", managementTourDTO);
        return mav;
    }


    @PostMapping(Constants.Url.CHANGE_CUSTOMER_INFORMATION)
    public ModelAndView registerCustomer(HttpServletRequest request, @Validated @ModelAttribute(Constants.SessionKey.USER) Users users, BindingResult result, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            mav.setViewName(INFOMATION_SCREEN);
            return mav;
        }
//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
//            return mav;
//        }
        try {
            Users us = user.getById(users.getId());
            CommonsMultipartFile[] files = users.getFileData();
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];
                if (file.isEmpty()) {
                    us.setAvatar(us.getAvatar());
                } else {
                    byte[] bytes = file.getBytes();
                    // Creating the directory to store file
                    // Assume uploaded file location on web server is D:\file-upload
                    String appPath = request.getServletContext().getRealPath("");
                    appPath = appPath.replace('\\', '/');
                    File dir = new File(appPath);
                    if (!dir.exists()) {
                        dir.mkdirs();
                    }
                    // Create the file on server
                    String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename();
                    us.setAvatar(file.getOriginalFilename());
                    File serverFile = new File(fileSource);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                }
            }
            us.setName(users.getName());
            us.setPhone(users.getPhone());
            us.setEmail(users.getEmail());
            us.setGender(users.getGender());
            us.setBirthday(users.getBirthday());
            us.setAddress(users.getAddress());
            us.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(us);
            session.setAttribute(Constants.SessionKey.USER, us);
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.PROFILE_URL);
            return mav;
        } catch (Exception ex){
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.PROFILE_URL);
            return mav;
        }
    }
}
