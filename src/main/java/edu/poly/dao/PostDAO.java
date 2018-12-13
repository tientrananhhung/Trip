package edu.poly.dao;

import edu.poly.mapper.PostMapper;
import edu.poly.model.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class PostDAO extends JdbcDaoSupport {

    @Autowired
    public PostDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<PostDTO> getAllPostDTO(Integer id,Boolean delete) {
        String sql = "SELECT posts.id as id, posts.Title as title, posts.Image as image, post_categorys.`Name` as categoryname, posts.Description as description FROM posts INNER JOIN post_categorys ON posts.post_category_id = post_categorys.id where posts.user_id = ? and posts.Is_deleted = ?";
        Object[] params = new Object[]{id,delete};
        PostMapper mapper = new PostMapper();
        List<PostDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }


}