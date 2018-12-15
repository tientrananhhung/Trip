package edu.poly.mapper;

import edu.poly.model.DistrictDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DistrictMapper implements RowMapper<DistrictDTO> {

    @Override
    public DistrictDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        return new DistrictDTO(id, name);
    }
}
