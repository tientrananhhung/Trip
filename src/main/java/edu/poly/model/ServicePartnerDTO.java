package edu.poly.model;

import edu.poly.common.StringUtils;

import java.util.List;

public class ServicePartnerDTO {
    private Integer id;
    private String name;
    private String price;
    private String normalPrice;
    private String detail;
    private Boolean isDefault;
    private Boolean isDeleted;
    List<TypeTicketPartnerDTO> typeTicket;

    public ServicePartnerDTO() {
    }

    public ServicePartnerDTO(Integer id, String name, String price, String normalPrice, String detail, Boolean isDefault, Boolean isDeleted, List<TypeTicketPartnerDTO> typeTicket) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.normalPrice = normalPrice;
        this.detail = detail;
        this.isDefault = isDefault;
        this.isDeleted = isDeleted;
        this.typeTicket = typeTicket;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return StringUtils.formatCurrency(price);
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNormalPrice() {
        return StringUtils.formatCurrency(normalPrice);
    }

    public void setNormalPrice(String normalPrice) {
        this.normalPrice = normalPrice;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public List<TypeTicketPartnerDTO> getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(List<TypeTicketPartnerDTO> typeTicket) {
        this.typeTicket = typeTicket;
    }
}
