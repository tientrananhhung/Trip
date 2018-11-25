package edu.poly.mapper;

import edu.poly.model.PostCountStatisticsDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostCountStatisticsMapper implements RowMapper<PostCountStatisticsDTO> {
    @Override
    public PostCountStatisticsDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer Tong_Post = resultSet.getInt("Tong_Post");
        Integer Deleted = resultSet.getInt("Deleted");
        Integer Max_View = resultSet.getInt("Max_View");
        String Title = resultSet.getString("Title");
        String Users = resultSet.getString("Users");
        String thang = resultSet.getString("thang");
        return new PostCountStatisticsDTO(Tong_Post,Deleted,Max_View,Title,Users,thang);
    }
}
