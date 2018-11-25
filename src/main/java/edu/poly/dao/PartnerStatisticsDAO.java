package edu.poly.dao;

import edu.poly.mapper.PartnerStatisticsMapper;
import edu.poly.model.PartnerStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Repository
@Transactional
public class PartnerStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public PartnerStatisticsDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<PartnerStatisticsDTO> getAllPartnerStatisticsDTO(String month, Integer year) {
        String sql = "SELECT Count(partners.id) as Tong_Partner, Count(IF(partners.Is_actived = true, 1, NULL)) AS Actived, Count(IF(partners.Is_deleted = true, 1, NULL)) AS Deleted, CONCAT('Tháng ', MONTH(Created_at)) as thang FROM partners WHERE partners.Created_at >= ? AND partners.Created_at <= ? GROUP BY thang ORDER BY Thang ASC";
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
        PartnerStatisticsMapper mapper = new PartnerStatisticsMapper();
        List<PartnerStatisticsDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

    public PartnerStatisticsDTO getPartnerStatisticsDTO() {
        String sql = "SELECT Count(partners.id) as Tong_Partner, Count(IF(partners.Is_actived = true, 1, NULL)) AS Actived, Count(IF(partners.Is_deleted = true, 1, NULL)) AS Deleted, CONCAT('Tháng ',MAX(MONTH(Created_at))) as thang FROM partners";
        Object[] params = new Object[]{};
        PartnerStatisticsMapper mapper = new PartnerStatisticsMapper();
        List<PartnerStatisticsDTO> partner = this.getJdbcTemplate().query(sql, params, mapper);
        return partner.get(0);
    }
}
