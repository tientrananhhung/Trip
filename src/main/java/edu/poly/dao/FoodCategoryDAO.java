package edu.poly.dao;

import edu.poly.mapper.FoodCateMapper;
import edu.poly.mapper.FoodCategoryMapper;
import edu.poly.model.FoodCateDTO;
import edu.poly.model.FoodCategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class FoodCategoryDAO extends JdbcDaoSupport {

    @Autowired
    public FoodCategoryDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<FoodCategoryDTO> getAllFoodCategory() {
        String sql = "SELECT food_categorys.id as id, food_categorys.`Name` as name FROM food_categorys";
        Object[] params = new Object[]{};
        FoodCategoryMapper mapper = new FoodCategoryMapper();
        List<FoodCategoryDTO> listDTO1 = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO1;
    }

    public List<FoodCateDTO> getAllFoodByFCID(Integer id) {
        String sql = "SELECT food_categorys.id AS id, food_categorys.`Name` AS `name`, foods.id as fid, foods.`Name` as fname, foods.Opentime as fopentime, place_infors.id as piid, place_infors.`Name` as piname, place_infors.Images as piimage, place_infors.Phone as piphone, place_infors.Address as piaddress, districts.id as did, districts.`Name` as dname FROM food_categorys INNER JOIN foods ON foods.food_category_id = food_categorys.id INNER JOIN place_infors ON place_infors.food_id = foods.id INNER JOIN districts ON place_infors.district_id = districts.id WHERE food_categorys.id = ?";
        Object[] params = new Object[]{id};
        FoodCateMapper mapper1 = new FoodCateMapper();
        List<FoodCateDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper1);
        return listDTO;
    }

    public List<FoodCateDTO> getTop5Food(Integer id) {
        String sql = "SELECT food_categorys.id AS id, food_categorys.`Name` AS `name`, foods.id as fid, foods.`Name` as fname, foods.Opentime as fopentime, place_infors.id as piid, place_infors.`Name` as piname, place_infors.Images as piimage, place_infors.Phone as piphone, place_infors.Address as piaddress, districts.id as did, districts.`Name` as dname FROM food_categorys INNER JOIN foods ON foods.food_category_id = food_categorys.id INNER JOIN place_infors ON place_infors.food_id = foods.id INNER JOIN districts ON place_infors.district_id = districts.id WHERE food_categorys.id = ? ORDER BY place_infors.id DESC LIMIT 5";
        Object[] params = new Object[]{id};
        FoodCateMapper mapper = new FoodCateMapper();
        List<FoodCateDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }
}
