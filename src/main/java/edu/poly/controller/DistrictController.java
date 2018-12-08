package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Districts;
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
    public static final String DISTRICT_SCREEN = "/admin/quanlyquan/listdistrict";
    public static final String ADD_DISTRICT_SCREEN = "/admin/quanlyquan/adddistrict";


//    Return ListDistrict
    @GetMapping(Constants.Url.LIST_DISTRICT)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.addObject("listDistrict", district.findAllByDeleted(false));
        mav.setViewName(DISTRICT_SCREEN);
        return mav;
    }

//    Return AddDistrict
    @GetMapping(Constants.Url.ADD_DISTRICT)
    public ModelAndView addDistrict(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_DISTRICT_SCREEN);
        mav.addObject("district", new Districts());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_DISTRICT)
    public ModelAndView addDistricts(HttpSession session, @ModelAttribute("districts") Districts districts) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            districts.setDeleted(false);
            districts.setCreatedAt(TimeUtils.getCurrentTime());
            districts.setUpdatedAt(TimeUtils.getCurrentTime());
            district.save(districts);
            mav.addObject("listDistrict", district.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(ADD_DISTRICT_SCREEN);
        }
        return mav;
    }

//    Update District
    @GetMapping(Constants.Url.UPDATE_DISTRICT)
    public ModelAndView updateDistrict(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_DISTRICT_SCREEN);
        Districts districts = district.getById(id);
        mav.addObject("district", districts);
        mav.addObject("action", id);
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_DISTRICT)
    public ModelAndView editDistrict(HttpSession session, @ModelAttribute("district") Districts districts) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Districts dt = district.getById(districts.getId());
        try {
            districts.setDeleted(dt.getDeleted());
            districts.setCreatedAt(dt.getCreatedAt());
            districts.setUpdatedAt(TimeUtils.getCurrentTime());
            district.update(districts);
            mav.addObject("listDistrict", district.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_DISTRICT);
        }
        return mav;
    }

//    Delete District
    @GetMapping(Constants.Url.DELETE_DISTRICT)
    public ModelAndView deleteDistrict(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            Districts districts = district.getById(id);
            districts.setDeleted(true);
            districts.setUpdatedAt(TimeUtils.getCurrentTime());
            district.update(districts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_DISTRICT);
        return mav;
    }
}
