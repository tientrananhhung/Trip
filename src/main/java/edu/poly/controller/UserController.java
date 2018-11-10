package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.dao.FoodDAO;
import edu.poly.dao.PostIndexDAO;
import edu.poly.dao.TourDAO;
import edu.poly.impl.TourImpl;
import edu.poly.model.FoodDTO;
import edu.poly.model.PostIndexDTO;
import edu.poly.model.TourDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    PostIndexDAO postIndexDAO;

    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView(HOME_SCREEN);
        try {
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
    public ModelAndView showTourDetail(@PathVariable("id") int id){
        ModelAndView mav = new ModelAndView(TOUR_DETAIL_SCREEN);
        return mav;
    }

}