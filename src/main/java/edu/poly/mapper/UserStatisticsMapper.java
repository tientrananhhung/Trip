package edu.poly.mapper;

import edu.poly.model.UserStatisticsDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserStatisticsMapper implements RowMapper<UserStatisticsDTO> {
    @Override
    public UserStatisticsDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer Tong_User = resultSet.getInt("Tong_User");
        Integer Actived = resultSet.getInt("Actived");
        Integer Deleted = resultSet.getInt("Deleted");
        String Thang = resultSet.getString("Thang");
        return new UserStatisticsDTO(Tong_User,Actived,Deleted,Thang);
    }
}
