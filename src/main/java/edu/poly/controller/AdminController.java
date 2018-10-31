package edu.poly.controller;


import edu.poly.common.*;
import edu.poly.entity.Partners;
import edu.poly.entity.Users;
import edu.poly.impl.PartnerImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class AdminController {

    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_USER_SCREEN = "/admin/quanlynguoidung/listuser";

    public static final String LIST_PARTNER_SCREEN = "/admin/quanlydoitac/listpartner";

    public static final String ADD_PARTNER = "/admin/quanlydoitac/addpartner";

    public static final String ADD_USER = "/admin/quanlynguoidung/adduser";

    public static final String LOGIN_SCREEN = "login";

    public static final String INDEX_SCREEN = "index";


    @Autowired
    private UserImpl user;

    @Autowired
    private PartnerImpl partner;


    //    return adminpage
    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView showAdminPage(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(ADMIN_SCREEN);
        return mav;
    }

    //    return listuser
    @GetMapping(Constants.Url.LIST_USER)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }


        mav.addObject("listUser", user.findAllByDeleted(false));
        System.out.println(user.findAllByDeleted(false).get(0).getId());
        mav.setViewName(LIST_USER_SCREEN);
        return mav;
    }

    //    return adduserpage
    @GetMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session) {
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_USER);
        mav.addObject("user", new Users());
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", "them");
        return mav;
    }

    //    adduser
    @PostMapping(Constants.Url.ADD_USER)
    public ModelAndView addUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        users.setPassword(PasswordUtils.md5("smarttrip"));
        try {
            if (users.getAvatar() == null) {
                users.setAvatar("avatar.png");
            }
            users.setActive(false);
            users.setDeleted(false);
            users.setCreatedAt(TimeUtils.getCurrentTime());
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            Users us = user.getById(users.getId());
            user.save(users);
            mav.addObject("listUser", user.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(ADD_USER);
        }
        return mav;
    }

    /**
     * @param session for check role
     * @param id to delete user
     * @return url list user
     * */
    @GetMapping(Constants.Url.DELETE_USER)
    public ModelAndView deleteUser(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        try{
          Users us =  user.getById(id);
            us.setDeleted(true);
            us.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(us);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    /**
     * @param session for check role
     * @param id for get user
     * @pram active for get type active
     * @return url list user
     * */
    @GetMapping(Constants.Url.ACTIVE_USER)
    public ModelAndView statusUser(HttpSession session, @PathVariable("id") int id,
                                   @PathVariable("active") boolean active) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        Users us = user.getById(id);
        us.setUpdatedAt(TimeUtils.getCurrentTime());
        us.setActive(active);
        user.update(us);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    /**
     * @param session for checkrole
     * @param id for get user from form
     * @return url quan-ly-doi-tac/them
     * */
    @GetMapping(Constants.Url.UPDATE_USER)
    public ModelAndView updateUser(HttpSession session, @PathVariable("id") Integer id) {
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_USER);
        Users users = user.getById(id);
//       String date = new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(users.getBirthday());
//        System.out.println(date);
//        try {
//            users.setBirthday( new SimpleDateFormat().parse(date));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(users.getBirthday());

        mav.addObject("user", users);
        mav.addObject("gender", returnGender());
        mav.addObject("role", returnRole());
        mav.addObject("action", id);
        return mav;
    }


    /**
     * @param session for check role
     * @param users   get user's information from form
     * @return url /quan-ly-nguoi-dung or update page
     */
    @PostMapping(Constants.Url.UPDATE_USER)
    public ModelAndView editUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        Users us = user.getById(users.getId());
        if (!users.getPassword().equals(us.getPassword()))
            users.setPassword(PasswordUtils.md5(users.getPassword()));
        try {

            users.setActive(us.getActive());
            users.setDeleted(us.getDeleted());
            users.setCreatedAt(us.getCreatedAt());
            users.setAvatar(us.getAvatar());
            users.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(users);
            mav.addObject("listUser", user.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_USER);
        }
        return mav;
    }

    /**
     * @param session for checkrole
     * @return url quan-ly-doi-tac
     * */
    @GetMapping(Constants.Url.LIST_PARTNER)
    public ModelAndView showPartnerList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
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
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_PARTNER);
        mav.addObject("partner", new Partners());
        mav.addObject("user_list", user.findAllByRole(Constants.Role.USER));
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
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        try{
            Partners pn =  partner.getById(id);
            pn.setDeleted(true);
            pn.setUpdatedAt(TimeUtils.getCurrentTime());
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
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
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
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_PARTNER);
        Partners partners = partner.getById(id);
        mav.addObject("user_list", user.findAllByRole(Constants.Role.USER));
        mav.addObject("action", id);
        return mav;
    }


    /**
     * @param session for check role
     * @param partners   get user's information from form
     * @return url /quan-ly-nguoi-dung or update page
     */
    @PostMapping(Constants.Url.UPDATE_PARNER)
    public ModelAndView editPartner(HttpSession session, @ModelAttribute("partners") Partners partners) {
        ModelAndView mav = new ModelAndView();
        Partners pn = partner.getById(partners.getId());
        try {
            partners.setActived(pn.getActived());
            partners.setDeleted(pn.getDeleted());
            partners.setCreatedAt(pn.getCreatedAt());
            partners.setUpdatedAt(TimeUtils.getCurrentTime());
            partner.update(partners);
            mav.addObject("listUser", partner.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_PARTNER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_PARNER);
        }
        return mav;
    }

    //tạo radio button gender
    public HashMap returnGender() {
        HashMap<Boolean, String> hashMap = new HashMap<Boolean, String>();
        hashMap.put(true, "Nam");
        hashMap.put(false, "Nữ");
        return hashMap;
    }

    public HashMap returnRole() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0, "Admin");
        hashMap.put(1, "Manager");
        hashMap.put(3, "Customer");
        return hashMap;
    }

//    public HashMap returnUser(Integer role){
//    HashMap<Integer,Users> hashMap = new HashMap<Integer, Users>();
//        for (Users us:user.getUserByRole(role)){
//            hashMap.put(us.getId(),us);
//        }
//        return hashMap;
//    };


}
