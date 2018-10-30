package edu.poly.controller;

import edu.poly.common.Constants;
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

    @Autowired
    private UserImpl user;

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

    @PostMapping(Constants.Characters.BLANK)
    public ModelAndView loginProgess(@ModelAttribute("login") Users users, HttpServletRequest rq){
        ModelAndView mav = new ModelAndView();
        Users login = new Users();

//        Users userLogin = user.login(users.getUserName(), PasswordUtils.md5(users.getPassWord()));
//        if(userLogin != null){
//            if (userLogin.getRole() == Constants.Role.ADMIN || userLogin.getRole() == Constants.Role.MANAGER) {
//                mav.setViewName(ADMIN_SCREEN);
//            }else{
//                mav.setViewName(INDEX_SCREEN);
//            }
//            rq.getSession().setAttribute("user", userLogin);
//        }else{
//            mav.setViewName(LOGIN_SCREEN);
//            mav.addObject("notify", "Tài khoản hoặc mật khẩu không chính xác!");
//            login.setUserName(users.getUserName());
//            mav.addObject("login", login);
//        }
        return mav;
    }

}
