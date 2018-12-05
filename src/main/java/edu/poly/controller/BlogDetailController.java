package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.dao.FoodDetailDAO;
import edu.poly.dao.FoodInfoDAO;
import edu.poly.dao.PostIndexDAO;
import edu.poly.entity.Posts;
import edu.poly.impl.PostImpl;
import edu.poly.model.FoodDetailDTO;
import edu.poly.model.FoodInforDTO;
import edu.poly.model.PostIndexDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogDetailController {

    //Return food detail page
    public static final String BLOG_DETAIL_SCREEN = "blog-detail";

    //Return index page
    public static final String HOME_SCREEN = "index";

    @Autowired
    PostIndexDAO postIndexDAO;

    @Autowired
    PostImpl post;


    @GetMapping(Constants.Url.BLOG_DETAIL_URL)
    public ModelAndView showFoodDetail(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(BLOG_DETAIL_SCREEN);
        try {
        List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
        List<PostIndexDTO> lPostIndexDTOByView = postIndexDAO.getTop3PostByView();
        List<PostIndexDTO> lPostIndexDTOByCategoryTravel = postIndexDAO.getTop3PostByCategory(4);
        List<PostIndexDTO> lPostIndexDTOByCategoryExperience = postIndexDAO.getTop3PostByCategory(5);
        List<PostIndexDTO> lPostIndexDTOByCategoryFood = postIndexDAO.getTop3PostByCategory(6);
        mav.addObject("listPost", lPostIndexDTO);
        Posts posts = post.getById(id);
        mav.addObject("postInfo",posts);
        mav.addObject("listPostView", lPostIndexDTOByView);
        mav.addObject("listPostTravel", lPostIndexDTOByCategoryTravel);
        mav.addObject("listPostExperience", lPostIndexDTOByCategoryExperience);
        mav.addObject("listPostFood", lPostIndexDTOByCategoryFood);
        posts.setUpdatedAt(TimeUtils.getCurrentTime());
        posts.setView(posts.getView()+1);
        post.update(posts);
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }

        return mav;
    }
}
