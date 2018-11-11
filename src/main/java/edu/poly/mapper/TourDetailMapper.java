package edu.poly.mapper;

import edu.poly.model.TourDetailDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TourDetailMapper implements RowMapper<TourDetailDTO> {

    @Override
    public TourDetailDTO mapRow(ResultSet resultSet, int i) throws SQLException {

        List<String> img = new ArrayList<>();

        Integer id = resultSet.getInt("id");
        String name = resultSet.getString("Name");
        String address = resultSet.getString("Address");
        String content = resultSet.getString("Content");
        String images = resultSet.getString("Images");
        Integer policy = resultSet.getInt("Policy");
        String lat = resultSet.getString("Lat");
        String lng = resultSet.getString("Lng");
        Boolean deleted = resultSet.getBoolean("Is_deleted");
        Integer partnerId = resultSet.getInt("partnerId");
        String partnerName = resultSet.getString("partnerName");
        String partnerAddress = resultSet.getString("partnerAddress");
        Integer serviceId = resultSet.getInt("serviceId");
        String serviceName = resultSet.getString("serviceName");
        String servicePrice = resultSet.getString("servicePrice");
        String serviceNormalPrice = resultSet.getString("serviceNormalPrice");
        String serviceDetail = resultSet.getString("serviceDetail");
        Boolean serviceIsDefault = resultSet.getBoolean("serviceIsDefault");
        Boolean serviceIsdeted = resultSet.getBoolean("serviceIsdeted");
        Integer ticketId = resultSet.getInt("ticketId");
        Integer ticketQuantity = resultSet.getInt("ticketQuantity");
        Boolean ticketType = resultSet.getBoolean("ticketType");
        Integer ticketCount = resultSet.getInt("ticketCount");
        String[] arStr = images.split("\\,");
        for (String item : arStr) {
            img.add(item);
        }
        return new TourDetailDTO(id, name, address, content, img, policy, lat, lng, deleted, partnerId, partnerName, partnerAddress, serviceId, serviceName, servicePrice, serviceNormalPrice, serviceDetail, serviceIsDefault, serviceIsdeted, ticketId, ticketQuantity, ticketType, ticketCount);
    }
}