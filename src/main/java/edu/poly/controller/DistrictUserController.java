package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.dao.DistrictDAO;
import edu.poly.dao.PostIndexDAO;
import edu.poly.model.DistrictDTO;
import edu.poly.model.FoodDistrictDTO;
import edu.poly.model.PostIndexDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class DistrictUserController {

    //Return index page
    public static final String HOME_SCREEN = "index";

    //Return District user page
    public static final String DISTRICT_USER_SCREEN = "district";

    @Autowired
    DistrictDAO districtDAO;

    @Autowired
    PostIndexDAO postIndexDAO;

    @GetMapping(Constants.Url.DISTRICT_USER_URL)
    public ModelAndView showDistrict(@PathVariable("id") int id){
        ModelAndView mav = new ModelAndView(DISTRICT_USER_SCREEN);
        try{
            List<DistrictDTO> listDistrict = districtDAO.getAllDistrict();
            List<FoodDistrictDTO> listFoodD = districtDAO.getAllFoodByDID(id);
            List<FoodDistrictDTO> listTop5FoodD = districtDAO.getTop5FoodByDID(id);
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            mav.addObject("lDistrict", listDistrict);
            mav.addObject("lFoodD",listFoodD);
            mav.addObject("lTop5FoodD",listTop5FoodD);
            mav.addObject("listPost", lPostIndexDTO);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }
}
