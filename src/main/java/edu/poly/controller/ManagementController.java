package edu.poly.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.poly.common.*;
import edu.poly.dao.ManagementTourDAO;
import edu.poly.dao.OrderDAO;
import edu.poly.dao.TourPartnerDAO;
import edu.poly.entity.*;
import edu.poly.impl.*;
import edu.poly.model.ManagementTourDTO;
import edu.poly.model.OrderDTO;
import edu.poly.model.TourPartnerDTO;
import edu.poly.valaditor.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.MANAGEMENT_URL)
public class ManagementController {

    public static final String INDEX_SCREEN = "index";

    public static final String INFOMATION_SCREEN = "infomation";

    public static final String MANAGEMENT_TOUR_SCREEN = "management-tour";

    public static final String MANAGEMENT_ORDER_SCREEN = "management-order";

    public static final String MANAGEMENT_DELETE_ORDER_SCREEN = "management-delete-order";

    public static final String MANAGEMENT_PURCHASE_ORDER_SCREEN = "management-purchase-order";

    public static final String MANAGEMENT_PARTNER_ORDER_SCREEN = "management-partner-order";

    public static final String MANAGEMENT_PARTNER_DELETE_ORDER_SCREEN = "management-partner-delete-order";

    public static final String MANAGEMENT_PARTNER_PURCHASE_ORDER_SCREEN = "management-partner-purchase-order";

    public static final String MANAGEMENT_TOUR_DETAIL_SCREEN = "management-tour-detail";

    @Autowired
    ManagementTourDAO managementTourDAO;

    @Autowired
    private TourPartnerDAO tourPartnerDAO;

    @Autowired
    private UserImpl user;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private OfferImpl offer;

    @Autowired
    private TourImpl tour;

    @Autowired
    private ServiceImpl service;

