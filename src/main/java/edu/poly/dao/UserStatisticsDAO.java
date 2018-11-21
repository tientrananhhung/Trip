package edu.poly.dao;

import edu.poly.mapper.UserStatisticsMapper;
import edu.poly.model.UserStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class UserStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public UserStatisticsDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public List<UserStatisticsDTO> getAllUserStatisticsDTO(Integer year) {
        String sql = "SELECT Count(users.id) as Tong_User, Count(IF(users.Is_active = true, 1, NULL)) AS Actived, Count(IF(users.Is_deleted = true, 1, NULL)) AS Deleted, CONCAT('Tháng ', MONTH(Created_at)) as thang FROM users WHERE users.Created_at >= ? AND users.Created_at <= ? GROUP BY thang ORDER BY MONTH(Created_at) ASC";
        Date year1 = Date.valueOf(year+"-01-01");
        Date year2 = Date.valueOf(year+"-12-31");
        Object[] params = new Object[]{year1,year2};
        UserStatisticsMapper mapper = new UserStatisticsMapper();
        List<UserStatisticsDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }


}
