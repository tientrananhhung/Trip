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
}
