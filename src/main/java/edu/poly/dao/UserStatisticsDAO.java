package edu.poly.dao;

import edu.poly.mapper.UserStatisticsMapper;
import edu.poly.model.UserStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class UserStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public UserStatisticsDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public List<UserStatisticsDTO> getAllUserStatisticsDTO() {
        String sql = "SELECT Count(users.id) as Tong_User, Count(IF(users.Is_active = true, 1, NULL)) AS Actived, Count(IF(users.Is_deleted = true, 1, NULL)) AS Deleted, month(users.Created_at) as thang FROM users WHERE users.Created_at >= '2018-01-01' AND users.Created_at <= '2018-12-31' GROUP BY thang ORDER BY Thang ASC";
        Object[] params = new Object[]{};
        UserStatisticsMapper mapper = new UserStatisticsMapper();
        List<UserStatisticsDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }


}
