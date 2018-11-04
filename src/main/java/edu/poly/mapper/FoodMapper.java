package edu.poly.mapper;

import edu.poly.model.FoodDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodMapper implements RowMapper<FoodDTO> {

    @Override
    public FoodDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String category = resultSet.getString("category");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String openTime = resultSet.getString("Opentime");
        String image = resultSet.getString("Images");
        String district = resultSet.getString("District");
        return new FoodDTO(id, category, name, address, openTime, image, district);
    }

}
