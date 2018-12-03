package edu.poly.mapper;

import edu.poly.dao.FoodInfoDAO;
import edu.poly.model.FoodInforDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodInforMapper implements RowMapper<FoodInforDTO> {

    @Override
    public FoodInforDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("Name");
        String price = resultSet.getString("Price");
        String images = resultSet.getString("Images");
        String detail = resultSet.getString("Detail");
        return new FoodInforDTO(id, name, price, images, detail);
    }




}
