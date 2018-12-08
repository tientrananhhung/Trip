package edu.poly.dao;

import edu.poly.mapper.BlogMapper;
import edu.poly.mapper.PostCategoryMapper;
import edu.poly.model.BlogDTO;
import edu.poly.model.PostCategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class PostCategoryDAO extends JdbcDaoSupport {
    
    @Autowired
    public PostCategoryDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<BlogDTO> getTop5ViewPost(Integer id) {
        String sql = "SELECT posts.id as pID, posts.Title as pTitle, posts.Image as pImage, posts.Content as pContent, posts.`View` as pView, post_categorys.`Name` as pcName, post_categorys.id as pcID, posts.Created_at as date FROM posts INNER JOIN post_categorys ON posts.post_category_id = post_categorys.id WHERE post_category_id = ? ORDER BY `View` DESC LIMIT 5";
        Object[] params = new Object[]{id};
        BlogMapper mapper = new BlogMapper();
        List<BlogDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

    public List<BlogDTO> getPostCategoryByID(Integer id) {
        String sql = "SELECT posts.id AS pID, posts.Title AS pTitle, posts.Image AS pImage, posts.Content AS pContent, posts.`View` AS pView, post_categorys.`Name` AS pcName, post_categorys.id AS pcID, posts.Created_at as date FROM posts INNER JOIN post_categorys ON posts.post_category_id = post_categorys.id WHERE post_category_id = ?";
        Object[] params = new Object[]{id};
        BlogMapper mapper1 = new BlogMapper();
        List<BlogDTO> listDTO1 = this.getJdbcTemplate().query(sql, params, mapper1);
        return listDTO1;
    }

    public List<PostCategoryDTO> getAllPostCategory() {
        String sql = "SELECT post_categorys.`Name` AS pcName, post_categorys.id AS pcID FROM post_categorys";
        Object[] params = new Object[]{};
        PostCategoryMapper mapper2 = new PostCategoryMapper();
        List<PostCategoryDTO> listDTO1 = this.getJdbcTemplate().query(sql, params, mapper2);
        return listDTO1;
    }
}
