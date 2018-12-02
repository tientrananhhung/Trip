package edu.poly.dao;

import edu.poly.mapper.ManagementTourMapper;
import edu.poly.model.ManagementTourDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.util.List;

public class ManagementTourDAO extends JdbcDaoSupport {

    @Autowired
    public ManagementTourDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<ManagementTourDTO> getTourDTOById(Integer id) {
        String sql = "SELECT t.id, t.Name, t.Address, t.Image, t.Policy, s.Name as 'Service', s.Price, s.Normal_price, s.Is_default, s.Is_deleted, ti.Count, ti.Quantity FROM tours t LEFT JOIN services s ON s.tour_id = t.id LEFT JOIN tickets ti ON ti.service_id = s.id WHERE t.user_id = ? AND t.Is_deleted = 0";
        Object[] params = new Object[]{id};
        ManagementTourMapper mapper = new ManagementTourMapper();
        List<ManagementTourDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
}
