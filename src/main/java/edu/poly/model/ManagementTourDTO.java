package edu.poly.model;

import edu.poly.common.StringUtils;

public class ManagementTourDTO {

    private Integer id;
    private String name;
    private String address;
    private String image;
    private Integer policy;
    private String service;
    private String price;
    private String normalPrice;
    private Integer count;
    private Boolean isDefault;
    private Boolean isDeleted;

    public ManagementTourDTO() {
    }

    public ManagementTourDTO(Integer id, String name, String address, String image, Integer policy, String service, String price, String normalPrice, Integer count, Boolean isDefault, Boolean isDeleted) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.image = image;
        this.policy = policy;
        this.service = service;
        this.price = price;
        this.normalPrice = normalPrice;
        this.count = count;
        this.isDefault = isDefault;
        this.isDeleted = isDeleted;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getPolicy() {
        return policy;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
}
