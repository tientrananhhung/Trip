package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.dao.*;
import edu.poly.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PlaceInforController {

    //Return food detail page
    public static final String FOOD_DETAIL_SCREEN = "food-detail";

    //Return index page
    public static final String HOME_SCREEN = "index";

    //Return food gage
    public static final String FOOD_SCREEN = "food";


    @Autowired
    FoodDetailDAO foodDetailDAO;

    @Autowired
    FoodInfoDAO foodInfoDAO;

    @Autowired
    FoodDAO foodDAO;

    @Autowired
    PostIndexDAO postIndexDAO;

    @Autowired
    PostCategoryDAO postCategoryDAO;

    @GetMapping(Constants.Url.FOOD_DETAIL_URL)
    public ModelAndView showFoodDetail(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(FOOD_DETAIL_SCREEN);
        try {
            FoodDetailDTO foodDetailDTO = foodDetailDAO.getFoodDetailDTO(id);
            List<FoodInforDTO> foodInforDTOList = foodInfoDAO.getAllFoodInfoByPlaceInfoID(foodDetailDTO.getPlaceInfoID());
            foodDetailDTO.setFoodInforDTOList(foodInforDTOList);
            mav.addObject("fooddetail", foodDetailDTO);
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.FOOD_URL)
    public ModelAndView showFood(){
        ModelAndView mav = new ModelAndView(FOOD_SCREEN);
        try{
            List<FoodDTO> foodDTOS = foodDAO.getAllFoodDTO();
            List<PlaceInfoDTO> getTop5FoodNew = foodDAO.getTop5FoodNew();
            List<PlaceInfoDTO> getTop3Food = foodDAO.getTop3Food();
            List<PostIndexDTO> lPostIndexDTOByCategoryFood = postIndexDAO.getTop3PostByCategory(6);
            List<PostCategoryDTO> categoryList = postCategoryDAO.getAllPostCategory();
            mav.addObject("listFood", foodDTOS);
            mav.addObject("listTop5Food", getTop5FoodNew);
            mav.addObject("listPostFood", lPostIndexDTOByCategoryFood);
            mav.addObject("lTop3Food", getTop3Food);
            mav.addObject("catePostlist",categoryList);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }
}
