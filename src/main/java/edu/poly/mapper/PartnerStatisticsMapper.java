package edu.poly.mapper;

import edu.poly.model.PartnerStatisticsDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PartnerStatisticsMapper implements RowMapper<PartnerStatisticsDTO> {
    @Override
    public PartnerStatisticsDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer Tong_Partner = resultSet.getInt("Tong_Partner");
        Integer Actived = resultSet.getInt("Actived");
        Integer Deleted = resultSet.getInt("Deleted");
        String Thang = resultSet.getString("Thang");
        return new PartnerStatisticsDTO(Tong_Partner,Actived,Deleted,Thang);
    }
}
