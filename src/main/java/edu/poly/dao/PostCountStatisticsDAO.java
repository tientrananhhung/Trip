package edu.poly.dao;

import edu.poly.mapper.PostCountStatisticsMapper;
import edu.poly.model.PostCountStatisticsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class PostCountStatisticsDAO extends JdbcDaoSupport {

    @Autowired
    public PostCountStatisticsDAO(DataSource dataSource) { this.setDataSource(dataSource); }

    public PostCountStatisticsDTO getPostCountStatisticsDTO(String month,String year) {
        String sql = "SELECT COUNT(id) as Tong_Post, Count(IF(posts.Is_deleted = true, 1, NULL)) AS Deleted, max(view) as Max_View, (select Title from `posts` WHERE posts.view = (select max(posts.view) from posts WHERE Created_at >= ? and Created_at <= ?)) as Title ,(select users.name FROM posts INNER JOIN users ON posts.user_id = users.id WHERE posts.Created_at >= ? and posts.Created_at <= ? GROUP BY posts.user_id ORDER BY posts.user_id DESC Limit 1 ) as Users, CONCAT('Tháng ', MONTH(Created_at)) as thang fROM `posts` WHERE Created_at >= ? and Created_at <= ?";
        Date year1 = Date.valueOf(year+"-"+month+"-01");
        Date year2 = Date.valueOf(year+"-"+month+"-31");
        System.out.println(year1 +","+ year2);
        Object[] params = new Object[]{year1,year2,year1,year2,year1,year2};
        PostCountStatisticsMapper mapper = new PostCountStatisticsMapper();
        PostCountStatisticsDTO listDTO = this.getJdbcTemplate().queryForObject(sql, params, mapper);
        return listDTO;
    }
}
