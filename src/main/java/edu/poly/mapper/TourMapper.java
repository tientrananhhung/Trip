package edu.poly.mapper;

import edu.poly.model.TourDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TourMapper implements RowMapper<TourDTO> {
    @Override
    public TourDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String image = resultSet.getString("Image");
        Integer quantity = resultSet.getInt("Quantity");
        Integer count = resultSet.getInt("Count");
        Integer price = resultSet.getInt("Price");
        Integer normalPrice = resultSet.getInt("Normal_price");
        Boolean type = resultSet.getBoolean("Type");
        Double rate = resultSet.getDouble("star");
        return new TourDTO(id, name, address, image, quantity, price, normalPrice, count, type, rate);
    }
}
