package edu.poly.mapper;

import edu.poly.dao.FoodInfoDAO;
import edu.poly.model.FoodDetailDTO;
import edu.poly.model.FoodInforDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FoodDetailMapper implements RowMapper<FoodDetailDTO> {

    @Autowired
    private FoodInfoDAO foodInfoDAO;

    @Override
    public FoodDetailDTO mapRow(ResultSet resultSet, int id) throws SQLException {
        Integer placeInfoID = resultSet.getInt("placeInfoID");
        String placeInfoImages = resultSet.getString("placeInfoImages");
        String placeInfoLng = resultSet.getString("placeInfoLng");
        String placeInfoLat = resultSet.getString("placeInfoLat");
        String placeInfoPhone = resultSet.getString("placeInfoPhone");
        String placeInfoAddress = resultSet.getString("placeInfoAddress");
        String placeInfoName = resultSet.getString("placeInfoName");
        String foodOpentime = resultSet.getString("foodOpentime");
        String foodCategoryName = resultSet.getString("foodCategoryName");
        Integer foodCategoryID = resultSet.getInt("foodCategoryID");
        String districtName = resultSet.getString("districtName");
        Integer districtID = resultSet.getInt("districtID");
        String content = resultSet.getString("content");
        List<FoodInforDTO> foodInforDTOList = new ArrayList<FoodInforDTO>();

        return new FoodDetailDTO(placeInfoID, placeInfoImages, placeInfoLng, placeInfoLat, placeInfoPhone, placeInfoAddress, placeInfoName,foodOpentime,foodCategoryName,foodCategoryID,districtName,districtID,content,foodInforDTOList);
    }


}
