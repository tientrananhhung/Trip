package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Tours;
import edu.poly.entity.Users;
import edu.poly.impl.TourImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class TourController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_TOUR_SCREEN = "/admin/quanlytour/listtour";

    public static final String ADD_TOUR = "/admin/quanlytour/addtour";

    @Autowired
    TourImpl tour;

    @Autowired
    UserImpl user;

    /**
     * return url /admin/quan-ly-tour
     * */
    @GetMapping(Constants.Url.LIST_TOUR)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        List<Tours> list = (List<Tours>) tour.findAll();
        mav.addObject("listTour",list);

        mav.setViewName(LIST_TOUR_SCREEN);
        return mav;
    }

    /**
     * return url /admin/quan-ly-tour/them
     *
     * */
    @GetMapping(Constants.Url.ADD_TOUR)
    public ModelAndView addUser(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_TOUR);
        mav.addObject("tours", new Tours());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_TOUR)
    public ModelAndView addPartner(HttpSession session, HttpServletRequest request, @Validated @ModelAttribute("tours") Tours tours, BindingResult result) {
        ModelAndView mav = new ModelAndView();
//        if(result.hasErrors()) {
//            mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER,true,false));
//            mav.addObject("action", "them");
//            mav.setViewName(ADD_PARTNER);
//            return mav;
//        }
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            tours.setCreatedAt(TimeUtils.getCurrentTime());
            tours.setUpdatedAt(TimeUtils.getCurrentTime());
            tours.setDeleted(false);
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            tours.setUserId( us.getId());
            CommonsMultipartFile[] files = tours.getFileData();
            String images = "";
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];
                byte[] bytes = file.getBytes();
                // Creating the directory to store file
                // Assume uploaded file location on web server is D:\file-upload
                String appPath = request.getServletContext().getRealPath("");
                appPath = appPath.replace('\\', '/');
                File dir = new File(appPath);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename();
                File serverFile = new File(fileSource);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
                if(i==0){
                    tours.setImage(file.getOriginalFilename());
                    images = file.getOriginalFilename();
                } else {
                    images = images + "," +file.getOriginalFilename();
                }

            }
            tours.setImages(images);
            tour.save(tours);
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_TOUR);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mav;
    }
    /**
     * @param session for check role
     * @param id for get user
     * @pram active for get type active
     * @return url list user
     * */
    @GetMapping(Constants.Url.DELETE_TOUR)
    public ModelAndView statusPartner(HttpSession session, @PathVariable("id") int id,
                                      @PathVariable("xoa") Boolean xoa) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Tours tours = tour.getById(id);
        tours.setUpdatedAt(TimeUtils.getCurrentTime());
        tours.setDeleted(xoa);
        try{
           tour.save(tours);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_TOUR);
        return mav;
    }
}
