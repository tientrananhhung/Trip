package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.FoodCategorys;
import edu.poly.impl.FoodCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class FoodCategoryController {

    @Autowired
    FoodCategoryImpl foodCategory;

    public static final String FOODCATEGORY_SCREEN = "/admin/quanlydanhmucdiadiem/listFoodCategory";
    public static final String ADD_FOODCATEGORY_SCREEN = "/admin/quanlydanhmucdiadiem/addFoodCategory";


//    danh sách danh mục địa điểm
    @GetMapping(Constants.Url.LIST_FOODCATEGORY)
    public ModelAndView listFoodCategory(HttpSession session){
        ModelAndView mav = new ModelAndView();
        mav.addObject("listFoodcategory", foodCategory.getAllByDelete(false));
        mav.setViewName(FOODCATEGORY_SCREEN);
        return mav;
    }


//    Thêm mới danh mục địa điểm
    @GetMapping(Constants.Url.ADD_FOODCATEGORY)
    public ModelAndView newFoodCategory(HttpSession session){
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_FOODCATEGORY_SCREEN);
        mav.addObject("foodcategory", new FoodCategorys());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_FOODCATEGORY)
    public ModelAndView addFoodCategory(HttpSession session, @ModelAttribute("foodcategory") FoodCategorys foodCategorys){
        ModelAndView mav = new ModelAndView();
        foodCategorys.setCreatedAt((Timestamp) TimeUtils.getCurrentTime());
//        foodCategory.save(foodCategorys);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        return mav;
    }

//    Sửa danh mục địa điểm
    @GetMapping(Constants.Url.UPDATE_FOODCATEGORY)
    public ModelAndView editFoodCategory(HttpSession session, @PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_FOODCATEGORY_SCREEN);
//        FoodCategorys foodCategorys = foodCategory.getById(id);
//        mav.addObject("foodcategory", foodCategorys);
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_FOODCATEGORY)
    public ModelAndView updateFoodCategory(HttpSession session, @ModelAttribute("foodcategory") FoodCategorys foodCategorys){
        ModelAndView mav = new ModelAndView();
        foodCategorys.setUpdatedAt((Timestamp) TimeUtils.getCurrentTime());
//        foodCategory.save(foodCategorys);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        return mav;
    }

//    Xóa danh mục địa điểm
    @GetMapping(Constants.Url.DELETE_FOODCATEGORY)
    public ModelAndView deleteFoodCategory(HttpSession session, @PathVariable("id") int id){
        ModelAndView mav = new ModelAndView();
        foodCategory.deleteById(id);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        return mav;
    }
}
