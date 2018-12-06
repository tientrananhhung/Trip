package edu.poly.dao;

import edu.poly.mapper.OrderMapper;
import edu.poly.model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class OrderDAO  extends JdbcDaoSupport {
    @Autowired
    public OrderDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public OrderDTO getOrderDTO(Integer id) {
        String sql = "SELECT orders.id, users.`Name` AS customername, services.`Name` AS servicename, users.Email AS email, orders.Payment AS payment, orders.Is_purchased AS purchased, orders.Created_at AS datecreate, orders.`Data` AS `data`, tours.Address AS address, tours.`Name`as tourname FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id WHERE orders.id = ?";
        Object[] params = new Object[]{id};
        OrderMapper mapper = new OrderMapper();
        OrderDTO order =  this.getJdbcTemplate().queryForObject(sql, params, mapper);
        return order;
    }

    public List<OrderDTO> getListOrderDTO() {
        String sql = "SELECT orders.id, users.`Name` AS customername, services.`Name` AS servicename, users.Email AS email, orders.Payment AS payment, orders.Is_purchased AS purchased, orders.Created_at AS datecreate, orders.`Data` AS `data`, tours.Address AS address, tours.`Name`as tourname FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id WHERE orders.Payment = 1 or orders.Payment = 2";
        Object[] params = new Object[]{};
        OrderMapper mapper = new OrderMapper();
        List<OrderDTO> list =  this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }

    public List<OrderDTO> getListOrderCustomerDTO(Integer id) {
        String sql = "SELECT orders.id, users.`Name` AS customername, services.`Name` AS servicename, users.Email AS email, orders.Payment AS payment, orders.Is_purchased AS purchased, orders.Created_at AS datecreate, orders.`Data` AS `data`, tours.Address AS address, tours.`Name` AS tourname, tours.Policy AS policy FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id WHERE users.id = ? AND orders.Is_deleted = false AND orders.Is_purchased = false";
        Object[] params = new Object[]{id};
        OrderMapper mapper = new OrderMapper();
        List<OrderDTO> list =  this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }

    public Integer deleteOrder(Integer id){
        String sql = "UPDATE orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id SET orders.Is_deleted = true,orders.Updated_at = CONVERT_TZ(NOW(), @@session.time_zone, '+7:00') WHERE users.id = "+id+"  AND (UNIX_TIMESTAMP(CURRENT_TIMESTAMP)*1000) - (UNIX_TIMESTAMP(orders.Created_at)*1000) > (tours.Policy * 3600000) and orders.Is_purchased = false";
        Integer ok =  this.getJdbcTemplate().update(sql);
        return ok;
    }

    public Integer deleteCustomerOrder(Integer id){
        String sql = "UPDATE orders SET orders.Is_deleted = true, orders.Updated_at = CONVERT_TZ(NOW(), @@session.time_zone, '+7:00') WHERE orders.id = "+id+"";
        Integer ok =  this.getJdbcTemplate().update(sql);
        return ok;
    }

    public List<OrderDTO> getListPurchaseOrderCustomerDTO(Integer id) {
        String sql = "SELECT orders.id, users.`Name` AS customername, services.`Name` AS servicename, users.Email AS email, orders.Payment AS payment, orders.Is_purchased AS purchased, orders.Created_at AS datecreate, orders.`Data` AS `data`, tours.Address AS address, tours.`Name` AS tourname, tours.Policy as policy FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id WHERE users.id = ? and orders.Is_deleted = false and orders.Is_purchased = true";
        Object[] params = new Object[]{id};
        OrderMapper mapper = new OrderMapper();
        List<OrderDTO> list =  this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }

    public List<OrderDTO> getListOrderCustomerDTODeleted(Integer id) {
        String sql = "SELECT orders.id, users.`Name` AS customername, services.`Name` AS servicename, users.Email AS email, orders.Payment AS payment, orders.Is_purchased AS purchased, orders.Created_at AS datecreate, orders.`Data` AS `data`, tours.Address AS address, tours.`Name` AS tourname, tours.Policy as policy FROM orders INNER JOIN users ON orders.user_id = users.id INNER JOIN services ON orders.service_id = services.id INNER JOIN tours ON services.tour_id = tours.id WHERE users.id = ? and orders.Is_deleted = true";
        Object[] params = new Object[]{id};
        OrderMapper mapper = new OrderMapper();
        List<OrderDTO> list =  this.getJdbcTemplate().query(sql, params, mapper);
        return list;
    }
}
