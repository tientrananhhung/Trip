package edu.poly.dao;

import edu.poly.mapper.RateTourDetailMapper;
import edu.poly.model.RateTourDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class RateTourDetailDAO extends JdbcDaoSupport {

    @Autowired
    public RateTourDetailDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<RateTourDetailDTO> getPageRateDTO(Integer id, Integer page) {
        String sql = "SELECT r.id, r.Comment, r.Star, r.Is_deleted, r.Created_at, r.Updated_at, u.`Name`, u.Avatar, (SELECT CEILING(COUNT(id)/10) FROM rates WHERE rates.tour_id = r.tour_id) as TotalPage, (SELECT ROUND(SUM(rates.Star)/COUNT(id), 1) FROM rates WHERE rates.tour_id = r.tour_id) as TotalRate, (SELECT COUNT(id) FROM rates WHERE rates.tour_id = r.tour_id) as TotalComment FROM rates r LEFT JOIN users u ON r.user_id = u.id WHERE r.tour_id = ? LIMIT ?, 10";
        Object[] params = new Object[]{id, page};
        RateTourDetailMapper mapper = new RateTourDetailMapper();
        List<RateTourDetailDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
}
