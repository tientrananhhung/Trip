package edu.poly.model;

public class FoodInforDTO {

    private Integer id;
    private String Name;
    private String Price;
    private String Images;
    private String Detail;

    public FoodInforDTO() {
    }

    public FoodInforDTO(Integer id, String name, String price, String images, String detail) {
        this.id = id;
        Name = name;
        Price = price;
        Images = images;
        Detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getImages() {
        return Images;
    }

    public void setImages(String images) {
        Images = images;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
