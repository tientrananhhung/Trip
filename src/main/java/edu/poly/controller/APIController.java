package edu.poly.controller;

import edu.poly.common.Constants;
import edu.poly.dao.RateTourDetailDAO;
import edu.poly.dao.UserStatisticsDAO;
import edu.poly.entity.Posts;
import edu.poly.entity.Rates;
import edu.poly.entity.Tours;
import edu.poly.impl.PostImpl;
import edu.poly.impl.RateImpl;
import edu.poly.impl.TourImpl;
import edu.poly.impl.UserImpl;
import edu.poly.model.RateTourDetailDTO;
import edu.poly.model.UserStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Constants.Url.API_URL)
public class APIController {

    @Autowired
    UserImpl user;

    @Autowired
    PostImpl post;

    @Autowired
    TourImpl tour;

    @Autowired
    RateImpl rate;

    @Autowired
    RateTourDetailDAO rateTourDetailDAO;

    @Autowired
    private UserStatisticsDAO userStatisticsDAO;

    @GetMapping(path = "/abcd", produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Posts>> abc() {
        try {
            List<Posts> list = (List<Posts>) post.findAll();
            ResponseEntity<List<Posts>> responseEntity = new ResponseEntity<List<Posts>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<Posts>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.PAGING_POST_URL, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Posts>> getPostAPI(@PathVariable("page") int page) {
        try {
            Pageable pageable = new PageRequest(page, 5);
            Page<Posts> paging = post.findAll(pageable);
            List<Posts> list = paging.getContent();
            ResponseEntity<List<Posts>> responseEntity = new ResponseEntity<List<Posts>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<Posts>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.PAGING_RATE_TOUR_DETAIL_URL, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<RateTourDetailDTO>> getPostAPI(@PathVariable("id") int id, @PathVariable("page") int page){
        try {
            page = page * 10;
            List<RateTourDetailDTO> listDTO = rateTourDetailDAO.getPageRateDTO(id, page);
            ResponseEntity<List<RateTourDetailDTO>> responseEntity = new ResponseEntity<List<RateTourDetailDTO>>(listDTO, HttpStatus.OK);
            return responseEntity;
        } catch(Exception e){
            return new ResponseEntity<List<RateTourDetailDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "/userstaticstic", produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<UserStatisticsDTO>> userstaticstic() {
        try {
            List<UserStatisticsDTO> list = (List<UserStatisticsDTO>) userStatisticsDAO.getAllUserStatisticsDTO();
            ResponseEntity<List<UserStatisticsDTO>> responseEntity = new ResponseEntity<List<UserStatisticsDTO>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<UserStatisticsDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

}
