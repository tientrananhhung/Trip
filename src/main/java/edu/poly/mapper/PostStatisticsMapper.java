package edu.poly.mapper;

import edu.poly.model.PostStatisticsDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostStatisticsMapper implements RowMapper<PostStatisticsDTO> {
    @Override
    public PostStatisticsDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer Tong_Post = resultSet.getInt("Tong_Post");
        Integer Deleted = resultSet.getInt("Deleted");
        String Thang = resultSet.getString("Thang");
        return new PostStatisticsDTO(Tong_Post,Deleted,Thang);
    }
}

