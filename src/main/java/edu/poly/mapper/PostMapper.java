package edu.poly.mapper;


import edu.poly.model.PostDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostMapper implements RowMapper<PostDTO> {

    @Override
    public PostDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String categoryname = resultSet.getString("categoryname");
        String title = resultSet.getString("title");
        String image = resultSet.getString("image");
        String description = resultSet.getString("description");
        return new PostDTO(id, image,title,categoryname,description);
    }

}
