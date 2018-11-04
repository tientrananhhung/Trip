package edu.poly.dao;

import edu.poly.mapper.PostIndexMapper;
import edu.poly.model.PostIndexDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class PostIndexDAO extends JdbcDaoSupport {

    @Autowired

    public PostIndexDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<PostIndexDTO> getTop5PostNew(){
        String sql = "SELECT p.id, p.Title, p.Image FROM posts p ORDER BY p.id DESC LIMIT 5";
        Object[] params = new Object[]{};
        PostIndexMapper mapper = new PostIndexMapper();
        List<PostIndexDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
}
