package edu.poly.mapper;

import edu.poly.model.OrderDTO;
import edu.poly.model.TicketDetailDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderMapper implements RowMapper<OrderDTO> {

    @Override
    public OrderDTO mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer orderID = resultSet.getInt("id");
        String customerName = resultSet.getString("customername");
        String servicename = resultSet.getString("servicename");
        String userEmail = resultSet.getString("email");
        Integer payment = resultSet.getInt("payment");
        String payment1 = null;
        if(payment == 1){
            payment1 = "Chuyển khoản";
        } else if(payment == 2){
            payment1 = "Tại quầy Smartrip";
        } else {
            payment1 = "Tại điểm du lịch";
        }
Long policy1 = resultSet.getLong("policy");
        Boolean isPurchased = resultSet.getBoolean("purchased");
        Date orderDate = resultSet.getDate("datecreate");
        String tourName = resultSet.getString("tourname");
        String tourAddress = resultSet.getString("address");
        String data = resultSet.getString("data");
        String[] arRules3 = data.split("\\,");
        String note = arRules3[0].split("\\:")[1];
        String phoneUser =  arRules3[1].split("\\:")[1];
        String serviceName =  arRules3[2].split("\\:")[1];
        String serviceDate =  arRules3[3].split("\\:")[1];
        String totalPrice = arRules3[4].split("\\:")[1];
        String totalPriceAfter = arRules3[5].split("\\:")[1];
        String offercode = arRules3[7].split("\\:")[1];
        String offerdeal = arRules3[8].split("\\:")[1];
// tách data
        int b = data.indexOf("[");
        String c = data.substring(b+1, data.length()-1);
        String[] arRules = c.split("\\;");
        String[] arRules1;
        List<TicketDetailDTO> list = new ArrayList<TicketDetailDTO>();
        for(int k = 0; k < arRules.length; k++){
            String d = arRules[k].substring(1, arRules[k].length()-1);
            arRules1 = d.split("\\,");
            TicketDetailDTO ticketDetailDTO = new TicketDetailDTO();
            ticketDetailDTO.setNameTicket(arRules1[0].split("\\:")[1]);
            ticketDetailDTO.setPriceTicket(arRules1[1].split("\\:")[1]);
            ticketDetailDTO.setQuantityTicket(Integer.valueOf(arRules1[2].split("\\:")[1]));
            list.add(ticketDetailDTO);
        }
        return new OrderDTO(orderID,customerName, serviceName, userEmail,payment1,isPurchased,orderDate, tourName,tourAddress,  note,  offercode, offerdeal, phoneUser, serviceDate,totalPrice, totalPriceAfter,policy1*3600000, list);
    }

    public static long toLong(int i){
        long l;
        if (i<0){
            l=-Integer.toUnsignedLong(Math.abs(i));
        }
        else{
            l=Integer.toUnsignedLong(i);
        }
        return l;
    }
}
