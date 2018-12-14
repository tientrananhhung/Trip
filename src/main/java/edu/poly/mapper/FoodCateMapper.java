package edu.poly.mapper;

import edu.poly.model.FoodCateDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodCateMapper implements RowMapper<FoodCateDTO> {

    @Override
    public FoodCateDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        Integer fid = resultSet.getInt("fid");
        String fname = resultSet.getString("fname");
        String fopentime = resultSet.getString("fopentime");
        Integer piid = resultSet.getInt("piid");
        String piname = resultSet.getString("piname");
        String piimage = resultSet.getString("piimage");
        String piphone = resultSet.getString("piphone");
        String piaddress = resultSet.getString("piaddress");
        Integer did = resultSet.getInt("did");
        String dname = resultSet.getString("dname");

        return new FoodCateDTO(id, name, fid, fname, fopentime, piid, piname, piimage, piphone, piaddress, did, dname);
    }
}
