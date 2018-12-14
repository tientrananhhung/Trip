package edu.poly.mapper;

import edu.poly.model.FoodCategoryDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodCategoryMapper implements RowMapper<FoodCategoryDTO> {

    @Override
    public FoodCategoryDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        return new FoodCategoryDTO(id, name);
    }
}
