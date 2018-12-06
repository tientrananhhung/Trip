package edu.poly.controller;

import edu.poly.common.*;
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

@Controller
public class LoginController {

    public static final String LOGIN_SCREEN = "dangnhap";

    public static final String INDEX_SCREEN = "index";

    public static final String ADMIN_SCREEN = "admin";

    public static final String PARTNER_SCREEN = "partner";

    @Autowired
    private UserImpl user;

    @Autowired
    private UserValidator userValidator;

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
        binder.addValidators(userValidator);
    }

    @GetMapping(Constants.Url.LOGIN)
    public ModelAndView dangNhap(HttpSession session) {
        ModelAndView mav = new ModelAndView(LOGIN_SCREEN);
        if (session.getAttribute(Constants.SessionKey.USER) != null) {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if (users.getRole() == Constants.Role.ADMIN || users.getRole() == Constants.Role.MANAGER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            } else if (users.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:/");
            } else if (users.getRole() == Constants.Role.USER) {
                if (session.getAttribute(Constants.SessionKey.ORDER_SESSION) != null) {
                    mav.setViewName("redirect:" + Constants.Url.GET_PROCESSING_ORDER_URL);
                } else {
                    mav.setViewName("redirect:/");
                }
            }
        } else {
            mav.addObject("register", new Users());
            mav.addObject("login", new Users());
        }
        return mav;
    }

    @PostMapping(Constants.Url.LOGIN)
    public ModelAndView loginProgess(@ModelAttribute("login") Users users, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        Users login = new Users();
        Users userLogin = user.login(users.getUsername(), PasswordUtils.md5(users.getPassword()));
        if (userLogin != null) {
            if (userLogin.getRole() == Constants.Role.ADMIN || userLogin.getRole() == Constants.Role.MANAGER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            } else if (userLogin.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:/");
            } else if (userLogin.getRole() == Constants.Role.USER) {
                if (session.getAttribute(Constants.SessionKey.ORDER_SESSION) != null) {
                    mav.setViewName("redirect:" + Constants.Url.GET_PROCESSING_ORDER_URL);
                } else {
                    mav.setViewName("redirect:/");
                }
            }
            session.setAttribute(Constants.SessionKey.USER, userLogin);
        } else {
            mav.setViewName(LOGIN_SCREEN);
            mav.addObject("notify", "Tài khoản hoặc mật khẩu không chính xác!");
            login.setUsername(users.getUsername());
            mav.addObject("login", login);
            mav.addObject("register", new Users());
        }
        return mav;
    }

    @PostMapping(Constants.Url.REGISTER)
    public ModelAndView registerCustomer(@Validated @ModelAttribute("register") Users users, BindingResult result, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            mav.addObject("login", new Users());
            mav.setViewName(LOGIN_SCREEN);
            return mav;
        }
//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
//            return mav;
//        }
        users.setPassword(PasswordUtils.md5(users.getPassword()));
        if (users.getAvatar() == null) {
            users.setAvatar("avatar.png");
        }
        users.setActive(false);
        users.setDeleted(false);
        users.setCreatedAt(TimeUtils.getCurrentTime());
        users.setUpdatedAt(TimeUtils.getCurrentTime());
        String token = TokenUtils.getRandomString();
        users.setRole(3);
        users.setToken(token);
        user.save(users);
        mailTest.mailSend(users.getEmail(), MailContent.ACTIVE_USER(users.getUsername(), users.getEmail(), users.getName(), token, users.getPassword()), "Kích hoạt thành viên SmartTrip");
        mav.setViewName("redirect:/");
        return mav;
    }



}
