package edu.poly.dao;

import edu.poly.mapper.OfferStatisticsMapper;
import edu.poly.mapper.PostStatisticsMapper;
import edu.poly.model.PostStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class PostStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public PostStatisticsDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public List<PostStatisticsDTO> getAllPostStatisticsDTO(Integer year) {
        String sql = "SELECT Count(posts.id) as Tong_Post, Count(IF(posts.Is_deleted = true, 1, NULL)) AS Deleted, CONCAT('Tháng ', MONTH(Created_at)) as thang FROM posts WHERE posts.Created_at >= ? AND posts.Created_at <= ? GROUP BY thang ORDER BY Thang ASC";
        Date year1 = Date.valueOf(year+"-01-01");
        Date year2 = Date.valueOf(year+"-12-31");
        Object[] params = new Object[]{year1,year2};
        PostStatisticsMapper mapper = new PostStatisticsMapper();
        List<PostStatisticsDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

}
