package edu.poly.model;

import java.util.Date;

public class OrderDTO {
    private Integer orderID;
    private String customerName;
    private String serviceName;
    private String userEmail;
    private Integer payment;
    private Boolean isPurchased;
    private Date orderDate;
    private String note;
    private String phoneUser;
    private String serviceDate;
    private String totalPrice;
    private String totalPriceAfter;

    public OrderDTO() {
    }

    public OrderDTO(Integer orderID, String customerName, String serviceName, String userEmail, Integer payment, Boolean isPurchased, Date orderDate, String note, String phoneUser, String serviceDate, String totalPrice, String totalPriceAfter) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.userEmail = userEmail;
        this.payment = payment;
        this.isPurchased = isPurchased;
        this.orderDate = orderDate;
        this.note = note;
        this.phoneUser = phoneUser;
        this.serviceDate = serviceDate;
        this.totalPrice = totalPrice;
        this.totalPriceAfter = totalPriceAfter;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
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
}
