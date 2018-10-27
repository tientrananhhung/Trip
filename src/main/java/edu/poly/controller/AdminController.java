package edu.poly.controller;


import edu.poly.common.Constants;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_USER_SCREEN = "/admin/quanlynguoidung/listuser";

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";


    @Autowired
    private UserImpl user;

    public boolean checkSessionAdmin(HttpSession session){
        if (null != session.getAttribute(Constants.SessionKey.USER)) {
            if (session.getAttribute(Constants.SessionKey.USER).toString().equals(Constants.Role.ADMIN) ||
                    session.getAttribute(Constants.SessionKey.USER).toString().equals(Constants.Role.MANAGER)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showAdminPage(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if(!checkSessionAdmin(session)){
            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(ADMIN_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.LIST_USER)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
//        if(!checkSessionAdmin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        System.out.println(user.findAll());
        mav.addObject("listUser", user.findAll());
        mav.setViewName(LIST_USER_SCREEN);
        return mav;
    }

}
