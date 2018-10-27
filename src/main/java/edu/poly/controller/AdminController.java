package edu.poly.controller;


import edu.poly.common.Constants;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {
    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String LIST_USER_SCREEN = "/admin/quanlynguoidung/listuser";


    @Autowired
    private UserImpl user;

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showAdminPage() {
        ModelAndView mav = new ModelAndView(ADMIN_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.LIST_USER)
    public ModelAndView showUserList() {
        ModelAndView mav = new ModelAndView(LIST_USER_SCREEN);
        return mav;
    }

}
