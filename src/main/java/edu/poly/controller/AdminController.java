package edu.poly.controller;


import edu.poly.common.*;
import javax.validation.Valid;

import edu.poly.dao.UserStatisticsDAO;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import edu.poly.valaditor.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_USER_SCREEN = "/admin/quanlynguoidung/listuser";

    public static final String ADD_USER = "/admin/quanlynguoidung/adduser";

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";

    @Autowired
    private UserValidator userValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
        binder.addValidators(userValidator);
    }

    @Autowired
    private UserImpl user;

    //    return adminpage
    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showAdminPage(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(ADMIN_SCREEN);
        return mav;
    }

    //    return listuser
    @GetMapping(Constants.Url.LIST_USER)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.addObject("listUser", user.findAllByDeleted(false));
        mav.setViewName(LIST_USER_SCREEN);
        return mav;
    }

    //    return adduserpage
    @GetMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session) {
        ModelAndView mav = new ModelAndView();
                if(!CheckSession.admin(session)){
                    mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                      return mav;
             }

        mav.setViewName(ADD_USER);
        mav.addObject("users", new Users());
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", "them");
        return mav;
    }

    //    adduser
    @PostMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session,@Validated @ModelAttribute("users")  Users users, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        System.out.println(result.getAllErrors());
        if(result.hasErrors()) {
            mav.addObject("gender", returnGender());
            mav.addObject("role", returnRole());
            mav.addObject("action", "them");
            mav.setViewName(ADD_USER);
            return mav;
        }
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        users.setPassword(PasswordUtils.md5("smarttrip"));
        try {
            if (users.getAvatar() == null) {
                users.setAvatar("avatar.png");
            }
            users.setActive(false);
            users.setDeleted(false);
            users.setCreatedAt(TimeUtils.getCurrentTime());
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            String token = TokenUtils.getRandomString();
            users.setToken(token);
            user.save(users);
            mailTest.mailSend(users.getEmail(),MailContent.ACTIVE_USER(users.getUsername(),users.getEmail(),users.getName(),token),"Kích hoạt thành viên SmartTrip");
            mav.addObject("listUser", user.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mav;
    }

    /**
     * @param session for check role
     * @param id to delete user
     * @return url list user
     * */
    @GetMapping(Constants.Url.DELETE_USER)
    public ModelAndView deleteUser(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try{
          Users us =  user.getById(id);
            us.setDeleted(true);
            us.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(us);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    /**
     * @param session for check role
     * @param id for get user
     * @pram active for get type active
     * @return url list user
     * */
    @GetMapping(Constants.Url.ACTIVE_USER)
    public ModelAndView statusUser(HttpSession session, @PathVariable("id") int id,
                                   @PathVariable("active") boolean active) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        System.out.println("vào đâyyyyyyy");
        Users us = user.getById(id);
        us.setUpdatedAt(TimeUtils.getCurrentTime());
        us.setActive(active);
        user.update(us);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    /**
     * @param session for checkrole
     * @param id for get user from form
     * @return url quan-ly-doi-tac/them
     * */
    @GetMapping(Constants.Url.UPDATE_USER)
    public ModelAndView updateUser(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(ADD_USER);
        Users users = user.getById(id);
        mav.addObject("users", users);
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", "sua");
        return mav;
    }


    /**
     * @param session for check role
     * @param users   get user's information from form
     * @return url /quan-ly-nguoi-dung or update page
     */
    @PostMapping(Constants.Url.UPDATED_USER)
    public ModelAndView editUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.admin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        Users us = user.getById(users.getId());
        if (!users.getPassword().equals(us.getPassword()))
            users.setPassword(PasswordUtils.md5(users.getPassword()));
        try {
            users.setActive(us.getActive());
            users.setDeleted(us.getDeleted());
            users.setCreatedAt(us.getCreatedAt());
            users.setAvatar(us.getAvatar());
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(users);
            mav.addObject("listUser", user.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_USER);
        }
        return mav;
    }

    //tạo radio button gender
    public HashMap returnGender() {
        HashMap<Boolean, String> hashMap = new HashMap<Boolean, String>();
        hashMap.put(true, "Nam");
        hashMap.put(false, "Nữ");
        return hashMap;
    }

    public HashMap returnRole() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "Admin");
        hashMap.put(1, "Manager");
        hashMap.put(2, "Partner");
        hashMap.put(3, "Customer");
        return hashMap;
    }

//    public HashMap returnUser(Integer role){
//    HashMap<Integer,Users> hashMap = new HashMap<Integer, Users>();
//        for (Users us:user.getUserByRole(role)){
//            hashMap.put(us.getId(),us);
//        }
//        return hashMap;
//    };


}
