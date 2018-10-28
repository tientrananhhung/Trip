package edu.poly.controller;


import edu.poly.common.*;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_USER_SCREEN = "/admin/quanlynguoidung/listuser";

    public static final String ADD_USER = "/admin/quanlynguoidung/addUser";

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";


    @Autowired
    private UserImpl user;

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

    @GetMapping(Constants.Url.LIST_USER)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }

        mav.addObject("listUser", user.getAllByDeleted(false));
        mav.setViewName(LIST_USER_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session) {
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_USER);
        mav.addObject("user", new Users());
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        users.setPassWord(PasswordUtils.md5("smarttrip"));

        try {
            if (users.getAvatar() == null) {
                users.setAvatar("avatar.png");
            }
            users.setCreatedAt(TimeUtils.getCurrentTime());
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            user.save(users);
            mav.addObject("listUser", user.getAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(ADD_USER);
        }
        return mav;
    }

    @GetMapping(Constants.Url.DELETE_USER)
    public ModelAndView deleteUser(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        user.deleteById(id);
        mav.setViewName("redirect:" + Constants.Url.LIST_USER);
        return mav;
    }

    @GetMapping(Constants.Url.ACTIVE_USER)
    public ModelAndView statusUser(HttpSession session, @PathVariable("id") int id,
                                   @PathVariable("active") boolean active) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        Users us = user.getById(id);
        us.setActive(active);
        user.save(us);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_USER)
    public ModelAndView updateUser(HttpSession session, @PathVariable("id") Integer id) {
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_USER);
        Users users = user.getById(id);
        mav.addObject("user", users);
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATED_USER)
    public ModelAndView editUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        if (!users.getPassWord().equals(user.getById(users.getId()).getPassWord()))
            users.setPassWord(PasswordUtils.md5(users.getPassWord()));
        try {
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            user.save(users);
            mav.addObject("listUser", user.getAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_USER);
        }
        return mav;
    }


    //tạo radio button gender
    public HashMap returnGender() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Nam");
        hashMap.put(0, "Nữ");
        return hashMap;
    }

    public HashMap returnRole() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "Admin");
        hashMap.put(1, "Manager");
        hashMap.put(2, "Parner");
        hashMap.put(3, "Customer");
        return hashMap;
    }

}
