package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.impl.OfferImpl;
import edu.poly.entity.Offers;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class OfferController {

    @Autowired
    OfferImpl offer;
    UserImpl user;

    public static final String OFFER_SCREEN = "/admin/quanlyuudai/listOffer";
    public static final String ADD_OFFER_SCREEN = "/admin/quanlyuudai/addOffer";

//    Return ListOffer
    @GetMapping(Constants.Url.LIST_OFFER)
    public ModelAndView listOffer(HttpSession session){
        ModelAndView mav = new ModelAndView();
        mav.addObject("listOffer", offer.findAll());
        mav.setViewName(OFFER_SCREEN);
        return mav;
    }

//    Return AddOffer
    @GetMapping(Constants.Url.ADD_OFFER)
    public ModelAndView addOffer(HttpSession session){
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_OFFER_SCREEN);
        mav.addObject("offer", new Offers());
        mav.addObject("user_list", user.findAllByRole(Constants.Role.USER));
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_OFFER)
    public ModelAndView addOffers(HttpSession session, @ModelAttribute("offer") Offers offers){
        ModelAndView mav = new ModelAndView();
        try{
            offers.setUsed(false);
            offers.setCreatedAt(TimeUtils.getCurrentTime());
            offer.save(offers);
            user.updateRoleUser(3, offers.getUserId());
            mav.addObject("listOffer", offer.findAll());
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(ADD_OFFER_SCREEN);
        }
        return mav;
    }

//    Return UpdateOffer
    @GetMapping(Constants.Url.UPDATE_OFFER)
    public ModelAndView editOffer(HttpSession session, @PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_OFFER_SCREEN);
        Offers offers = offer.getById(id);
        mav.addObject("offer", offers);
        mav.addObject("user_list", user.findAllByRole(Constants.Role.USER));
        mav.addObject("action", id);
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_OFFER)
    public ModelAndView updateOffer(HttpSession session, @ModelAttribute("offer") Offers offers){
        ModelAndView mav = new ModelAndView();
        Offers of = offer.getById(offers.getId());
        try{
            offers.setUsed(of.getUsed());
            offers.setCreatedAt(of.getCreatedAt());
            offer.update(offers);
            mav.addObject("listOffer", offer.findAll());
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_OFFER);
        }
        return mav;
    }

//    Active Offer
    @GetMapping(Constants.Url.ACTIVE_OFFER)
    public ModelAndView activeOffer(HttpSession session,@PathVariable("id") int id, @PathVariable("action") boolean active){
        ModelAndView mav = new ModelAndView();
        Offers offers = offer.getById(id);
        offers.setUsed(active);
        try{
            offer.update(offers);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        return mav;
    }

//    Delete Offer
    @GetMapping(Constants.Url.DELETE_OFFER)
    public ModelAndView deleteOffer(HttpSession session, @PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView();
        try {
            Offers offers = offer.getById(id);
            offer.delete(offers);
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return mav;
    }
}
