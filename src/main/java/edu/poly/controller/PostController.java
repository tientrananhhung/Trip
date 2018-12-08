package edu.poly.controller;


import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Posts;
import edu.poly.entity.Users;
import edu.poly.impl.PostCategoryImpl;
import edu.poly.impl.PostImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
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
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_POST_SCREEN);
        try{
            Posts posts = new Posts();
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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            posts.setDeleted(false);
            posts.setCreatedAt(TimeUtils.getCurrentTime());
            posts.setUpdatedAt(TimeUtils.getCurrentTime());
            posts.setView(0);
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            posts.setUserId(us.getId());
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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        mav.setViewName(ADD_POST_SCREEN);
        Posts ps = post.getById(id);
        mav.addObject("posts",ps);
        mav.addObject("listPostCategory",postCategory.findAllByDeleted(false));
        mav.addObject("action", "sua");
        return mav;
    }

    @PostMapping(Constants.Url.UPDATED_POST)
    public ModelAndView editPost(HttpServletRequest request,HttpSession session, @ModelAttribute("posts") Posts posts) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        Posts ps = post.getById(posts.getId());
        try{
            posts.setDeleted(ps.getDeleted());
            posts.setCreatedAt(ps.getCreatedAt());
            posts.setUpdatedAt(TimeUtils.getCurrentTime());
            posts.setView(ps.getView());
            posts.setUserId(ps.getUserId());
            CommonsMultipartFile[] files = posts.getFileData();
                for(int i = 0; i<files.length; i++) {
                    CommonsMultipartFile file = files[i];
                    if(file.isEmpty()){
                        posts.setImage(ps.getImage());
                    } else {
                        byte[] bytes = file.getBytes();
                        // Creating the directory to store file
                        // Assume uploaded file location on web server is D:\file-upload
                        String appPath = request.getServletContext().getRealPath("");
                        appPath = appPath.replace('\\', '/');
                        File dir = new File(appPath);
                        if (!dir.exists()) {
                            dir.mkdirs();
                        }
                        // Create the file on server
                        String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + "post_" + posts.getId() + "." + file.getOriginalFilename().split("\\.")[1];
                        posts.setImage("post_" + posts.getId() + "." + file.getOriginalFilename().split("\\.")[1]);
                        File serverFile = new File(fileSource);
                        BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                        stream.write(bytes);
                        stream.close();
                    }
            }
            post.update(posts);
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
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
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
