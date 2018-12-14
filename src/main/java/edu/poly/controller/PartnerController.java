package edu.poly.controller;

import edu.poly.common.*;
import edu.poly.entity.Partners;
import edu.poly.impl.PartnerImpl;
import edu.poly.impl.UserImpl;
import edu.poly.valaditor.PartnerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class PartnerController {

    @Autowired
    private PartnerImpl partner;

    @Autowired
    private UserImpl user;

    @Autowired
    private PartnerValidator partnerValidator;

    public static final String LIST_PARTNER_SCREEN = "/admin/quanlydoitac/listpartner";

    public static final String ADD_PARTNER = "/admin/quanlydoitac/addpartner";

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(partnerValidator);
    }

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
        try{
            mav.setViewName(ADD_PARTNER);
            mav.addObject("partner", new Partners());
            mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER,true,false));
            mav.addObject("action", "them");

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return mav;
    }

    /**
     * @param session for checkrole
     * @param partners for get user from form
     * @return url quan-ly-doi-tac or add partner
     * */
    @PostMapping(Constants.Url.ADD_PARNER)
    public ModelAndView addPartner(HttpSession session,@Validated @ModelAttribute("partner") Partners partners,BindingResult result) {
        ModelAndView mav = new ModelAndView();
        System.out.println(result.getAllErrors());
        if(result.hasErrors()) {
            mav.addObject("user_list", user.findAllByRoleAndActiveAndDeleted(Constants.Role.USER,true,false));
            mav.addObject("action", "them");
            mav.setViewName(ADD_PARTNER);
            return mav;
        }
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
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        } catch (Exception ex) {
            ex.printStackTrace();
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
                                      @PathVariable("active") boolean active, HttpServletRequest request) {
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
            StringBuffer url = request.getRequestURL();
            String uri = request.getRequestURI();
            String host = url.substring(0, url.indexOf(uri));
            if(active == true){
                mailTest.mailSend(pn.getEmail(), MailContent.ACTIVE_PARTNER(pn.getUsersByUserId().getName(),pn.getName(),pn.getPhone(),pn.getAddress(),pn.getEmail(),host),"Kích hoạt đối tác SmartTrip");
            }
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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
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
