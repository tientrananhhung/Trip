package edu.poly.controller;

import edu.poly.common.*;
import edu.poly.dao.OrderDAO;
import edu.poly.entity.Offers;
import edu.poly.entity.Orders;
import edu.poly.impl.OfferImpl;
import edu.poly.impl.OrderImpl;
import edu.poly.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(Constants.Url.ADMIN_PAGE_URL)
public class OrderController {

    @Autowired
    OrderImpl order;

    @Autowired
    OfferImpl offer;

    @Autowired
    OrderDAO orderDAO;

    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String ORDER_SCREEN = "/admin/quanlyhoadon/listorder";
    public static final String ADD_ORDER_SCREEN = "/admin/quanlyhoadon/addorder";


//    Return ListDistrict
    @GetMapping(Constants.Url.LIST_ORDER)
    public ModelAndView showOrderList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
//        mav.addObject("listDistrict", district.findAllByDeleted(false));
        List<OrderDTO> list = orderDAO.getListOrderDTO();
        mav.addObject("listOrder",list);
        mav.setViewName(ORDER_SCREEN);
        return mav;
    }


//    Delete order
    @GetMapping(Constants.Url.DELETE_ORDER)
    public ModelAndView deleteOrder(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            Orders orders = order.getById(id);
            orders.setDeleted(true);
            orders.setUpdatedAt(TimeUtils.getCurrentTime());
            order.update(orders);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_ORDER);
        return mav;
    }

    //    Delete order
    @GetMapping(Constants.Url.PURCHASE_ORDER)
    public ModelAndView purchaseOrder(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (!CheckSession.admin(session)) {
            mav.setViewName("redirect:" + Constants.Url.LOGIN);
            return mav;
        }
        try{
            Orders orders = order.getById(id);
            orders.setPurchased(true);
            orders.setUpdatedAt(TimeUtils.getCurrentTime());
            order.update(orders);
            OrderDTO orderDTO = orderDAO.getOrderDTO(id);
            System.out.println();
            mailTest.mailSend(orderDTO.getUserEmail(), MailContent.PURCHASED(orderDTO), "Thanh Toán Thành Công");
            String[] arRules = orders.getData().split("\\,");
            Integer totalPriceAfter = Integer.valueOf(arRules[5].split("\\:")[1]);

             if(totalPriceAfter > 2000000){
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(250000);
                offers.setUserId(orders.getUserId());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            }
           else if(totalPriceAfter > 1000000){
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(100000);
                offers.setUserId(orders.getUserId());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            }
            else if(totalPriceAfter > 500000){
                Offers offers = new Offers();
                offers.setCode(StringUtils.getRandomString());
                offers.setDeal(50000);
                offers.setUserId(orders.getUserId());
                offers.setUsed(false);
                offers.setCreatedAt(TimeUtils.getCurrentTime());
                offers.setUpdatedAt(TimeUtils.getCurrentTime());
                offer.save(offers);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
        mav.setViewName("redirect:/admin" + Constants.Url.LIST_ORDER);
        return mav;
    }
}
