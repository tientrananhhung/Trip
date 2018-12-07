package edu.poly.dao;

import edu.poly.mapper.TourMapper;
import edu.poly.model.TourDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class TourDAO extends JdbcDaoSupport {

    @Autowired
    public TourDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<TourDTO> getAllTourDTO() {
        String sql = "SELECT tours.id, tours.Name, tours.Address, tours.Image, services.Price, services.Normal_price, tickets.Type, tickets.Quantity, tickets.Count,(select ROUND((Sum(rates.Star)/count(rates.id)), 1)  as 'avgstar' from rates where rates.tour_id = tours.id) as 'star' FROM tours INNER JOIN services ON services.tour_id = tours.id INNER JOIN tickets ON tickets.service_id = services.id WHERE services.Is_default = 1 AND tickets.id = (Select tickets.id from tickets where service_id = services.id order by tickets.Updated_at desc limit 1) AND tours.Is_deleted = 0 order by id desc limit 12";
        Object[] params = new Object[]{};
        TourMapper mapper = new TourMapper();
        List<TourDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

    public List<TourDTO> getTop3TourDTO() {
        String sql = "SELECT tours.id, tours.Name, tours.Address, tours.Image, services.Price, services.Normal_price, tickets.Type, tickets.Quantity, tickets.Count,(select ROUND((Sum(rates.Star)/count(rates.id)), 1)  as 'avgstar' from rates where rates.tour_id = tours.id) as 'star' FROM tours INNER JOIN services ON services.tour_id = tours.id INNER JOIN tickets ON tickets.service_id = services.id WHERE services.Is_default = 1 AND tickets.id = (Select tickets.id from tickets where service_id = services.id order by tickets.Updated_at desc limit 1) AND tours.Is_deleted = 0 order by id desc limit 3";
        Object[] params = new Object[]{};
        TourMapper mapper = new TourMapper();
        List<TourDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

}