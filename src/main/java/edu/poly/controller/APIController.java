package edu.poly.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.poly.common.Constants;
import edu.poly.dao.RateTourDetailDAO;
import edu.poly.entity.Posts;
import edu.poly.entity.Services;
import edu.poly.impl.*;
import edu.poly.model.ProcessOrderDTO;
import edu.poly.model.RateTourDetailDTO;
import edu.poly.model.TicketDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
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
    RateTourDetailDAO rateTourDetailDAO;

    public static final String INDEX_SCREEN = "/index";

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

//    @GetMapping(path = "/userstaticstic", produces = {MimeTypeUtils.APPLICATION_JSON_VALUE})
//    public ResponseEntity<List<UserStatisticsDTO>> userstaticstic() {
//        try {
//            List<UserStatisticsDTO> list = (List<UserStatisticsDTO>) userStatisticsDAO.getAllUserStatisticsDTO();
//            ResponseEntity<List<UserStatisticsDTO>> responseEntity = new ResponseEntity<List<UserStatisticsDTO>>(list, HttpStatus.OK);
//            return responseEntity;
//        } catch (Exception e) {
//            return new ResponseEntity<List<UserStatisticsDTO>>(HttpStatus.BAD_REQUEST);
//        }
//    }

    @PostMapping(Constants.Url.POST_PROCESSING_ORDER_URL)
    public ModelAndView showOrder(@RequestParam String dataJson, @PathVariable("sId") int id, HttpServletRequest request) {

        ModelAndView mav = new ModelAndView(INDEX_SCREEN);

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
                ticketDetailDTO.setPriceTicket(jsonTicket.get(i).get("priceTicket").asInt());
                ticketDetailDTO.setQuantityTicket(jsonTicket.get(i).get("quantityTicket").asInt());
                listTicketDetailDTO.add(ticketDetailDTO);
            }

            processOrderDTO.setNameService(jsonNode.get("nameService").asText());
            processOrderDTO.setDateTicket(jsonNode.get("dateTicket").asText());
            processOrderDTO.setPicture(jsonNode.get("picture").asText());
            processOrderDTO.setTourId(jsonNode.get("tourId").asInt());
            processOrderDTO.setTour(jsonNode.get("tour").asText());
            processOrderDTO.setTicketDetail(listTicketDetailDTO);
            processOrderDTO.setServices(services);

            // Tạo session
            request.getSession().setAttribute(Constants.SessionKey.ORDER_SESSION, processOrderDTO);

            System.out.println("=================================================");
            System.out.println("Name Service: " + processOrderDTO.getNameService());
            System.out.println("Date Ticket: " + processOrderDTO.getDateTicket());
            System.out.println("Picture: " + processOrderDTO.getPicture());
            System.out.println("Tour ID: " + processOrderDTO.getTourId());
            System.out.println("Tour: " + processOrderDTO.getTour());
            System.out.println("Service ID: " + processOrderDTO.getServices().getId());
            System.out.println("Service: " + processOrderDTO.getServices().getName());
            for (TicketDetailDTO t: processOrderDTO.getTicketDetail()) {
                System.out.println("Name Ticket: " + t.getNameTicket());
                System.out.println("Price Ticket: " + t.getPriceTicket());
                System.out.println("Quantity Ticket: " + t.getQuantityTicket());
            }
            System.out.println("=================================================");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return mav;
    }

}
