package edu.poly.controller;

import edu.poly.common.*;
import edu.poly.entity.Users;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SendMailController {

    private static String FORGOT_SCREEN = "forgot";

    @Autowired
    private UserImpl user;

    @GetMapping("/mail")
    public ModelAndView mail() {
        ModelAndView mav = new ModelAndView();
        mailTest.mailSend("kuminhdey@gmail.com", "MailContent", "Kích hoạt thành viên SmartTrip");
        mav.setViewName("index");
        return mav;
    }

    @PostMapping(Constants.Url.FORGOT_USER)
    public ModelAndView forgotUser(@RequestParam("user") String users) {
        ModelAndView mav = new ModelAndView();
        try {
            Users us = user.getByEmailOrUsername(users);
            String token = TokenUtils.getRandomString();
            us.setToken(token);
            us.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(us);
            mailTest.mailSend(us.getEmail(), MailContent.FORGOT_USER(us.getUsername(), us.getEmail(), us.getName(), token), "Quên mật khẩu thành viên SmartTrip");
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
        } catch (Exception ex) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
        }
        return mav;
    }

    @GetMapping(Constants.Url.FORGOT_USER_TOKEN)
    public ModelAndView forgotUserToken(@PathVariable("token") String token) {
        ModelAndView mav = new ModelAndView();
        Users us = user.getByToken(token);
if( us == null || TimeUtils.getCurrentTime().getTime() - us.getUpdatedAt().getTime() > 600000) {
    mav.setViewName("redirect:/" + Constants.Characters.BLANK);
} else{
mav.addObject("id",us.getId());
    mav.setViewName(FORGOT_SCREEN);
}
    return mav;
    }

    @PostMapping(Constants.Url.RECOVER_USER)
    public ModelAndView RecoverUser(@RequestParam("password") String password,@RequestParam("id") Integer id) {
        ModelAndView mav = new ModelAndView();
      Users us =  user.getById(id);
        us.setPassword(PasswordUtils.md5(password));
        us.setUpdatedAt(TimeUtils.getCurrentTime());
        us.setToken("");
        user.update(us);
       mav.setViewName("redirect:/"+Constants.Characters.BLANK);
return mav;
    }
}
