package edu.poly.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.poly.common.*;
import edu.poly.dao.*;
import edu.poly.entity.*;
import edu.poly.impl.*;
import edu.poly.model.*;
import edu.poly.valaditor.PartnerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    //Return blog page
    public static final String BLOG_SCREEN = "blog";

    //Return index page
    public static final String HOME_SCREEN = "index";

    //Return category blog page
    public static final String CATEGORY_BLOG_SCREEN = "category-blog";




    public static final String ADMIN_SCREEN = "admin";

    public static final String PROCESSING_ORDER = "processing-order";

    public static final String REGISTER_PARTNER_SCREEN = "partner";


    //Return tour detail page
    public static final String TOUR_DETAIL_SCREEN = "tour-detail";


    //Return error 500 page
    public static final String ERROR500 = "error500";

    @Autowired
    TourImpl tour;

    @Autowired
    TourDAO tourDAO;

    @Autowired
    FoodDAO foodDAO;

    @Autowired
    UserImpl user;

    @Autowired
    ServiceImpl service;

    @Autowired
    OfferImpl offer;

    @Autowired
    OrderImpl order;

    @Autowired
    PostIndexDAO postIndexDAO;

    @Autowired
    TourDetailDAO tourDetailDAO;

    @Autowired
    PartnerImpl partner;

    @Autowired
    PartnerValidator partnerValidator;

    @Autowired
    PostCategoryDAO postCategoryDAO;


    public static final String INDEX_SCREEN = "index";
    public static final String PROCESSING_ORDER_SCREEN = "processing-order";


    @GetMapping(Constants.Characters.BLANK)
    public ModelAndView index(HttpSession session, HttpServletRequest rq) {
        ModelAndView mav = new ModelAndView(HOME_SCREEN);
        try {
//            rq.getSession().setAttribute("login", new Users());
//            mav.addObject("login", new Users());
            List<TourDTO> lTourDTO = tourDAO.getAllTourDTO();
            List<TourDTO> lTourTop3New = tourDAO.getTop3TourDTO();
            List<FoodDTO> lFoodDTO = foodDAO.getAllFoodDTO();
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            mav.addObject("listTour", lTourDTO);
            mav.addObject("lTourTop3New", lTourTop3New);
            mav.addObject("listFood", lFoodDTO);
            mav.addObject("listPost", lPostIndexDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    @GetMapping(Constants.Url.BLOG_URL)
    public ModelAndView showBlog() {
        ModelAndView mav = new ModelAndView(BLOG_SCREEN);
        try {
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            List<PostIndexDTO> lPostIndexDTOByView = postIndexDAO.getTop3PostByView();
            List<PostIndexDTO> lPostIndexDTOByCategoryTravel = postIndexDAO.getTop3PostByCategory(4);
            List<PostIndexDTO> lPostIndexDTOByCategoryExperience = postIndexDAO.getTop3PostByCategory(5);
            List<PostIndexDTO> lPostIndexDTOByCategoryFood = postIndexDAO.getTop3PostByCategory(6);
            List<PostCategoryDTO> categoryDTOList = postCategoryDAO.getAllPostCategory();
            mav.addObject("listCategoryPost", categoryDTOList);
            mav.addObject("listPost", lPostIndexDTO);
            mav.addObject("listPostView", lPostIndexDTOByView);
            mav.addObject("listPostTravel", lPostIndexDTOByCategoryTravel);
            mav.addObject("listPostExperience", lPostIndexDTOByCategoryExperience);
            mav.addObject("listPostFood", lPostIndexDTOByCategoryFood);
        } catch (Exception e) {
            e.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.CATEGORY_BLOG_URL)
    public ModelAndView showCategoryBlog(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(CATEGORY_BLOG_SCREEN);
        try{
            List<BlogDTO> categoryDTOList = postCategoryDAO.getTop5ViewPost(id);
            List<BlogDTO> getAllPostCategory4 = postCategoryDAO.getPostCategoryByID(id);
            List<PostCategoryDTO> categoryList = postCategoryDAO.getAllPostCategory();
            List<PostIndexDTO> lPostIndexDTOByView = postIndexDAO.getTop3PostByView();
            List<PostIndexDTO> lPostIndexDTO = postIndexDAO.getTop5PostNew();
            mav.addObject("listPost", lPostIndexDTO);
            mav.addObject("listPostView", lPostIndexDTOByView);
            mav.addObject("lPostTop5Category", categoryDTOList);
            mav.addObject("lAllCategory", getAllPostCategory4);
            mav.addObject("catePostlist",categoryList);
        }catch (Exception e){
            e.printStackTrace();
            mav.setViewName(HOME_SCREEN);
        }
        return mav;
    }

    @GetMapping(Constants.Url.TOUR_DETAIL_URL)
    public ModelAndView showTourDetail(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView(TOUR_DETAIL_SCREEN);
        try {
            List<TourDetailDTO> listDTO = tourDetailDAO.getTourDetailDTO(id);
            mav.addObject("listTourDetail", listDTO);
        } catch (Exception e) {
            mav.setViewName(HOME_SCREEN);
            e.printStackTrace();
        }
        return mav;
    }

    @GetMapping(Constants.Url.ACTIVE_USER_TOKEN)
    public ModelAndView activeUser(@PathVariable("token") String token, HttpSession session) {
        Users us = user.getByToken(token);
        us.setToken("");
        us.setActive(true);
        user.update(us);
        session.setAttribute(Constants.SessionKey.USER, us);
        ModelAndView mav = new ModelAndView("redirect:/");
        return mav;
    }

    @PostMapping(Constants.Url.POST_PROCESSING_ORDER_URL)
    public ModelAndView showOrder(@RequestParam String dataJson, @PathVariable("sId") int id, HttpServletRequest request) {

        ModelAndView mav = new ModelAndView();

        ObjectMapper objectMapper = new ObjectMapper();

        Services services = service.findServiceById(id);

        try {
            JsonNode jsonNode = objectMapper.readTree(dataJson);
            JsonNode jsonTicket = jsonNode.get("ticketDetail");

            ProcessOrderDTO processOrderDTO = new ProcessOrderDTO();

            List<TicketDetailDTO> listTicketDetailDTO = new ArrayList<>();

            for (int i = 0; i < jsonTicket.size(); i++) {
                TicketDetailDTO ticketDetailDTO = new TicketDetailDTO();
                ticketDetailDTO.setNameTicket(jsonTicket.get(i).get("nameTicket").asText());
                ticketDetailDTO.setPriceTicket(jsonTicket.get(i).get("priceTicket").asText());
                ticketDetailDTO.setQuantityTicket(jsonTicket.get(i).get("quantityTicket").asInt());
                listTicketDetailDTO.add(ticketDetailDTO);
            }

            processOrderDTO.setNameService(jsonNode.get("nameService").asText());
            processOrderDTO.setDateTicket(jsonNode.get("dateTicket").asText());
            processOrderDTO.setPicture(jsonNode.get("picture").asText());
            processOrderDTO.setTourId(jsonNode.get("tourId").asInt());
            processOrderDTO.setTour(jsonNode.get("tour").asText());
            processOrderDTO.setTotalPrice(jsonNode.get("totalPrice").asText());
            processOrderDTO.setTicketDetail(listTicketDetailDTO);
            processOrderDTO.setServices(services);

            // Tạo session
            if (request.getSession().getAttribute(Constants.SessionKey.ORDER_SESSION) != null) {
                request.getSession().removeAttribute(Constants.SessionKey.ORDER_SESSION);
            }

            request.getSession().setAttribute(Constants.SessionKey.ORDER_SESSION, processOrderDTO);

            mav.setViewName("redirect:" + Constants.Url.GET_PROCESSING_ORDER_URL);

        } catch (IOException ex) {
            ex.printStackTrace();
            mav.setViewName("redirect:/");
        }

        return mav;
    }

    @GetMapping(Constants.Url.GET_PROCESSING_ORDER_URL)
    public ModelAndView showProcessOrder(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView(PROCESSING_ORDER_SCREEN);
        Users users = (Users) request.getSession().getAttribute(Constants.SessionKey.USER);
        if (users != null) {
            List<Offers> offers = offer.getAllByUserId(users.getId());
            mav.addObject(Constants.Attribute.OFFER_ATTRIBUTE, offers);
        } else {
            Users login = new Users();
            mav.addObject(Constants.Attribute.LOGIN_ATTRIBUTE, login);
        }
        return mav;
    }

    @PostMapping(Constants.Url.POST_LOGIN_PROCESS_ORDER_URL)
    public ModelAndView loginProcessOrder(@ModelAttribute("login") Users users, HttpServletRequest rq) {
        ModelAndView mav = new ModelAndView();
        Users login = new Users();
        Users userLogin = user.login(users.getUsername(), PasswordUtils.md5(users.getPassword()));
        if (userLogin != null) {
            mav.setViewName("redirect:" + Constants.Url.GET_PROCESSING_ORDER_URL);
            rq.getSession().setAttribute(Constants.SessionKey.USER, userLogin);
        } else {
            mav.addObject(Constants.Attribute.NOTIFY_ATTRIBUTE, "Tài khoản hoặc mật khẩu không chính xác!");
            login.setUsername(users.getUsername());
            mav.addObject(Constants.Attribute.LOGIN_ATTRIBUTE, login);
            mav.setViewName(PROCESSING_ORDER);
        }
        return mav;
    }

    @PostMapping(Constants.Url.POST_PROCESS_ORDER_URL)
    public ModelAndView showOrder(@RequestParam String dataJson, @PathVariable("sId") int sId, @PathVariable("uId") int uId, HttpServletRequest request) {

        ModelAndView mav = new ModelAndView();

        ObjectMapper objectMapper = new ObjectMapper();

        Services services = service.findServiceById(sId);
        Users users = user.getById(uId);

        try {
            JsonNode jsonNode = objectMapper.readTree(dataJson);
            JsonNode jsonTicket = jsonNode.get("ticketDetail");

            String data = "";
            data = data + "note:" + jsonNode.get("note").asText() + ",";
            data = data + "phoneUser:" + jsonNode.get("phoneUser").asText() + ",";
            data = data + "serviceName:" + jsonNode.get("serviceName").asText() + ",";
            data = data + "serviceDate:" + jsonNode.get("serviceDate").asText() + ",";
            data = data + "totalPrice:" + jsonNode.get("totalPrice").asText() + ",";
            data = data + "totalPriceAfter:" + jsonNode.get("totalPriceAfter").asText() + ",";
            data = data + "voucherId:" + jsonNode.get("voucherId").asText() + ",";
            data = data + "voucherCode:" + jsonNode.get("voucherCode").asText() + ",";
            data = data + "voucherPrice:" + jsonNode.get("voucherPrice").asText() + ",";
            data = data + "ticketDetail:[";
            for (int i = 0; i < jsonTicket.size(); i++) {
                data = data + "{nameTicket:" + jsonTicket.get(i).get("nameTicket").asText() + ",";
                data = data + "priceTicket:" + jsonTicket.get(i).get("priceTicket").asText() + ",";
                data = data + "quantityTicket:" + jsonTicket.get(i).get("quantityTicket").asText() + "}";
                if (i != jsonTicket.size() - 1) {
                    data = data + ";";
                } else {
                    data = data + "]";
                }
            }

            Orders orders = new Orders();
            orders.setServiceId(sId);
            orders.setServicesByServiceId(services);
            orders.setUserId(uId);
            orders.setUsersByUserId(users);
            orders.setData(data);
            orders.setPayment(jsonNode.get("payment").asInt());
            orders.setDeleted(false);
            orders.setPurchased(false);
            orders.setCreatedAt(TimeUtils.getCurrentTime());
            orders.setUpdatedAt(TimeUtils.getCurrentTime());

            order.save(orders);

            mav.setViewName("redirect:/");

        } catch (IOException ex) {
            ex.printStackTrace();
            mav.setViewName("redirect:/" + Constants.Url.GET_PROCESSING_ORDER_URL);
        }
        return mav;
    }

    @GetMapping(Constants.Url.REGISTER_PARNER)
    public ModelAndView showRegisterParnerPage(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("partner", new Partners());
        mav.setViewName(REGISTER_PARTNER_SCREEN);
        return mav;
    }

    @PostMapping(Constants.Url.REGISTER_PARNER)
    public ModelAndView addPartner(HttpSession session, @Validated @ModelAttribute("partner") Partners partners, BindingResult result) {
        ModelAndView mav = new ModelAndView();
        if (result.hasErrors()) {
            mav.setViewName(REGISTER_PARTNER_SCREEN);
            return mav;
        }
//        if (!CheckSession.admin(session)) {
//            mav.setViewName("redirect:" + Constants.Url.LOGIN);
//            return mav;
//        }
        try {
            partners.setCreatedAt(TimeUtils.getCurrentTime());
            partners.setUpdatedAt(TimeUtils.getCurrentTime());
            partners.setActived(false);
            partners.setDeleted(false);
            Users users = (Users) session.getAttribute("userInfo");
            partners.setUserId(users.getId());
            partner.save(partners);
            user.updateRoleUser(2, users.getId());
            mav.setViewName("redirect:/");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mav;
    }
}