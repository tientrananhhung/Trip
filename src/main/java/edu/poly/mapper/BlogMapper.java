package edu.poly.mapper;

import edu.poly.model.BlogDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BlogMapper implements RowMapper<BlogDTO> {
    @Override
    public BlogDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer pid = resultSet.getInt("pID");
        String ptitle = resultSet.getString("pTitle");
        String pimage = resultSet.getString("pImage");
        String pcontent = resultSet.getString("pContent");
        Integer pview = resultSet.getInt("pView");
        String pcname = resultSet.getString("pcName");
        Integer pcid = resultSet.getInt("pcID");
        String date = resultSet.getString("date");
        return new BlogDTO(pid, ptitle, pimage, pcontent, pview, pcname, pcid, date);
    }
}
