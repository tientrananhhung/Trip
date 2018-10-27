package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.entity.Users;
import edu.poly.impl.DistrictImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class DistrictController {

    @Autowired
    DistrictImpl district;

    public static final String DISTRICT_SCREEN = "/admin/quanlyquan/listDistrict";

    @GetMapping(Constants.Url.LIST_DISTRICT)
    public ModelAndView showDistrict(HttpSession session) {

        ModelAndView mav = new ModelAndView();

        Users user = (Users) session.getAttribute(Constants.SessionKey.USER);

//        if (CheckSession.admin(session) || !user.isActive() || user.isDeleted()) {
//            mav.setViewName("redirect:" + Constants.Characters.BLANK);
//            return mav;
//        }

        mav.setViewName(DISTRICT_SCREEN);
        mav.addObject("listDistrict", district.findAll());
        return mav;
    }
}
