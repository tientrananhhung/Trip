package edu.poly.dao;

import edu.poly.mapper.FoodDetailMapper;
import edu.poly.model.FoodDetailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class FoodDetailDAO extends JdbcDaoSupport {

    @Autowired
    public FoodDetailDAO (DataSource dataSource){
        this.setDataSource(dataSource);
    }

    public FoodDetailDTO getFoodDetailDTO(Integer id) {
        String sql = "SELECT place_infors.id as placeInfoID, place_infors.Images as placeInfoImages, place_infors.Lng as placeInfoLng, place_infors.Lat as placeInfoLat, place_infors.Phone as placeInfoPhone, place_infors.Address as placeInfoAddress, place_infors.Name as placeInfoName, foods.Opentime as foodOpentime, food_categorys.Name as foodCategoryName, food_categorys.id as foodCategoryID, districts.Name as districtName, districts.id as districtID, place_infors.content as content FROM place_infors INNER JOIN foods ON place_infors.food_id = foods.id INNER JOIN food_categorys ON foods.food_category_id = food_categorys.id INNER JOIN districts ON place_infors.district_id = districts.id WHERE place_infors.id = ?";
        Object[] params = new Object[]{id};
        FoodDetailMapper mapper = new FoodDetailMapper();
        FoodDetailDTO foodDetailDTO = this.getJdbcTemplate().queryForObject(sql, params, mapper);
        return foodDetailDTO;
    }
}
