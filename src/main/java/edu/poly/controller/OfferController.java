package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.StringUtils;
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

    @Autowired
    UserImpl user;

    public static final String OFFER_SCREEN = "/admin/quanlyuudai/listoffer";
    public static final String ADD_OFFER_SCREEN = "/admin/quanlyuudai/addoffer";

//    Return ListOffer
    @GetMapping(Constants.Url.LIST_OFFER)
    public ModelAndView listOffer(HttpSession session){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.addObject("listOffer", offer.findAll());
        mav.setViewName(OFFER_SCREEN);
        return mav;
    }

//    Return AddOffer
    @GetMapping(Constants.Url.ADD_OFFER)
    public ModelAndView addOffer(HttpSession session){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Offers offers = new Offers();
        offers.setCode(StringUtils.getRandomString());
        mav.setViewName(ADD_OFFER_SCREEN);
        mav.addObject("offer", offers);
        mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER, true, false));
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_OFFER)
    public ModelAndView addOffers(HttpSession session, @ModelAttribute("offer") Offers offers){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        System.out.println(offers.getCode());
        try{

            offers.setUsed(false);
            offers.setCreatedAt(TimeUtils.getCurrentTime());
            offers.setUpdatedAt(TimeUtils.getCurrentTime());
            offer.save(offers);
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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Offers offers = offer.getById(id);
        if (offers.getUsed()==false){
            mav.setViewName(ADD_OFFER_SCREEN);
            mav.addObject("offer", offers);
            mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER, true, false));
            mav.addObject("action", "sua");
        }else {
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        }
        return mav;
    }

    @PostMapping(Constants.Url.UPDATED_OFFER)
    public ModelAndView updateOffer(HttpSession session, @ModelAttribute("offer") Offers offers){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Offers of = offer.getById(offers.getId());
        try{
            offers.setUsed(of.getUsed());
            offers.setUpdatedAt(TimeUtils.getCurrentTime());
            offers.setUserId(of.getUserId());
            offers.setCode(of.getCode());
//            try{
                offer.update(offers);
//            }catch (Exception ex){
//                ex.printStackTrace();
//            }
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
    public ModelAndView activeOffer(HttpSession session,@PathVariable("id") int id, @PathVariable("isused") boolean isused){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Offers offers = offer.getById(id);
        offers.setUsed(isused);
        offers.setUpdatedAt(TimeUtils.getCurrentTime());
        try{
            offer.update(offers);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_OFFER);
        return mav;
    }

}
