package edu.poly.controller;


import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Posts;
import edu.poly.impl.PostCategoryImpl;
import edu.poly.impl.PostImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class PostController {
    public static final String ADMIN_SCREEN = "/admin/index";

    public static final String LIST_POST_SCREEN = "/admin/quanlybaiviet/listpost";

    public static final String ADD_POST_SCREEN = "/admin/quanlybaiviet/addpost";

    @Autowired
    PostImpl post;

    @Autowired
    PostCategoryImpl postCategory;

    /**
     * return url /admin/quan-ly-tour
     * */
    @GetMapping(Constants.Url.LIST_POST)
    public ModelAndView showUserList(HttpSession session) {
        ModelAndView mav = new ModelAndView();

//        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
//
        mav.addObject("listPost",post.findAllByDeleted(false));
        mav.setViewName(LIST_POST_SCREEN);
        return mav;
    }

    /**
     * return url /admin/quan-ly-tour/them
     *
     * */
    @GetMapping(Constants.Url.ADD_POST)
    public ModelAndView addUser(HttpSession session) {
        //        if(!CheckSession.admin(session)){
//            mav.setViewName("redirect:/"+Constants.Characters.BLANK);
//            return mav;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_POST_SCREEN);
        try{
            Posts posts = new Posts();
            System.out.println(posts.getContent());
            System.out.println(posts.getTitle());
            mav.addObject("posts", posts);

        } catch (Exception ex){
            ex.printStackTrace();
        }
        mav.addObject("listPostCategory",postCategory.findAllByDeleted(false));
        mav.addObject("action", "them");

        return mav;
    }

    @PostMapping(Constants.Url.ADD_POST)
    public ModelAndView addPostCategorys(HttpSession session, @ModelAttribute("posts") Posts posts) {
        ModelAndView mav = new ModelAndView();
        try{
            posts.setDeleted(false);
            posts.setCreatedAt(TimeUtils.getCurrentTime());
            posts.setUpdatedAt(TimeUtils.getCurrentTime());
            posts.setView(0);
            posts.setUserId(1);
            post.save(posts);
            mav.addObject("listPost", post.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_POST);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(ADD_POST_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.UPDATE_POST)
    public ModelAndView updatePost(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName(ADD_POST_SCREEN);
        Posts ps = post.getById(id);
        mav.addObject("posts",ps);
        mav.addObject("listPostCategory",postCategory.findAllByDeleted(false));
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATED_POST)
    public ModelAndView editPost(HttpSession session, @ModelAttribute("posts") Posts posts) {
        ModelAndView mav = new ModelAndView();
        Posts ps = post.getById(posts.getId());
        try{
            posts.setDeleted(ps.getDeleted());
            posts.setCreatedAt(ps.getCreatedAt());
            posts.setUpdatedAt(TimeUtils.getCurrentTime());
            posts.setView(ps.getView());
            posts.setUserId(ps.getUserId());
            post.update(posts);
            mav.addObject("listPost", post.findAllByDeleted(false));
            mav.setViewName("redirect:/admin" + Constants.Url.LIST_POST);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName(Constants.Url.UPDATE_POST);
        }
        return mav;
    }

    //    Delete PostCategory
    @GetMapping(Constants.Url.DELETE_POST)
    public ModelAndView deletePostCategory(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        try{
            Posts ps = post.getById(id);
            ps.setDeleted(true);
            ps.setUpdatedAt(TimeUtils.getCurrentTime());
            post.update(ps);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_POST);
        return mav;
    }
}
