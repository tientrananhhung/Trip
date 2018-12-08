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

        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String content = resultSet.getString("Content");
        String image = resultSet.getString("Image");
        Integer policy = resultSet.getInt("Policy");
        String lat = resultSet.getString("Lat");
        String lng = resultSet.getString("Lng");
        Integer serviceId = resultSet.getInt("ServiceId");
        String serviceName = resultSet.getString("ServiceName");
        Integer price = resultSet.getInt("Price");
        Integer normalPrice = resultSet.getInt("Normal_price");
        String detail = resultSet.getString("Detail");
        String rule = resultSet.getString("Rule");
        Boolean isDefault = resultSet.getBoolean("Is_default");
        Boolean isDeleted = resultSet.getBoolean("Is_Deleted");

        //Cắt chuỗi thành mảng TypeTicketPartnerDTO
        String[] arRules = rule.split("\\,");
        for(String item : arRules){
            String[] arRule = item.split("\\:");
            TypeTicketPartnerDTO typeTicketDTO = new TypeTicketPartnerDTO(arRule[0], Integer.parseInt(arRule[1]));
            typeTicketPartnerDTO.add(typeTicketDTO);
        }

        //Cắt chuỗi thành mảng TypeTicketPartnerDTO
        ServicePartnerDTO serviceDTO = new ServicePartnerDTO(serviceId, serviceName, price, normalPrice, detail, isDefault, isDeleted, typeTicketPartnerDTO);

        return new TourPartnerDTO(id, name, address, content, image, policy, lat, lng, serviceDTO);
    }
}
