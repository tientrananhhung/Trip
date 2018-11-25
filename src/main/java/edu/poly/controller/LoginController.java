package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.PasswordUtils;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.LOGIN)
public class LoginController {

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";

    public static final String ADMIN_SCREEN = "admin";

    public static final String PARTNER_SCREEN = "partner";

    @Autowired
    private UserImpl user;

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showLogin(HttpSession session) {
        // If have session
        ModelAndView mav = new ModelAndView();
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if (users.getRole() == Constants.Role.ADMIN || users.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            } else if (users.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            }
        } else {
            mav.setViewName(LOGIN_SCREEN);
            mav.addObject("login", new Users());
        }
        return mav;
    }

    @PostMapping(Constants.Characters.BLANK)
    public ModelAndView loginProgess(@ModelAttribute("login") Users users, HttpServletRequest rq) {
        ModelAndView mav = new ModelAndView();
        Users login = new Users();
        Users userLogin = user.login(users.getUsername(), PasswordUtils.md5(users.getPassword()));
        System.out.println(userLogin.getUsername());
        if (userLogin != null) {
            if (userLogin.getRole() == Constants.Role.ADMIN || userLogin.getRole() == Constants.Role.MANAGER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            } else if(userLogin.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            }
            rq.getSession().setAttribute(Constants.SessionKey.USER, userLogin);
        } else {
            mav.setViewName(LOGIN_SCREEN);
            mav.addObject("notify", "Tài khoản hoặc mật khẩu không chính xác!");
            login.setUsername(users.getUsername());
            mav.addObject("login", login);
        }
        return mav;
    }

}
