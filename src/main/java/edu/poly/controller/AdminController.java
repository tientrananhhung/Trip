package edu.poly.controller;


import edu.poly.common.*;

import edu.poly.dao.OfferStatisticsDAO;
import edu.poly.dao.PartnerStatisticsDAO;
import edu.poly.dao.UserStatisticsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {

    public static final String ADMIN_SCREEN = "/admin/index";


    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";


    @Autowired
    private UserStatisticsDAO userStatisticsDAO;

    @Autowired
    private PartnerStatisticsDAO partnerStatisticsDAO;

    @Autowired
    private OfferStatisticsDAO offerStatisticsDAO;


    //  return adminpage
    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showAdminPage(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(ADMIN_SCREEN);
        mav.addObject("userstatistics",userStatisticsDAO.getUserStatisticsDTO());
        mav.addObject("partnerstatistics",partnerStatisticsDAO.getPartnerStatisticsDTO());
        mav.addObject("offerstatistics",offerStatisticsDAO.getOfferStatisticsDTO());
        return mav;
    }


//    public HashMap returnUser(Integer role){
//    HashMap<Integer,Users> hashMap = new HashMap<Integer, Users>();
//        for (Users us:user.getUserByRole(role)){
//            hashMap.put(us.getId(),us);
//        }
//        return hashMap;
//    };


}
