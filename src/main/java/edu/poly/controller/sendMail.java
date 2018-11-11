package edu.poly.controller;

import edu.poly.common.mailTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class sendMail {
    @GetMapping("/mail")
    public ModelAndView mail(){
        ModelAndView mav = new ModelAndView();
        mailTest.mailSend("kuminhdey@gmail.com","test","Kích hoạt thành viên SmartTrip");
        mav.setViewName("index");
        return mav;
    }
}
