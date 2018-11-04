package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.FoodCategorys;
import edu.poly.impl.FoodCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class FoodCategoryController {

    @Autowired
    FoodCategoryImpl foodCategory;

    public static final String FOODCATEGORY_SCREEN = "/admin/quanlydanhmucdiadiem/listfoodcategory";
    public static final String ADD_FOODCATEGORY_SCREEN = "/admin/quanlydanhmucdiadiem/addfoodcategory";


//    danh sách danh mục địa điểm
    @GetMapping(Constants.Url.LIST_FOODCATEGORY)
    public ModelAndView listFoodCategory(HttpSession session){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.addObject("listFoodcategory", foodCategory.findAllByDeleted(false));
        mav.setViewName(FOODCATEGORY_SCREEN);
        return mav;
    }


//    Thêm mới danh mục địa điểm
    @GetMapping(Constants.Url.ADD_FOODCATEGORY)
    public ModelAndView newFoodCategory(HttpSession session){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_FOODCATEGORY_SCREEN);
        mav.addObject("foodcategory", new FoodCategorys());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_FOODCATEGORY)
    public ModelAndView addFoodCategory(HttpSession session, @ModelAttribute("foodcategory") FoodCategorys foodCategorys){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            foodCategorys.setDeleted(false);
            foodCategorys.setCreatedAt(TimeUtils.getCurrentTime());
            foodCategorys.setUpdatedAt(TimeUtils.getCurrentTime());
            foodCategory.save(foodCategorys);
            mav.addObject("listFoodcategory", foodCategory.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(ADD_FOODCATEGORY_SCREEN);
        }
        return mav;
    }

//    Sửa danh mục địa điểm
    @GetMapping(Constants.Url.UPDATE_FOODCATEGORY)
    public ModelAndView editFoodCategory(HttpSession session, @PathVariable("id") Integer id){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_FOODCATEGORY_SCREEN);
        FoodCategorys foodCategorys = foodCategory.getById(id);
        mav.addObject("foodcategory", foodCategorys);
        mav.addObject("action", id);
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_FOODCATEGORY)
    public ModelAndView updateFoodCategory(HttpSession session, @ModelAttribute("foodcategory") FoodCategorys foodCategorys){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        FoodCategorys fc = foodCategory.getById(foodCategorys.getId());
        try{
            foodCategorys.setDeleted(fc.getDeleted());
            foodCategorys.setCreatedAt(fc.getCreatedAt());
            foodCategorys.setUpdatedAt(TimeUtils.getCurrentTime());
            foodCategory.update(foodCategorys);
            mav.addObject("listFoodcategory", foodCategory.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_FOODCATEGORY);
        }
        return mav;
    }

//    Xóa danh mục địa điểm
    @GetMapping(Constants.Url.DELETE_FOODCATEGORY)
    public ModelAndView deleteFoodCategory(HttpSession session, @PathVariable("id") int id){
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            FoodCategorys foodCategorys = foodCategory.getById(id);
            foodCategorys.setDeleted(true);
            foodCategorys.setUpdatedAt(TimeUtils.getCurrentTime());
            foodCategory.update(foodCategorys);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_FOODCATEGORY);
        return mav;
    }
}
