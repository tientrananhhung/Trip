package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.dao.*;
import edu.poly.entity.*;
import edu.poly.impl.*;
import edu.poly.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
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
    ServiceImpl service;

    @Autowired
    OfferImpl offer;

    @Autowired
    RateTourDetailDAO rateTourDetailDAO;

    @Autowired
    private UserStatisticsDAO userStatisticsDAO;

    @Autowired
    private PartnerStatisticsDAO partnerStatisticsDAO;

    @Autowired
    private OfferStatisticsDAO offerStatisticsDAO;

    @Autowired

    private PostStatisticsDAO postStatisticsDAO;

    @Autowired
    private  PostCountStatisticsDAO postCountStatisticsDAO;

//    @Autowired
//    private UserStatisticsDAO userStatisticsDAO;

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
    public ResponseEntity<List<RateTourDetailDTO>> getPostAPI(@PathVariable("id") int id, @PathVariable("page") int page) {
        try {
            page = page * 10;
            List<RateTourDetailDTO> listDTO = rateTourDetailDAO.getPageRateDTO(id, page);
            ResponseEntity<List<RateTourDetailDTO>> responseEntity = new ResponseEntity<List<RateTourDetailDTO>>(listDTO, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<RateTourDetailDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.USER_STATISTICS, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<UserStatisticsDTO>> userstaticstic(@PathVariable("year") Integer year) {
        try {
            List<UserStatisticsDTO> list = (List<UserStatisticsDTO>) userStatisticsDAO.getAllUserStatisticsDTO(year);
            ResponseEntity<List<UserStatisticsDTO>> responseEntity = new ResponseEntity<List<UserStatisticsDTO>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<UserStatisticsDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.PARNER_STATISTICS, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<PartnerStatisticsDTO>> partnerstaticstic(@PathVariable("month") String month, @PathVariable("year") Integer year) {
        try {
            List<PartnerStatisticsDTO> list = (List<PartnerStatisticsDTO>) partnerStatisticsDAO.getAllPartnerStatisticsDTO(month, year);
            ResponseEntity<List<PartnerStatisticsDTO>> responseEntity = new ResponseEntity<List<PartnerStatisticsDTO>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<PartnerStatisticsDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.OFFER_STATISTICS, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<OfferStatisticsDTO>> offerstaticstic(@PathVariable("month") String month, @PathVariable("year") Integer year) {
        try {
            List<OfferStatisticsDTO> list = (List<OfferStatisticsDTO>) offerStatisticsDAO.getAllOfferStatisticsDTO(month, year);
            ResponseEntity<List<OfferStatisticsDTO>> responseEntity = new ResponseEntity<List<OfferStatisticsDTO>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<OfferStatisticsDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.POST_STATISTICS, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<PostStatisticsDTO>> poststaticstic(@PathVariable("year") Integer year) {
        try {
            List<PostStatisticsDTO> list = (List<PostStatisticsDTO>) postStatisticsDAO.getAllPostStatisticsDTO(year);
            ResponseEntity<List<PostStatisticsDTO>> responseEntity = new ResponseEntity<List<PostStatisticsDTO>>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<List<PostStatisticsDTO>>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = Constants.Url.POST_COUNT_STATISTICS, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<PostCountStatisticsDTO> postcountstaticstic(@PathVariable("year") String year,@PathVariable("month") String month ) {
        try {
            PostCountStatisticsDTO list = postCountStatisticsDAO.getPostCountStatisticsDTO(month,year);
            ResponseEntity<PostCountStatisticsDTO> responseEntity = new ResponseEntity<PostCountStatisticsDTO>(list, HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<PostCountStatisticsDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(path = Constants.Url.POST_PROCESS_ORDER_URL, produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> postOrder(@PathVariable("sId") Integer sId, @PathVariable("uId") Integer uId, @RequestParam String dataJson) {
        try {
            Services services = service.findServiceById(sId);
            Users users = user.getById(uId);
            Offers offers = new Offers();
            String ck = "";
            ResponseEntity<String> responseEntity = new ResponseEntity<>(ck, HttpStatus.OK);
            return responseEntity;
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(Constants.Url.POST_IMAGES_TOUR_URL)
    public ArrayList<String> uploadImage(HttpServletRequest request, @ModelAttribute("product") Product product, HttpSession session){
        if(CheckSession.partner(session)){
            return new ArrayList<>();
        }
        try {
            CommonsMultipartFile[] files = product.getFileData();
            ArrayList<String> listImg = new ArrayList<>();
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];

                if (file.isEmpty()) {
                    return new ArrayList<>();
                }

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
                String name = TimeUtils.getCurrentTime().getTime() + "_" + file.getOriginalFilename();
                String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + name;
                listImg.add(name);
                File serverFile = new File(fileSource);
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
            }
            return listImg;
        }catch(Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
