package edu.poly.mapper;

import edu.poly.common.StringUtils;
import edu.poly.model.RateTourDetailDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class RateTourDetailMapper implements RowMapper<RateTourDetailDTO> {

    @Override
    public RateTourDetailDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String comment = resultSet.getString("Comment");
        Integer star = resultSet.getInt("Star");
        Boolean isDeleted = resultSet.getBoolean("Is_deleted");
        String createdAt = resultSet.getString("Created_at");
        String updatedAt = resultSet.getString("Updated_at");
        String name = resultSet.getString("Name");
        String avatar = resultSet.getString("Avatar");
        Integer totalPage = resultSet.getInt("TotalPage");
        Double totalRate = resultSet.getDouble("TotalRate");
        Integer totalComment = resultSet.getInt("TotalComment");
        return new RateTourDetailDTO(id, comment, star, isDeleted, createdAt, updatedAt, name, avatar, totalPage, totalRate, totalComment);
    }

}
