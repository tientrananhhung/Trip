package edu.poly.mapper;

import edu.poly.model.PostCategoryDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostCategoryMapper implements RowMapper<PostCategoryDTO> {

    @Override
    public PostCategoryDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("pcID");
        String name = resultSet.getString("pcName");
        return new PostCategoryDTO(id, name);
    }
}
