package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.entity.Users;
import edu.poly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.LOGIN)
public class LoginController {

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";

    public static final String ADMIN_SCREEN = "admin";

    @Autowired
    private UserService userService;

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showLogin(HttpSession session) {
        // If have session
        if (null != session.getAttribute(Constants.SessionKey.USER)) {
            if (session.getAttribute(Constants.SessionKey.USER).toString().equals(Constants.Role.ADMIN) ||
                    session.getAttribute(Constants.SessionKey.USER).toString().equals(Constants.Role.MANAGER)) {
                return new ModelAndView(LOGIN_SCREEN);
            } else {
                return new ModelAndView(INDEX_SCREEN);
            }
        } else {
            ModelAndView mav = new ModelAndView(LOGIN_SCREEN);
            mav.addObject("login", new Users());
            return mav;
        }
    }

//    @PostMapping(Constants.Characters.BLANK)
//    public ModelAndView loginProcess(@ModelAttribute("login") U login){
//
//    }

}
