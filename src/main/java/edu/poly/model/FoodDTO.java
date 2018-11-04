package edu.poly.model;

public class FoodDTO {

    private Integer id;
    private String category;
    private String name;
    private String address;
    private String openTime;
    private String image;
    private String district;

    public FoodDTO() {
    }

    public FoodDTO(Integer id, String category, String name, String address, String openTime, String image, String district) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.image = image;
        this.district = district;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
