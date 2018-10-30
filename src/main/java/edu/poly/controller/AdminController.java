package edu.poly.controller;


import edu.poly.common.*;
import edu.poly.model.Partners;
import edu.poly.model.Users;
import edu.poly.impl.PartnerImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;

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


        mav.addObject("listUser", user.getAllByDeleted(false));
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
//        users.setPassWord(PasswordUtils.md5("smarttrip"));
        users.setPassword(PasswordUtils.md5("smarttrip"));
        try {
            if (users.getAvatar() == null) {
                users.setAvatar("avatar.png");
            }
//            users.setCreatedAt(TimeUtils.getCurrentTime());
//            users.setUpdatedAt(TimeUtils.getCurrentTime());
            users.setCreatedAt((Timestamp) TimeUtils.getCurrentTime());
            users.setUpdatedAt((Timestamp) TimeUtils.getCurrentTime());
            user.save(users);
            mav.addObject("listUser", user.getAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(ADD_USER);
        }
        return mav;
    }

    //    delete user
    @GetMapping(Constants.Url.DELETE_USER)
    public ModelAndView deleteUser(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        user.deleteById(id);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    //    active user
    @GetMapping(Constants.Url.ACTIVE_USER)
    public ModelAndView statusUser(HttpSession session, @PathVariable("id") int id,
                                   @PathVariable("active") boolean active) {
        ModelAndView mav = new ModelAndView();
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        Users us = user.getById(id);
        us.setActive(active);
        user.save(us);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
        return mav;
    }

    //    return update userpage
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
        mav.addObject("action", "sua");
        return mav;
    }


    //    update userpage
    @PostMapping(Constants.Url.UPDATED_USER)
    public ModelAndView editUser(HttpSession session, @ModelAttribute("user") Users users) {
        ModelAndView mav = new ModelAndView();
        Users userdb = user.getById(users.getId());
//        if (!users.getPassWord().equals(userdb.getPassWord()))
//            users.setPassWord(PasswordUtils.md5(users.getPassWord()));
//        try {
//            users.setActive(userdb.isActive());
//            users.setAvatar(userdb.getAvatar());
//            users.setCreatedAt(userdb.getCreatedAt());
//            users.setUpdatedAt(TimeUtils.getCurrentTime());
//            user.update(users);
//            mav.addObject("listUser", user.getAllByDeleted(false));
//            mav.setViewName("redirect:/admin" + Constants.Url.LIST_USER);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            mav.setViewName(Constants.Url.UPDATE_USER);
//        }
        return mav;
    }

    /**
     * @return parner list
     */
    @GetMapping(Constants.Url.LIST_PARTNER)
    public ModelAndView showPartnerList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        try {
            mav.addObject("listPartner", partner.getAllByDeleted(false));

//            List<Partners> listTest = partner.getAllByDeleted(false);
//            for (int i = 0; i < listTest.size(); i++) {
//                System.out.println("ID:" + listTest.get(i).getUsers().getRole());
//                System.out.println("Email:" + listTest.get(i).getEmail());
//                System.out.println("Name:" + listTest.get(i).getName());
//            }

            List<Partners> listTest = (List<Partners>) partner.findAll();
            for (int i = 0; i < listTest.size(); i++) {
                System.out.println("ID:" + listTest.get(i).getUsersByUserId().getId());
                System.out.println("Name user:" + listTest.get(i).getUsersByUserId().getName());
                System.out.println("Role:" + listTest.get(i).getUsersByUserId().getRole());
                System.out.println("Email:" + listTest.get(i).getEmail());
                System.out.println("Name:" + listTest.get(i).getName());
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mav.setViewName(LIST_PARTNER_SCREEN);
        return mav;
    }

    /**
     * @return add partner page
     */
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
        hashMap.put(2, "Parner");
        hashMap.put(3, "Customer");
        return hashMap;
    }

}
