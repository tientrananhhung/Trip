package edu.poly.model;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private Integer orderID;
    private String customerName;
    private String serviceName;
    private String userEmail;
    private String payment;
    private Boolean isPurchased;
    private Date orderDate;
    private String tourName;
    private String tourAddress;
    private String note;
    private String offercode;
    private String offerdeal;
    private String phoneUser;
    private String serviceDate;
    private String totalPrice;
    private String totalPriceAfter;
    private Long policy;
    private List<TicketDetailDTO> ticketDetailDTOList;

    public OrderDTO() {
    }

    public OrderDTO(Integer orderID, String customerName, String serviceName, String userEmail, String payment, Boolean isPurchased, Date orderDate, String tourName, String tourAddress, String note, String offercode, String offerdeal, String phoneUser, String serviceDate, String totalPrice, String totalPriceAfter, Long policy, List<TicketDetailDTO> ticketDetailDTOList) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.userEmail = userEmail;
        this.payment = payment;
        this.isPurchased = isPurchased;
        this.orderDate = orderDate;
        this.tourName = tourName;
        this.tourAddress = tourAddress;
        this.note = note;
        this.offercode = offercode;
        this.offerdeal = offerdeal;
        this.phoneUser = phoneUser;
        this.serviceDate = serviceDate;
        this.totalPrice = totalPrice;
        this.totalPriceAfter = totalPriceAfter;
        this.policy = policy;
        this.ticketDetailDTOList = ticketDetailDTOList;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getOffercode() {
        return offercode;
    }

    public void setOffercode(String offercode) {
        this.offercode = offercode;
    }

    public String getOfferdeal() {
        return offerdeal;
    }

    public void setOfferdeal(String offerdeal) {
        this.offerdeal = offerdeal;
    }


    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Long getPolicy() {
        return policy;
    }

    public void setPolicy(Long policy) {
        this.policy = policy;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Boolean getPurchased() {
        return isPurchased;
    }

    public void setPurchased(Boolean purchased) {
        isPurchased = purchased;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getTourAddress() {
        return tourAddress;
    }

    public void setTourAddress(String tourAddress) {
        this.tourAddress = tourAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalPriceAfter() {
        return totalPriceAfter;
    }

    public void setTotalPriceAfter(String totalPriceAfter) {
        this.totalPriceAfter = totalPriceAfter;
    }

    public List<TicketDetailDTO> getTicketDetailDTOList() {
        return ticketDetailDTOList;
    }

    public void setTicketDetailDTOList(List<TicketDetailDTO> ticketDetailDTOList) {
        this.ticketDetailDTOList = ticketDetailDTOList;
    }
}
