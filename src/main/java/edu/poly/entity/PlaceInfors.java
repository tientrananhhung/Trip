package edu.poly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "place_infors", schema = "trip", catalog = "")
public class PlaceInfors {
    private int id;
    private int foodId;
    private int districtId;
    private String name;
    private String lat;
    private String lng;
    private String images;
    private String phone;
    private String address;
    private String content;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<FoodInfors> foodInforsById;
    private Foods foodsByFoodId;
    private Districts districtsByDistrictId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "food_id", nullable = false)
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Basic
    @Column(name = "district_id", nullable = false)
    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Lat", nullable = true, length = 30)
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "Lng", nullable = true, length = 30)
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Basic
    @Column(name = "Images", nullable = true, length = 50)
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Basic
    @Column(name = "Phone", nullable = true, length = 12)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Is_deleted", nullable = true)
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "Created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "Updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceInfors that = (PlaceInfors) o;
        return id == that.id &&
                foodId == that.foodId &&
                districtId == that.districtId &&
                Objects.equals(name, that.name) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(lng, that.lng) &&
                Objects.equals(images, that.images) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(content, that.content) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, foodId, districtId, name, lat, lng, images, phone, address, content, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "placeInforsByPlaceInforId")
    public Collection<FoodInfors> getFoodInforsById() {
        return foodInforsById;
    }

    public void setFoodInforsById(Collection<FoodInfors> foodInforsById) {
        this.foodInforsById = foodInforsById;
    }

    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Foods getFoodsByFoodId() {
        return foodsByFoodId;
    }

    public void setFoodsByFoodId(Foods foodsByFoodId) {
        this.foodsByFoodId = foodsByFoodId;
    }

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Districts getDistrictsByDistrictId() {
        return districtsByDistrictId;
    }

    public void setDistrictsByDistrictId(Districts districtsByDistrictId) {
        this.districtsByDistrictId = districtsByDistrictId;
    }
}
