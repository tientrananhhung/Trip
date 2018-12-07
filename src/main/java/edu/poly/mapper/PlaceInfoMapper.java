package edu.poly.mapper;


import edu.poly.model.PlaceInfoDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaceInfoMapper implements RowMapper<PlaceInfoDTO> {
    @Override
    public PlaceInfoDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer foodID = resultSet.getInt("food_id");
        String foodName = resultSet.getString("food_name");
        String opentime = resultSet.getString("food_opentime");
        Integer piID = resultSet.getInt("pi_id");
        String piName = resultSet.getString("pi_name");
        String piImage = resultSet.getString("pi_image");
        String piPhone = resultSet.getString("pi_phone");
        String piAddress = resultSet.getString("pi_address");
        Integer dId = resultSet.getInt("d_id");
        String dName = resultSet.getString("d_name");
        return new PlaceInfoDTO(foodID, foodName, opentime, piID, piName, piImage, piPhone,piAddress,dId,dName);
    }
}

