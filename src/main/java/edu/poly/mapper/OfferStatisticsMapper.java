package edu.poly.mapper;

import edu.poly.model.OfferStatisticsDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OfferStatisticsMapper implements RowMapper<OfferStatisticsDTO> {
    @Override
    public OfferStatisticsDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer Tong_Offer = resultSet.getInt("Tong_Offer");
        Integer Used = resultSet.getInt("Used");
        String Thang = resultSet.getString("Thang");
        return new OfferStatisticsDTO(Tong_Offer,Used,Thang);
    }
}
