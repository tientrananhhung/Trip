package edu.poly.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "place_infors")
public class PlaceInfors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Lat")
    private String lat;

    @Column(name = "Lng")
    private String lng;

    @Column(name = "Images")
    private String images;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Address")
    private String address;

    @Column(name = "Content")
    private String content;

    @Column(name = "Is_deleted")
    private boolean isDeleted;

    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "Updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Districts districts;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Foods foods;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<FoodInfors> foodInfors = new HashSet<FoodInfors>(0);

    public PlaceInfors() {
    }

    public PlaceInfors(String name, String lat, String lng, String images, String phone, String address, String content, boolean isDeleted, Date createdAt, Date updatedAt, Districts districts, Foods foods) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.images = images;
        this.phone = phone;
        this.address = address;
        this.content = content;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.districts = districts;
        this.foods = foods;
    }

    public PlaceInfors(String name, String lat, String lng, String images, String phone, String address, String content, boolean isDeleted, Date createdAt, Date updatedAt, Districts districts, Foods foods, Set<FoodInfors> foodInfors) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.images = images;
        this.phone = phone;
        this.address = address;
        this.content = content;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.districts = districts;
        this.foods = foods;
        this.foodInfors = foodInfors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Districts getDistricts() {
        return districts;
    }

    public void setDistricts(Districts districts) {
        this.districts = districts;
    }

    public Foods getFoods() {
        return foods;
    }

    public void setFoods(Foods foods) {
        this.foods = foods;
    }

    public Set<FoodInfors> getFoodInfors() {
        return foodInfors;
    }

    public void setFoodInfors(Set<FoodInfors> foodInfors) {
        this.foodInfors = foodInfors;
    }

}
