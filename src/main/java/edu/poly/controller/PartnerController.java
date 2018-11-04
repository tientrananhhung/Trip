package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Partners;
import edu.poly.impl.PartnerImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class PartnerController {

    @Autowired
    private PartnerImpl partner;
    private UserImpl user;


    public static final String LIST_PARTNER_SCREEN = "/admin/quanlydoitac/listpartner";

    public static final String ADD_PARTNER = "/admin/quanlydoitac/addpartner";

    /**
     * @param session for checkrole
     * @return url quan-ly-doi-tac
     * */
    @GetMapping(Constants.Url.LIST_PARTNER)
    public ModelAndView showPartnerList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            mav.addObject("listPartner", partner.findAllByDeleted(false));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mav.setViewName(LIST_PARTNER_SCREEN);
        return mav;
    }

    /**
     * @param session for checkrole
     * @return url quan-ly-doi-tac/them
     * */
    @GetMapping(Constants.Url.ADD_PARNER)
    public ModelAndView addPartner(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_PARTNER);
        mav.addObject("partner", new Partners());
        mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER,true,false));


        mav.addObject("action", "them");
        return mav;
    }

    /**
     * @param session for checkrole
     * @param partners for get user from form
     * @return url quan-ly-doi-tac or add partner
     * */
    @PostMapping(Constants.Url.ADD_PARNER)
    public ModelAndView addPartner(HttpSession session, @ModelAttribute("partners") Partners partners) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            partners.setCreatedAt(TimeUtils.getCurrentTime());
            partners.setUpdatedAt(TimeUtils.getCurrentTime());
            partners.setActived(false);
            partners.setDeleted(false);
            partner.save(partners);
            user.updateRoleUser(2,partners.getUserId());
            mav.addObject("listPartner", partner.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(ADD_PARTNER);
        }
        return mav;
    }

    /**
     * @param session for check role
     * @param id to delete user
     * @return url list user
     * */
    @GetMapping(Constants.Url.DELETE_PARNER)
    public ModelAndView deletePartner(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            Partners pn =  partner.getById(id);
            pn.setDeleted(true);
            pn.setUpdatedAt(TimeUtils.getCurrentTime());
            user.updateRoleUser(Constants.Role.USER,pn.getUserId());
            partner.update(pn);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        return mav;
    }

    /**
     * @param session for check role
     * @param id for get user
     * @pram active for get type active
     * @return url list user
     * */
    @GetMapping(Constants.Url.ACTIVE_PARNER)
    public ModelAndView statusPartner(HttpSession session, @PathVariable("id") int id,
                                      @PathVariable("active") boolean active) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Partners pn = partner.getById(id);
        pn.setUpdatedAt(TimeUtils.getCurrentTime());
        pn.setActived(active);
        try{
            partner.update(pn);
        } catch (Exception ex){
            ex.printStackTrace();
        }

        mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        return mav;
    }

    /**
     * @param session for checkrole
     * @param id for get partner
     * @return url quan-ly-doi-tac/them
     * */
    @GetMapping(Constants.Url.UPDATE_PARNER)
    public ModelAndView updatePartner(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_PARTNER);
        Partners partners = partner.getById(id);
        mav.addObject("user_list",  user.findAllByRoleAndActiveAndDeleted(Constants.Role.PARTNER,true,false));
        mav.addObject("partner",partners);
        mav.addObject("action", "sua");
        return mav;
    }


    /**
     * @param session for check role
     * @param partners   get user's information from form
     * @return url /quan-ly-nguoi-dung or update page
     */
    @PostMapping(Constants.Url.UPDATED_PARNER)
    public ModelAndView editPartner(HttpSession session, @ModelAttribute("partner") Partners partners) {
        ModelAndView mav = new ModelAndView();
        Partners pn = partner.getById(partners.getId());
        try {
            partners.setActived(pn.getActived());
            partners.setDeleted(pn.getDeleted());
            partners.setCreatedAt(pn.getCreatedAt());
            partners.setUpdatedAt(TimeUtils.getCurrentTime());
            partners.setUserId(pn.getUserId());
            try{
                partner.update(partners);
            } catch (Exception ex){
                ex.printStackTrace();
            }

            mav.addObject("listPartner", partner.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_PARNER);
        }
        return mav;
    }
}