    @Autowired
    private TicketImpl ticket;


    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
        binder.addValidators(userValidator);
    }

    @GetMapping(Constants.Url.PROFILE_URL)
    public ModelAndView managementInformation(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
        mav.addObject("userInfo", users);
        mav.setViewName(INFOMATION_SCREEN);
        return mav;
    }

    @GetMapping(Constants.Url.MANAGEMENT_TOUR_URL)
    public ModelAndView managementTour(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        List<ManagementTourDTO> managementTourDTO = managementTourDAO.getTourDTOById(users.getId());

        mav.setViewName(MANAGEMENT_TOUR_SCREEN);
        mav.addObject("listTour", managementTourDTO);
        return mav;
    }

    @GetMapping(Constants.Url.MANAGEMENT_DELETE_ORDER_URL)
    public ModelAndView managementDeleteOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrder(users.getId());
            List<OrderDTO> managementOrderDTO = orderDAO.getListOrderCustomerDTODeleted(users.getId());
            mav.setViewName(MANAGEMENT_DELETE_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_DELETE_ORDER_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.MANAGEMENT_PURCHASE_ORDER_URL)
    public ModelAndView managementPurchaseOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrder(users.getId());
            List<OrderDTO> managementOrderDTO = orderDAO.getListPurchaseOrderCustomerDTO(users.getId());
            mav.setViewName(MANAGEMENT_PURCHASE_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_PURCHASE_ORDER_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.MANAGEMENT_ORDER_URL)
    public ModelAndView managementOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrder(users.getId());
            List<OrderDTO> managementOrderDTO = orderDAO.getListOrderCustomerDTO(users.getId());
            mav.setViewName(MANAGEMENT_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_ORDER_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.MANAGEMENT_PARTNER_ORDER_URL)
    public ModelAndView managementPartnerOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrderAdmin();
            List<OrderDTO> managementOrderDTO = orderDAO.getListOrderPartnerDTO(users.getId());
            mav.setViewName(MANAGEMENT_PARTNER_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_PARTNER_ORDER_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.MANAGEMENT_PARTNER_DELETE_ORDER_URL)
    public ModelAndView managementPartnerDeleteOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrderAdmin();
            List<OrderDTO> managementOrderDTO = orderDAO.getListDeleteOrderPartnerDTO(users.getId());
            mav.setViewName(MANAGEMENT_PARTNER_DELETE_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_PARTNER_DELETE_ORDER_SCREEN);
            return mav;
        }
    }

    @GetMapping(Constants.Url.MANAGEMENT_PARTNER_PURCHASE_ORDER_URL)
    public ModelAndView managementPartnerPurchaseOrder(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            orderDAO.deleteOrderAdmin();
            List<OrderDTO> managementOrderDTO = orderDAO.getListPurchaseOrderPartnerDTO(users.getId());
            mav.setViewName(MANAGEMENT_PARTNER_PURCHASE_ORDER_SCREEN);
            mav.addObject("listOrder", managementOrderDTO);
            return mav;
        } catch (Exception ex) {
            ex.printStackTrace();
            mav.setViewName(MANAGEMENT_PARTNER_PURCHASE_ORDER_SCREEN);
            return mav;
        }
    }


    @GetMapping(Constants.Url.PURCHASE_PARTNER_ORDER)
    public ModelAndView purchaseOrder(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            OrderDTO orderDTO = orderDAO.getOrderDTO(id);
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(orderDTO.getPartnerid() != users.getId()){
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }
            orderDAO.updatePurchaseOrder(true, id);
            mailTest.mailSend(orderDTO.getUserEmail(), MailContent.PURCHASED(orderDTO), "Thanh Toán Thành Công");
            String totalPriceAfter1 = orderDTO.getTotalPriceAfter();
            Integer totalPriceAfter = Integer.parseInt(totalPriceAfter1);
            if (totalPriceAfter > 2000000) {
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(250000);
                offers.setUserId(orderDTO.getUserid());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            } else if (totalPriceAfter > 1000000) {
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(100000);
                offers.setUserId(orderDTO.getUserid());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            } else if (totalPriceAfter > 500000) {
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(50000);
                offers.setUserId(orderDTO.getUserid());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            }
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PARTNER_ORDER_URL);
            return mav;
        } catch (Exception ex) {
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PARTNER_ORDER_URL);
            return mav;
        }
    }

    @GetMapping(Constants.Url.REFUND_PARTNER_ORDER)
    public ModelAndView refundOrder(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            OrderDTO orderDTO = orderDAO.getOrderDTO(id);
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(orderDTO.getPartnerid() != users.getId()){
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }
            orderDAO.updatePurchaseOrder(false, id);
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PARTNER_DELETE_ORDER_URL);
            return mav;
        } catch (Exception ex) {
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PARTNER_DELETE_ORDER_URL);
            return mav;
        }
    }

    @GetMapping(Constants.Url.DELETE_ORDER_CUSTOMER)
    public ModelAndView deleteOrder(HttpSession session, @PathVariable("id") Integer id, @PathVariable("purchase") boolean purchase) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.isLogin(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        try {
            OrderDTO orderDTO = orderDAO.getOrderDTO(id);
            Users users = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(orderDTO.getPartnerid() != users.getId()){
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }
          Date date = new Date();
            if(date.getTime() - orderDTO.getOrderDate().getTime() >  orderDTO.getPolicy()){
                if (purchase == true) {
                    mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PURCHASE_ORDER_URL);
                } else {
                    mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_ORDER_URL);
                }
                return mav;
            }
            orderDAO.deleteCustomerOrder(id);
            if (purchase == true) {
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PURCHASE_ORDER_URL);
            } else {
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_ORDER_URL);
            }
            return mav;
        } catch (Exception ex) {
            if (purchase == true) {
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_PURCHASE_ORDER_URL);
            } else {
                mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_ORDER_URL);
            }
            return mav;
        }
    }

    @PostMapping(Constants.Url.CHANGE_CUSTOMER_INFORMATION)
    public ModelAndView registerCustomer(HttpServletRequest request, @Validated @ModelAttribute(Constants.SessionKey.USER) Users users, BindingResult result, HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if(!CheckSession.isLogin(session)){
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        if (result.hasErrors()) {
            mav.setViewName(INFOMATION_SCREEN);
            return mav;
        }
        try {
            Users us = user.getById(users.getId());
            Users us1 = (Users) session.getAttribute(Constants.SessionKey.USER);
            if(us.getId() != us1.getId()){
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }
            CommonsMultipartFile[] files = users.getFileData();
            for (int i = 0; i < files.length; i++) {
                CommonsMultipartFile file = files[i];
                if (file.isEmpty()) {
                    us.setAvatar(us.getAvatar());
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
                    String fileSource = dir.getAbsolutePath() + File.separator + "resources" + File.separator + "images" + File.separator + file.getOriginalFilename();
                    us.setAvatar(file.getOriginalFilename());
                    File serverFile = new File(fileSource);
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                    stream.write(bytes);
                    stream.close();
                }
            }
            us.setName(users.getName());
            us.setPhone(users.getPhone());
            us.setEmail(users.getEmail());
            us.setGender(users.getGender());
            us.setBirthday(users.getBirthday());
            us.setAddress(users.getAddress());
            us.setUpdatedAt(TimeUtils.getCurrentTime());
            user.update(us);
            session.setAttribute(Constants.SessionKey.USER, us);
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.PROFILE_URL);
            return mav;
        } catch (Exception ex) {
            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.PROFILE_URL);
            return mav;
        }
    }

    /**
     * Code for show tour detail get by id
     * @param session for get current session
     * @param id      for get tour's id
     * @return page add tour of partner if tour
     */
    @GetMapping(Constants.Url.GET_MANAGEMENT_TOUR_URL)
    public ModelAndView showTourDetail(HttpSession session, @PathVariable("id") Integer id) {
        ModelAndView mav = new ModelAndView();

        //Check ss partner
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        try {
            List<TourPartnerDTO> listDTO = tourPartnerDAO.getTourByIdDTO(id);

            if (users.getId() != listDTO.get(0).getUserId()) {
                mav.setViewName("redirect:/" + Constants.Characters.BLANK);
                return mav;
            }

            mav.addObject("listTour", listDTO);

            mav.setViewName(MANAGEMENT_TOUR_DETAIL_SCREEN);
            return mav;
        } catch (Exception e) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
    }

    /**
     * @return page add tour of partner
     */
    @GetMapping(Constants.Url.ADD_MANAGEMENT_TOUR_URL)
    public ModelAndView showAddTour(HttpSession session) {
        ModelAndView mav = new ModelAndView();

        //Check ss partner
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        mav.setViewName(MANAGEMENT_TOUR_DETAIL_SCREEN);
        return mav;
    }

    /**
     * @param session  for get id user and check
     * @param dataJson post data for controller
     */
    @PostMapping(Constants.Url.POST_MANAGEMENT_TOUR_URL)
    public ModelAndView postTourPartner(HttpSession session, @RequestParam String dataJson) {
        ModelAndView mav = new ModelAndView();

        //Check ss partner
        if (!CheckSession.partner(session)) {
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }

        ObjectMapper objectMapper = new ObjectMapper();

        Users users = (Users) session.getAttribute(Constants.SessionKey.USER);

        try {
            JsonNode jsonNode = objectMapper.readTree(dataJson);
            JsonNode jsonService = jsonNode.get("ticketDetail");

            Collection<Services> servicesById = new ArrayList<>();
            Collection<Tickets> ticketsById = new ArrayList<>();

            Integer idTour = jsonNode.get("idTour").asInt();
            String nameTour = jsonNode.get("nameTour").asText();
            String address = jsonNode.get("address").asText();
            String lat = jsonNode.get("lat").asText();
            String lng = jsonNode.get("lng").asText();
            Integer policy = jsonNode.get("policy").asInt();
            String content = jsonNode.get("content").asText();

            Integer tId = 0;
            Integer sId = 0;

            if(idTour > 0){

                Tours t = tour.getById(idTour);

                Tours tour1 = new Tours();
                tour1.setId(idTour);
                tour1.setUserId(users.getId());
                tour1.setName(nameTour);
                tour1.setAddress(address);
                tour1.setContent(content);
                tour1.setImage(t.getImage());
                tour1.setImages(t.getImages());
                tour1.setPolicy(policy);
                tour1.setLat(lat);
                tour1.setLng(lng);
                tour1.setDeleted(false);
                tour1.setCreatedAt(t.getCreatedAt());
                tour1.setUpdatedAt(TimeUtils.getCurrentTime());
                tour1.setServicesById(servicesById);
                tour1.setUsersByUserId(users);

                tId = tour.update(tour1).getId();
            }else{

                Tours tour1 = new Tours();
                tour1.setUserId(users.getId());
                tour1.setName(nameTour);
                tour1.setAddress(address);
                tour1.setContent(content);
                tour1.setImage("logo.png");
                tour1.setImages("logo.png");
                tour1.setPolicy(policy);
                tour1.setLat(lat);
                tour1.setLng(lng);
                tour1.setDeleted(false);
                tour1.setCreatedAt(TimeUtils.getCurrentTime());
                tour1.setUpdatedAt(TimeUtils.getCurrentTime());
                tour1.setServicesById(servicesById);
                tour1.setUsersByUserId(users);

                tId = tour.save(tour1).getId();
            }

            for (int i = 0; i < jsonService.size(); i++) {
                Services service1 = new Services();
                String rule = "";
                Integer serviceId = jsonService.get(i).get("idService").asInt();
                String serviceName = jsonService.get(i).get("nameService").asText();
                Integer normalPrice = jsonService.get(i).get("normalPriceService").asInt();
                Integer price = jsonService.get(i).get("priceService").asInt();
                String detail = jsonService.get(i).get("detail").asText();

                JsonNode jsonTicket = jsonService.get(i).get("ticketDetail");

                for(int j = 0; j < jsonTicket.size(); j++){
                    rule = rule + jsonTicket.get(j).get("nameTicket").asText() + ":" + jsonTicket.get(j).get("priceTicket").asInt();
                    if(j != jsonTicket.size() - 1){
                        rule = rule + ",";
                    }
                }

                if(serviceId > 0){
                    service1.setId(serviceId);
                }

                service1.setTourId(tId);
                service1.setName(serviceName);
                service1.setPrice(price);
                service1.setNormalPrice(normalPrice);
                service1.setDetail(detail);
                service1.setRule(rule);
                if(i == 0){
                    service1.setDefault(true);
                }else{
                    service1.setDefault(false);
                }
                service1.setDeleted(false);
                service1.setCreatedAt(TimeUtils.getCurrentTime());
                service1.setUpdatedAt(TimeUtils.getCurrentTime());
                sId = service.save(service1).getId();

                if(serviceId == 0) {
                    Tickets ticket1 = new Tickets();
                    ticket1.setServiceId(sId);
                    ticket1.setQuantity(0);
                    ticket1.setType(false);
                    ticket1.setCount(0);
                    ticket1.setCreatedAt(TimeUtils.getCurrentTime());
                    ticket1.setUpdatedAt(TimeUtils.getCurrentTime());

                    ticket.save(ticket1);
                }
            }

            mav.setViewName("redirect:" + Constants.Url.MANAGEMENT_URL + Constants.Url.MANAGEMENT_TOUR_URL);
        } catch (Exception e) {
            System.out.println("lỗi");
            e.printStackTrace();
            mav.setViewName("redirect:/" + Constants.Characters.BLANK);
            return mav;
        }
        mav.setViewName(MANAGEMENT_TOUR_DETAIL_SCREEN);
        return mav;
    }
}
