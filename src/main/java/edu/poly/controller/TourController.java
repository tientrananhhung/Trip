package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Tours;
import edu.poly.entity.Users;
import edu.poly.impl.TourImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class TourController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_TOUR_SCREEN = "/admin/quanlytour/listtour";

    public static final String ADD_TOUR = "/admin/quanlytour/addtour";

    @Autowired
    TourImpl tour;

    @Autowired
    UserImpl user;

    /**
     * return url /admin/quan-ly-tour
     * */
    @GetMapping(Constants.Url.LIST_TOUR)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        List<Tours> list = (List<Tours>) tour.findAll();
        mav.addObject("listTour",list);

        mav.setViewName(LIST_TOUR_SCREEN);
        return mav;
    }

    /**
     * return url /admin/quan-ly-tour/them
     *
     * */
    @GetMapping(Constants.Url.ADD_TOUR)
    public ModelAndView addUser(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_TOUR);
        mav.addObject("tours", new Tours());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_TOUR)
    public ModelAndView addPartner(HttpSession session, @Validated @ModelAttribute("tours") Tours tours, BindingResult result) {
        ModelAndView mav = new ModelAndView();
//        if(result.hasErrors()) {
//            mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER,true,false));
//            mav.addObject("action", "them");
//            mav.setViewName(ADD_PARTNER);
//            return mav;
//        }
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            tours.setCreatedAt(TimeUtils.getCurrentTime());
            tours.setUpdatedAt(TimeUtils.getCurrentTime());
            tours.setDeleted(false);
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            tours.setUserId( us.getId());
            tour.save(tours);
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_TOUR);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mav;
    }
    /**
     * @param session for check role
     * @param id for get user
     * @pram active for get type active
     * @return url list user
     * */
    @GetMapping(Constants.Url.DELETE_TOUR)
    public ModelAndView statusPartner(HttpSession session, @PathVariable("id") int id,
                                      @PathVariable("xoa") Boolean xoa) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Tours tours = tour.getById(id);
        tours.setUpdatedAt(TimeUtils.getCurrentTime());
        tours.setDeleted(xoa);
        try{
           tour.save(tours);
        } catch (Exception ex){
            ex.printStackTrace();
        }

        mav.setViewName("redirect:/admin" + Constants.Url.LIST_TOUR);
        return mav;
    }
}
