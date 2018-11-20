package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.PasswordUtils;
import edu.poly.dao.FoodDAO;
import edu.poly.dao.PostIndexDAO;
import edu.poly.dao.TourDAO;
import edu.poly.dao.TourDetailDAO;
import edu.poly.entity.Users;
import edu.poly.impl.TourImpl;
import edu.poly.impl.UserImpl;
import edu.poly.model.FoodDTO;
import edu.poly.model.PostIndexDTO;
import edu.poly.model.TourDTO;
import edu.poly.model.TourDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    //Return blog page
    public static final String BLOG_SCREEN = "blog";

    //Return index page
    public static final String HOME_SCREEN = "index";

    //Return category blog page
    public static final String CATEGORY_BLOG_SCREEN = "category-blog";

    //Return food detail page
    public static final String FOOD_DETAIL_SCREEN = "food-detail";


    public static final String ADMIN_SCREEN = "admin";


    //Return tour detail page
    public static final String TOUR_DETAIL_SCREEN = "tour-detail";

    //Return login page
    public static final String LOGIN_SCREEN = "login";

    //Return error 500 page
    public static final String ERROR500 = "error500";

    @Autowired
    TourImpl tour;

    @Autowired
    TourDAO tourDAO;

    @Autowired
    FoodDAO foodDAO;

    @Autowired
    UserImpl user;

    @Autowired
    PostIndexDAO postIndexDAO;

    @Autowired
    TourDetailDAO tourDetailDAO;

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView index(HttpSession session) {
        ModelAndView mav = new ModelAndView(HOME_SCREEN);
        try { mav.addObject("login", new Users());
            List<TourDTO> lTourDTO = tourDAO.getAllTourDTO();
            List<FoodDTO> lFoodDTO = foodDAO.getAllFoodDTO();
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            mav.addObject("listTour", lTourDTO);
            mav.addObject("listFood", lFoodDTO);
            mav.addObject("listPost", lPostIndexDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    @GetMapping(Constants.Url.BLOG_URL)
    public ModelAndView showBlog() {
        ModelAndView mav = new ModelAndView(BLOG_SCREEN);
        try {
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            List<PostIndexDTO> lPostIndexDTOByView = postIndexDAO.getTop3PostByView();
            List<PostIndexDTO> lPostIndexDTOByCategoryTravel = postIndexDAO.getTop3PostByCategory(4);
            List<PostIndexDTO> lPostIndexDTOByCategoryExperience = postIndexDAO.getTop3PostByCategory(5);
            List<PostIndexDTO> lPostIndexDTOByCategoryFood = postIndexDAO.getTop3PostByCategory(6);
            mav.addObject("listPost", lPostIndexDTO);
            mav.addObject("listPostView", lPostIndexDTOByView);
            mav.addObject("listPostTravel", lPostIndexDTOByCategoryTravel);
            mav.addObject("listPostExperience", lPostIndexDTOByCategoryExperience);
            mav.addObject("listPostFood", lPostIndexDTOByCategoryFood);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    @GetMapping(Constants.Url.CATEGORY_BLOG_URL)
    public ModelAndView showCategoryBlog(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(CATEGORY_BLOG_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.TOUR_DETAIL_URL)
    public ModelAndView showTourDetail(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(TOUR_DETAIL_SCREEN);
        try {
            List<TourDetailDTO> listDTO = tourDetailDAO.getTourDetailDTO(id);
            mav.addObject("listTourDetail", listDTO);
            for (TourDetailDTO td:listDTO){
                System.out.println(td.getServiceRule().get(0).getName());
            }
        } catch(Exception e){
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.ACTIVE_USER_TOKEN)
    public ModelAndView activeUser(@PathVariable("token") String token) {
        Users us = user.getByToken(token);
        us.setToken("");
        us.setActive(true);
        user.update(us);
        ModelAndView mav = new ModelAndView(HOME_SCREEN);
        return mav;
    }


    @PostMapping(Constants.Url.LOGIN)
    public ModelAndView loginProgess(@ModelAttribute("login") Users users, HttpServletRequest rq) {
        ModelAndView mav = new ModelAndView();
        Users login = new Users();
        Users userLogin = user.login(users.getUsername(), PasswordUtils.md5(users.getPassword()));
        if (userLogin != null) {
            if (userLogin.getRole() == Constants.Role.ADMIN || userLogin.getRole() == Constants.Role.MANAGER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            } else if(userLogin.getRole() == Constants.Role.PARTNER) {
                mav.setViewName("redirect:" + Constants.Url.ADMIN_PAGE_URL);
            }
            rq.getSession().setAttribute(Constants.SessionKey.USER, userLogin);
        } else {
            mav.setViewName(HOME_SCREEN);
            login.setUsername(users.getUsername());
            mav.addObject("login", login);
        }
        return mav;
    }

}