package edu.poly.controller;

import edu.poly.common.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.LOGOUT)
public class LogoutController {

    @RequestMapping(Constants.Characters.BLANK)
    public ModelAndView logoutProcess(HttpSession session) {

        session.invalidate();
        return new ModelAndView("redirect:" + Constants.Url.LOGIN);
    }

}
