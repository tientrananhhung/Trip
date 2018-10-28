package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.PasswordUtils;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Districts;
import edu.poly.entity.Users;
import edu.poly.impl.DistrictImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class DistrictController {

    @Autowired
    DistrictImpl district;

    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String DISTRICT_SCREEN = "/admin/quanlyquan/listDistrict";
    public static final String ADD_DISTRICT_SCREEN = "/admin/quanlyquan/addDistrict";

    @GetMapping(Constants.Url.LIST_DISTRICT)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }

        mav.addObject("listDistrict", district.findAll());
        mav.setViewName(DISTRICT_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.ADD_DISTRICT)
    public ModelAndView addUser(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_DISTRICT_SCREEN);
        mav.addObject("district", new Districts());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_DISTRICT)
    public ModelAndView addUser(HttpSession session, @ModelAttribute("district") Districts districts) {
        ModelAndView mav = new ModelAndView();
        districts.getCreatedAt(TimeUtils.getCurrentTime());
        district.save(districts);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_DISTRICT)
    public ModelAndView updateUser(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_DISTRICT_SCREEN);
        Districts districts = district.getById(id);
        mav.addObject("district", districts);
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_DISTRICT)
    public ModelAndView editUser(HttpSession session, @ModelAttribute("district") Districts districts) {
        ModelAndView mav = new ModelAndView();
        districts.setUpdatedAt(TimeUtils.getCurrentTime());
        district.save(districts);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        return mav;
    }

    @GetMapping(Constants.Url.DELETE_DISTRICT)
    public ModelAndView deleteDistrict(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        district.deleteById(id);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        return mav;
    }

//    @GetMapping(Constants.Url.ACTIVE_DISTRICT)
//    public ModelAndView statusDistrict(HttpSession session, @PathVariable("id") int id,
//                                   @PathVariable("active") boolean active) {
//        ModelAndView mav = new ModelAndView();
//        Districts districts = district.getById(id);
//        districts.setDeleted(active);
//        district.save(districts);
//        mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
//        return mav;
//    }
}
