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
import java.sql.Timestamp;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class PostCategoryController {

    @Autowired
    PostCategoryImpl postCategory;

    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String POSTCATEGORY_SCREEN = "/admin/quanlydanhmucbaiviet/listPostCategory";
    public static final String ADD_POSTCATEGORY_SCREEN = "/admin/quanlydanhmucbaiviet/addPostCategory";

    @GetMapping(Constants.Url.LIST_POSTCATEGORY)
    public ModelAndView showPostCategoryList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }

//        mav.addObject("listPostcategory", postCategory.getAllByDelete(false));
        mav.setViewName(POSTCATEGORY_SCREEN);
        return mav;
    }

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
        postCategory1.getCreatedAt(TimeUtils.getCurrentTime());
//        postCategory.save(postCategory1);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_POSTCATEGORY)
    public ModelAndView updatePostCategory(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_POSTCATEGORY_SCREEN);
//        PostCategory postCategorys = postCategory.getById(id);
//        mav.addObject("postcategory", postCategorys);
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATE_POSTCATEGORY)
    public ModelAndView editPostCategory(HttpSession session, @ModelAttribute("postcategory") PostCategorys postCategorys) {
        ModelAndView mav = new ModelAndView();
        postCategorys.setUpdatedAt((Timestamp) TimeUtils.getCurrentTime());
//        postCategory.save(postCategorys);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        return mav;
    }

    @GetMapping(Constants.Url.DELETE_POSTCATEGORY)
    public ModelAndView deletePostCategory(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        postCategory.deleteById(id);
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_POSTCATEGORY);
        return mav;
    }
}
