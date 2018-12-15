package edu.poly.mapper;

import edu.poly.model.FoodDistrictDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodDistrictMapper implements RowMapper<FoodDistrictDTO> {

    @Override
    public FoodDistrictDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        Integer piid = resultSet.getInt("piid");
        String piname = resultSet.getString("piname");
        String piimage = resultSet.getString("piimage");
        String piphone = resultSet.getString("piphone");
        String piaddress = resultSet.getString("piaddress");
        Integer fid = resultSet.getInt("fid");
        String fname = resultSet.getString("fname");

        return new FoodDistrictDTO(id, name, piid, piname, piimage, piphone, piaddress, fid, fname);
    }
}
