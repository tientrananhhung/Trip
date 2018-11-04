package edu.poly.model;

public class TourDTO {
    private Integer id;
    private String name;
    private String address;
    private String image;
    private Integer tQuantity;
    private Integer sPrice;
    private Integer sNormalPrice;
    private Integer count;
    private Boolean type;
    private Double rate;

    public TourDTO() {
    }

    public TourDTO(Integer id, String name, String address, String image, Integer tQuantity, Integer sPrice, Integer sNormalPrice, Integer count, Boolean type, Double rate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.image = image;
        this.tQuantity = tQuantity;
        this.sPrice = sPrice;
        this.sNormalPrice = sNormalPrice;
        this.count = count;
        this.type = type;
        this.rate = rate;
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

    public Integer gettQuantity() {
        return tQuantity;
    }

    public void settQuantity(Integer tQuantity) {
        this.tQuantity = tQuantity;
    }

    public Integer getsPrice() {
        return sPrice;
    }

    public void setsPrice(Integer sPrice) {
        this.sPrice = sPrice;
    }

    public Integer getsNormalPrice() {
        return sNormalPrice;
    }

    public void setsNormalPrice(Integer sNormalPrice) {
        this.sNormalPrice = sNormalPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}