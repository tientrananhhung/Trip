package edu.poly.mapper;

import edu.poly.model.PostIndexDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostIndexMapper implements RowMapper<PostIndexDTO> {

    @Override
    public PostIndexDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String title = resultSet.getString("Title");
        String image = resultSet.getString("Image");
        String content = resultSet.getString("Content");
        Integer view = resultSet.getInt("View");
        Date updatedAt = resultSet.getDate("Updated_at");
        return new PostIndexDTO(id, title, image, content, view, updatedAt);
    }

}
