package edu.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestController {
    @GetMapping
    public ModelAndView hienThiChucVu() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    @GetMapping(value = "/test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}