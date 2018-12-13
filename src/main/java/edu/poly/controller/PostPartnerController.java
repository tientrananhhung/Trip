package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.dao.PostDAO;
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
@RequestMapping(Constants.Url.MANAGEMENT_URL)
public class PostPartnerController {

    public static final String ADD_POST_SCREEN = "add-post";

    public static final String MANAGEMENT_POST_SCREEN = "management-post";

    public static final String MANAGEMENT_DELETE_POST_SCREEN = "management-delete-post";

    @Autowired
    private PostDAO postDAO;

    @Autowired
   private PostCategoryImpl postCategory;

    @Autowired
    private PostImpl post;

    @GetMapping(Constants.Url.BLOG_PARTNER_URL)
    public ModelAndView listPost(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users)session.getAttribute(Constants.SessionKey.USER);
            mav.addObject("listPost",postDAO.getAllPostDTO(users.getId(),false));
            mav.setViewName(MANAGEMENT_POST_SCREEN);
            return mav;
        } catch (Exception ex){
            mav.setViewName(MANAGEMENT_POST_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.BLOG_ADD_PARTNER_URL)
    public ModelAndView addPost(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            mav.addObject("posts",new Posts());
            mav.addObject("action","them");
            mav.addObject("listPostCategory",postCategory.findAllByDeleted(false));
            mav.setViewName(ADD_POST_SCREEN);
            return mav;
        } catch (Exception ex){
            mav.setViewName(ADD_POST_SCREEN);
            return mav;
        }
    }

    @PostMapping(Constants.Url.BLOG_ADD_PARTNER_URL)
    public ModelAndView addPost(HttpSession session, HttpServletRequest request, @ModelAttribute("posts") Posts posts) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try{
            posts.setDeleted(false);
            posts.setCreatedAt(TimeUtils.getCurrentTime());
            posts.setUpdatedAt(TimeUtils.getCurrentTime());
            posts.setView(0);
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            posts.setUserId(us.getId());
            CommonsMultipartFile[] files = posts.getFileData();
            for(int i = 0; i<files.length; i++) {
                CommonsMultipartFile file = files[i];
                if(file.isEmpty()){
                    posts.setImage("avatar.png");
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
                    String name = TimeUtils.getCurrentTime().getTime() + "_" + file.getOriginalFilename();
                    String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + name;
                    posts.setImage(name);
                    File serverFile = new File(fileSource);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                }
            }
            post.save(posts);
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
        }
        return mav;
    }

    @GetMapping(Constants.Url.BLOG_EDIT_PARTNER_URL)
    public ModelAndView editPost(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
           Posts posts = post.getById(id);
           Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(posts.getUserId() != us.getId()){
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
                return mav;
            }
            mav.addObject("posts", posts);
            mav.addObject("action","sua");
            mav.addObject("listPostCategory",postCategory.findAllByDeleted(false));
            mav.setViewName(ADD_POST_SCREEN);
            return mav;
        } catch (Exception ex){
            mav.setViewName(ADD_POST_SCREEN);
            return mav;
        }
    }

    @PostMapping(Constants.Url.BLOG_EDITED_PARTNER_URL)
    public ModelAndView editPost(HttpServletRequest request,HttpSession session, @ModelAttribute("posts") Posts posts) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        Posts ps = post.getById(posts.getId());
        Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
        if(ps.getUserId() != us.getId()){
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
            return mav;
        }
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
                    String name = TimeUtils.getCurrentTime().getTime() + "_" + file.getOriginalFilename();
                    String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + name;
                    posts.setImage(name);
                    File serverFile = new File(fileSource);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                }
            }
            post.update(posts);
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
        }catch (Exception ex){
            ex.printStackTrace();
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
        }
        return mav;
    }

    //    Delete PostCategory
    @GetMapping(Constants.Url.BLOG_DELETE_PARTNER_URL)
    public ModelAndView deletePostCategory(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try{
            Posts ps = post.getById(id);
            Users us = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(ps.getUserId() != us.getId()){
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
                return mav;
            }
            ps.setDeleted(true);
            ps.setUpdatedAt(TimeUtils.getCurrentTime());
            post.update(ps);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.BLOG_PARTNER_URL);
        return mav;
    }

    @GetMapping(Constants.Url.BLOG_DELETED_PARTNER_URL)
    public ModelAndView listDeletePost(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users)session.getAttribute(Constants.SessionKey.USER);
            mav.addObject("listPost",postDAO.getAllPostDTO(users.getId(),true));
            mav.setViewName(MANAGEMENT_DELETE_POST_SCREEN);
            return mav;
        } catch (Exception ex){
            mav.setViewName(MANAGEMENT_DELETE_POST_SCREEN);
            return mav;
        }
    }

}
