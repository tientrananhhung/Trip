package edu.poly.controller;


import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Foods;
import edu.poly.entity.Users;
import edu.poly.impl.FoodCategoryImpl;
import edu.poly.impl.FoodImpl;
import edu.poly.impl.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class FoodPlaceController {
    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_FOOD_PLACE_SCREEN = "/admin/quanlydiadiem/listfoodplace";

    public static final String ADD_FOOD_PLACE_SCREEN = "/admin/quanlydiadiem/addfoodplace";

    @Autowired
    FoodImpl food;

    @Autowired
    FoodCategoryImpl foodCategory;

    @Autowired
    UserImpl user;

    /**
     * return url /admin/quan-ly-tour
     */
    @GetMapping(Constants.Url.LIST_FOOD_PLACE)
    public ModelAndView showFoodplace(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.addObject("listFoodplace", food.findAllByDeleted(false));
        mav.setViewName(LIST_FOOD_PLACE_SCREEN);
        return mav;
    }

    /**
     * return url /admin/quan-ly-tour/them
     */
    @GetMapping(Constants.Url.ADD_FOOD_PLACE)
    public ModelAndView addFoodplace(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_FOOD_PLACE_SCREEN);
        try {
            Foods foods = new Foods();
            mav.addObject("foods", foods);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mav.addObject("listFoodCategory", foodCategory.findAllByDeleted(false));
        mav.addObject("action", "them");

        return mav;
    }

    @PostMapping(Constants.Url.ADD_FOOD_PLACE)
    public ModelAndView addFoodplace(HttpSession session, @ModelAttribute("foods") Foods foods) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            foods.setDeleted(false);
            foods.setCreatedAt(TimeUtils.getCurrentTime());
            foods.setUpdatedAt(TimeUtils.getCurrentTime());
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            foods.setUserId((us.getId()));
            foods.setDeleted(true);
            food.save(foods);
            mav.addObject("listFoodplace", food.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOOD_PLACE);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(ADD_FOOD_PLACE_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_FOOD_PLACE)
    public ModelAndView updatePost(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_FOOD_PLACE_SCREEN);
        Foods fd = food.getById(id);
        mav.addObject("foods", fd);
        mav.addObject("listFoodCategory", foodCategory.findAllByDeleted(false));
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATED_FOOD_PLACE)
    public ModelAndView editPost(HttpSession session, @ModelAttribute("foods") Foods foods) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Foods pd = food.getById(foods.getId());
        try {
            foods.setDeleted(pd.getDeleted());
            foods.setCreatedAt(pd.getCreatedAt());
            foods.setUpdatedAt(TimeUtils.getCurrentTime());
            foods.setUserId(pd.getUserId());
            food.update(foods);
            mav.addObject("listFoodplace", food.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOOD_PLACE);
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_FOOD_PLACE);
        }
        return mav;
    }

    //    Delete PostCategory
    @GetMapping(Constants.Url.DELETE_FOOD_PLACE)
    public ModelAndView deletePostCategory(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try {
            Foods fd = food.getById(id);
            fd.setDeleted(true);
            fd.setUpdatedAt(TimeUtils.getCurrentTime());
            food.update(fd);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOOD_PLACE);
        return mav;
    }

}
