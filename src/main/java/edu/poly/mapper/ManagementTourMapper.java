package edu.poly.mapper;

import edu.poly.model.ManagementTourDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ManagementTourMapper implements RowMapper<ManagementTourDTO> {
    @Override
    public ManagementTourDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String image = resultSet.getString("Image");
        Integer policy = resultSet.getInt("Policy");
        String service = resultSet.getString("Service");
        String price = resultSet.getString("Price");
        String normalPrice = resultSet.getString("Normal_price");
        Boolean isDefault = resultSet.getBoolean("Is_default");
        Boolean isDeleted = resultSet.getBoolean("Is_deleted");
        Integer count = resultSet.getInt("Count");
        Integer quantity = resultSet.getInt("Quantity");
        return new ManagementTourDTO(id, name, address, image, policy, service, price, normalPrice, count, isDefault, isDeleted);
    }
}
