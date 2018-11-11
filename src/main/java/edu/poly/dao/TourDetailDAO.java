package edu.poly.dao;

import edu.poly.mapper.TourDetailMapper;
import edu.poly.model.TourDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class TourDetailDAO extends JdbcDaoSupport {

    @Autowired
    public TourDetailDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<TourDetailDTO> getTourDetailDTO(Integer id) {
        String sql = "SELECT t.id, t.Name, t.Address, t.Content, t.Images, t.Policy, t.Lat, t.Lng, t.Is_deleted, p.id as partnerId, p.Name as partnerName, p.Address as partnerAddress, s.id as serviceId, s.Name as serviceName, s.Price as servicePrice, s.Normal_price as serviceNormalPrice, s.Detail as serviceDetail, s.Is_default as serviceIsDefault, s.Is_deleted as serviceIsdeted, (SELECT tickets.id FROM tickets WHERE tickets.service_id = s.id ORDER BY tickets.id DESC LIMIT 1) as ticketId, (SELECT tickets.Quantity FROM tickets WHERE tickets.service_id = s.id ORDER BY tickets.id DESC LIMIT 1) as ticketQuantity, (SELECT tickets.Type FROM tickets WHERE tickets.service_id = s.id ORDER BY tickets.id DESC LIMIT 1) as ticketType, (SELECT tickets.Count FROM tickets WHERE tickets.service_id = s.id ORDER BY tickets.id DESC LIMIT 1) as ticketCount FROM tours t LEFT JOIN partners p ON p.user_id = t.user_id LEFT JOIN services s ON s.tour_id = t.id LEFT JOIN tickets ti ON ti.service_id = s.id WHERE t.id = ? GROUP BY s.id";
        Object[] params = new Object[]{id};
        TourDetailMapper mapper = new TourDetailMapper();
        List<TourDetailDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

}
