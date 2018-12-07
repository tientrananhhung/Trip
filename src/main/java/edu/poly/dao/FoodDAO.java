package edu.poly.dao;

import edu.poly.mapper.FoodMapper;
import edu.poly.mapper.PlaceInfoMapper;
import edu.poly.model.FoodDTO;
import edu.poly.model.PlaceInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class FoodDAO extends JdbcDaoSupport {

    @Autowired
    public FoodDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<FoodDTO> getAllFoodDTO() {
        String sql = "SELECT pi.id, fc.Name as 'category', pi.Name, pi.Address, f.Opentime, pi.Images, (SELECT d.Name FROM districts d WHERE d.id = pi.district_id) as District FROM foods f INNER JOIN place_infors pi ON pi.food_id = f.id INNER JOIN food_categorys fc ON f.food_category_id = fc.id WHERE f.Is_deleted = 0 AND pi.id = (Select pi.id from place_infors pi where food_id = f.id order by pi.Updated_at desc limit 1) order by id desc limit 12";
        Object[] params = new Object[]{};
        FoodMapper mapper = new FoodMapper();
        List<FoodDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

    public List<PlaceInfoDTO> getTop5FoodNew() {
        String sql = "SELECT foods.id as food_id, foods.`Name` AS food_name, foods.Opentime as food_opentime, place_infors.id as pi_id, place_infors.`Name` as pi_name, place_infors.Images as pi_image, place_infors.Phone as pi_phone, place_infors.Address as pi_address, districts.`Name` as d_name, districts.id as d_id FROM foods INNER JOIN place_infors ON place_infors.food_id = foods.id INNER JOIN districts ON place_infors.district_id = districts.id ORDER BY pi_id DESC LIMIT 5";
        Object[] params = new Object[]{};
        PlaceInfoMapper mapper = new PlaceInfoMapper();
        List<PlaceInfoDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

    public List<PlaceInfoDTO> getTop3Food() {
        String sql = "SELECT foods.id as food_id, foods.`Name` AS food_name, foods.Opentime as food_opentime, place_infors.id as pi_id, place_infors.`Name` as pi_name, place_infors.Images as pi_image, place_infors.Phone as pi_phone, place_infors.Address as pi_address, districts.`Name` as d_name, districts.id as d_id FROM foods INNER JOIN place_infors ON place_infors.food_id = foods.id INNER JOIN districts ON place_infors.district_id = districts.id ORDER BY pi_id LIMIT 3";
        Object[] params = new Object[]{};
        PlaceInfoMapper mapper = new PlaceInfoMapper();
        List<PlaceInfoDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }

}
