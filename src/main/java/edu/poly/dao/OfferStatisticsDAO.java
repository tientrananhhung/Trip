package edu.poly.dao;

import edu.poly.mapper.OfferStatisticsMapper;
import edu.poly.model.OfferStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class OfferStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public OfferStatisticsDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public List<OfferStatisticsDTO> getAllOfferStatisticsDTO(String month, Integer year) {
        String sql = "SELECT Count(offers.id) as Tong_Offer, Count(IF(offers.Is_used = true, 1, NULL)) AS Used, CONCAT('Tháng ', MONTH(Created_at)) as thang FROM offers WHERE offers.Created_at >= ? AND offers.Created_at <= ? GROUP BY thang ORDER BY MONTH(Created_at) ASC";
        Date year1;
        Date year2;
        Integer monthInt = Integer.parseInt(month);
        if (monthInt == 1) {
            year2 = Date.valueOf(year + "-" + month + "-31");
            year1 = Date.valueOf(year + "-12-01");
        } else {
            monthInt = monthInt -1;
            year1 = Date.valueOf(year + "-" + monthInt + "-01");
            year2 = Date.valueOf(year + "-" + month + "-31");
        }
        Object[] params = new Object[]{year1, year2};
        OfferStatisticsMapper mapper = new OfferStatisticsMapper();
        List<OfferStatisticsDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
    public OfferStatisticsDTO getOfferStatisticsDTO() {
        String sql = "SELECT Count(offers.id) as Tong_Offer, Count(IF(offers.Is_used = true, 1, NULL)) AS Used, CONCAT('Tháng ', MONTH(Created_at)) as thang FROM offers";
        Object[] params = new Object[]{};
        OfferStatisticsMapper mapper = new OfferStatisticsMapper();
        List<OfferStatisticsDTO> partner = this.getJdbcTemplate().query(sql, params, mapper);
        return partner.get(0);
    }

}
