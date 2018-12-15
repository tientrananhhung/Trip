package edu.poly.dao;

import edu.poly.mapper.DistrictMapper;
import edu.poly.mapper.FoodDistrictMapper;
import edu.poly.model.DistrictDTO;
import edu.poly.model.FoodDistrictDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class DistrictDAO extends JdbcDaoSupport {
    @Autowired
    public DistrictDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<DistrictDTO> getAllDistrict() {
        String sql = "SELECT districts.id as id, districts.Name as name FROM districts";
        Object[] params = new Object[]{};
        DistrictMapper mapper = new DistrictMapper();
        List<DistrictDTO> listDTO1 = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO1;
    }

    public List<FoodDistrictDTO> getAllFoodByDID(Integer id) {
        String sql = "SELECT districts.id AS id, districts.Name AS name, place_infors.id as piid, place_infors.Name as piname, place_infors.Images as piimage, place_infors.Phone as piphone, place_infors.Address as piaddress, foods.id as fid, foods.Opentime as fopentime FROM districts INNER JOIN place_infors ON place_infors.district_id = districts.id INNER JOIN foods ON place_infors.food_id = foods.id WHERE districts.id = ? ";
        Object[] params = new Object[]{id};
        FoodDistrictMapper mapper1 = new FoodDistrictMapper();
        List<FoodDistrictDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper1);
        return listDTO;
    }

    public List<FoodDistrictDTO> getTop5FoodByDID(Integer id) {
        String sql = "SELECT districts.id AS id, districts.Name AS name, place_infors.id as piid, place_infors.Name as piname, place_infors.Images as piimage, place_infors.Phone as piphone, place_infors.Address as piaddress, foods.id as fid, foods.Opentime as fopentime FROM districts INNER JOIN place_infors ON place_infors.district_id = districts.id INNER JOIN foods ON place_infors.food_id = foods.id WHERE districts.id = ? ORDER BY place_infors.id DESC LIMIT 5";
        Object[] params = new Object[]{id};
        FoodDistrictMapper mapper1 = new FoodDistrictMapper();
        List<FoodDistrictDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper1);
        return listDTO;
    }
}
