package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.entity.Tours;
import edu.poly.impl.TourImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    /**
     * return url /admin/quan-ly-tour
     * */
    @GetMapping(Constants.Url.LIST_TOUR)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
//
        List<Tours> list = tour.findAllByDeleted(false);
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
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_TOUR);
        mav.addObject("tour", new Tours());

        mav.addObject("action", "them");
        return mav;
    }

}