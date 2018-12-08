package edu.poly.model;

import java.util.List;

public class ServicePartnerDTO {
    private Integer id;
    private String name;
    private Integer price;
    private Integer normalPrice;
    private String detail;
    private Boolean isDefault;
    private Boolean isDeleted;
    List<TypeTicketPartnerDTO> typeTicket;

    public ServicePartnerDTO() {
    }

    public ServicePartnerDTO(Integer id, String name, Integer price, Integer normalPrice, String detail, Boolean isDefault, Boolean isDeleted, List<TypeTicketPartnerDTO> typeTicket) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(Integer normalPrice) {
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
