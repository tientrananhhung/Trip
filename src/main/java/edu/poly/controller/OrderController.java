package edu.poly.controller;

import edu.poly.common.CheckSession;
import edu.poly.common.Constants;
import edu.poly.common.TimeUtils;
import edu.poly.entity.Orders;
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

    public static final String ADMIN_SCREEN = "/admin/index";
    public static final String ORDER_SCREEN = "/admin/quanlyhoadon/listorder";
    public static final String ADD_ORDER_SCREEN = "/admin/quanlyhoadon/addorder";


//    Return ListDistrict
    @GetMapping(Constants.Url.LIST_ORDER)
    public ModelAndView showOrderList(HttpSession session) {
        ModelAndView mav = new ModelAndView();
//        if (!CheckSession.admin(session)) {
//            mav.setViewName("redirect:" + Constants.Url.LOGIN);
//            return mav;
//        }
//        mav.addObject("listDistrict", district.findAllByDeleted(false));
        List<OrderDTO> list = order.getAllByDeletedAndPayment(false);
        mav.addObject("listOrder",list);
        mav.setViewName(ORDER_SCREEN);
        return mav;
    }


//    Delete order
    @GetMapping(Constants.Url.DELETE_ORDER)
    public ModelAndView deleteDistrict(HttpSession session, @PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
//        if (!CheckSession.admin(session)) {
//            mav.setViewName("redirect:" + Constants.Url.LOGIN);
//            return mav;
//        }
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
}
