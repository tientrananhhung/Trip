package edu.poly.dao;

import edu.poly.mapper.FoodMapper;
import edu.poly.model.FoodDTO;
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


}
