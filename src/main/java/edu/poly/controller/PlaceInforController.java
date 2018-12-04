package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.dao.FoodDetailDAO;
import edu.poly.dao.FoodInfoDAO;
import edu.poly.model.FoodDetailDTO;
import edu.poly.model.FoodInforDTO;
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


    @Autowired
    FoodDetailDAO foodDetailDAO;

    @Autowired
    FoodInfoDAO foodInfoDAO;

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
}
