package edu.poly.mapper;

import edu.poly.model.ServicePartnerDTO;
import edu.poly.model.TourPartnerDTO;
import edu.poly.model.TypeTicketPartnerDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TourPartnerMapper implements RowMapper<TourPartnerDTO> {
    @Override
    public TourPartnerDTO mapRow(ResultSet resultSet, int i) throws SQLException {

        List<TypeTicketPartnerDTO> typeTicketPartnerDTO = new ArrayList<>();
        List<ServicePartnerDTO> servicePartnerDTO = new ArrayList<>();
        List<String> arrImages = new ArrayList<>();

        Integer id = resultSet.getInt("id");
        Integer userId = resultSet.getInt("user_id");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String content = resultSet.getString("Content");
        String image = resultSet.getString("Image");
        String images = resultSet.getString("Images");
        Integer policy = resultSet.getInt("Policy");
        String lat = resultSet.getString("Lat");
        String lng = resultSet.getString("Lng");
        Integer serviceId = resultSet.getInt("ServiceId");
        String serviceName = resultSet.getString("ServiceName");
        String price = resultSet.getString("Price");
        String normalPrice = resultSet.getString("Normal_price");
        String detail = resultSet.getString("Detail");
        String rule = resultSet.getString("Rule");
        Boolean isDefault = resultSet.getBoolean("Is_default");
        Boolean isDeleted = resultSet.getBoolean("Is_Deleted");

        //Cắt chuỗi thành mảng TypeTicketPartnerDTO
        String[] arRules = rule.split("\\,");
        for(String item : arRules){
            String[] arRule = item.split("\\:");
            TypeTicketPartnerDTO typeTicketDTO = new TypeTicketPartnerDTO(arRule[0], arRule[1]);
            typeTicketPartnerDTO.add(typeTicketDTO);
        }

        //Cắt chuỗi thành mảng image
        String[] arImages = images.split("\\,");
        for(String item : arImages){
            arrImages.add(item);
        }

        //Tạo và gán giá trị cho ServicePartnerDTO
        ServicePartnerDTO serviceDTO = new ServicePartnerDTO(serviceId, serviceName, price, normalPrice, detail, isDefault, isDeleted, typeTicketPartnerDTO);

        return new TourPartnerDTO(id, userId, name, address, content, image, arrImages, policy, lat, lng, serviceDTO);
    }
}
