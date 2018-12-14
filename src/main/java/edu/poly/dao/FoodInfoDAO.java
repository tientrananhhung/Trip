package edu.poly.dao;

import edu.poly.mapper.FoodInforMapper;
import edu.poly.model.FoodInforDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Repository
@Transactional
public class FoodInfoDAO extends JdbcDaoSupport {

    @Autowired
    public FoodInfoDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public List<FoodInforDTO> getAllFoodInfoByPlaceInfoID(Integer id) {
        String sql = "SELECT food_infors.id as id, food_infors.`Name` as Name, food_infors.Price as Price, food_infors.Images as Images, food_infors.Detail as Detail FROM food_infors WHERE place_infor_id = ? ";
        Object[] params = new Object[]{id};
        FoodInforMapper mapper = new FoodInforMapper();
        List<FoodInforDTO> listDTO = this.getJdbcTemplate().query(sql, params, mapper);
        return listDTO;
    }



}
