package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.dao.ManagementTourDAO;
import edu.poly.entity.Users;
import edu.poly.model.ManagementTourDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.MANAGEMENT_URL)
public class ManagementController {

    public static final String INDEX_SCREEN = "index";

    public static final String INFOMATION_SCREEN = "infomation";

    public static final String MANAGEMENT_TOUR_SCREEN = "management-tour";

    @Autowired
    ManagementTourDAO managementTourDAO;


    @GetMapping(Constants.Url.PROFILE_URL)
    public ModelAndView managementInformation(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.isLogin(session)) {
            mav.setViewName(INDEX_SCREEN);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        mav.addObject("userInfo", users);
        mav.setViewName(INFOMATION_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.MANAGEMENT_TOUR_URL)
    public ModelAndView managementTour(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        List<ManagementTourDTO> managementTourDTO = managementTourDAO.getTourDTOById(users.getId());

        mav.setViewName(MANAGEMENT_TOUR_SCREEN);
        mav.addObject("listTour", managementTourDTO);
        return mav;
    }
}
