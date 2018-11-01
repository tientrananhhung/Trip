package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.PostCategorys;
import edu.poly.impl.PostCategoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class PostCategoryController {

    @Autowired
    PostCategoryImpl postCategory;

    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String POSTCATEGORY_SCREEN = "/admin/quanlydanhmucbaiviet/listpostcategory";
    public static final String ADD_POSTCATEGORY_SCREEN = "/admin/quanlydanhmucbaiviet/addpostcategory";


//    Return ListPostcategory
    @GetMapping(Constants.Url.LIST_POSTCATEGORY)
    public ModelAndView showPostCategoryList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }

        mav.addObject("listPostcategory", postCategory.findAllByDeleted(false));
        mav.setViewName(POSTCATEGORY_SCREEN);
        return mav;
    }

//    Return ListPostcategory
    @GetMapping(Constants.Url.ADD_POSTCATEGORY)
    public ModelAndView addPostCategory(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_POSTCATEGORY_SCREEN);
        mav.addObject("postcategory", new PostCategorys());
        mav.addObject("action", "them");
        return mav;
    }

    @PostMapping(Constants.Url.ADD_POSTCATEGORY)
    public ModelAndView addPostCategorys(HttpSession session, @ModelAttribute("postcategory") PostCategorys postCategory1) {
        ModelAndView mav = new ModelAndView();
        try{
            postCategory1.setDeleted(false);
            postCategory1.setCreatedAt(TimeUtils.getCurrentTime());
            postCategory1.setUpdatedAt(TimeUtils.getCurrentTime());
            postCategory.save(postCategory1);
            mav.addObject("listPostcategory", postCategory.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(ADD_POSTCATEGORY_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_POSTCATEGORY)
    public ModelAndView updatePostCategory(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_POSTCATEGORY_SCREEN);
        PostCategorys postCategorys = postCategory.getById(id);
        mav.addObject("postcategory", postCategorys);
        mav.addObject("action", id);
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_POSTCATEGORY)
    public ModelAndView editPostCategory(HttpSession session, @ModelAttribute("postcategory") PostCategorys postCategorys) {
        ModelAndView mav = new ModelAndView();
        PostCategorys pc = postCategory.getById(postCategorys.getId());
        try{
            postCategorys.setDeleted(pc.getDeleted());
            postCategorys.setCreatedAt(pc.getCreatedAt());
            postCategorys.setUpdatedAt(TimeUtils.getCurrentTime());
            postCategory.update(postCategorys);
            mav.addObject("listPostcategory", postCategory.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_POSTCATEGORY);
        }
        return mav;
    }

//    Delete PostCategory
    @GetMapping(Constants.Url.DELETE_POSTCATEGORY)
    public ModelAndView deletePostCategory(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        try{
            PostCategorys postCategorys = postCategory.getById(id);
            postCategorys.setDeleted(true);
            postCategorys.setUpdatedAt(TimeUtils.getCurrentTime());
            postCategory.update(postCategorys);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        return mav;
    }
}
