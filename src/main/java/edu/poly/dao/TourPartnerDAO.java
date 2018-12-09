package edu.poly.dao;

import edu.poly.mapper.TourPartnerMapper;
import edu.poly.model.TourPartnerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class TourPartnerDAO extends JdbcDaoSupport {

    @Autowired
    public TourPartnerDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public List<TourPartnerDTO> getTourByIdDTO(Integer id) {
        String sql = "SELECT t.id, t.user_id, t.Name, t.Address, t.Content, t.Image, t.Policy, t.Lat, t.Lng, s.id as 'ServiceId', s.Name as 'ServiceName', s.Price, s.Normal_price, s.Detail, s.Rule, s.Is_default, s.Is_deleted FROM tours t LEFT JOIN services s ON s.tour_id = t.id WHERE t.id = ?";
        Object[] params = new Object[]{id};
        TourPartnerMapper mapper = new TourPartnerMapper();
        List<TourPartnerDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
}
