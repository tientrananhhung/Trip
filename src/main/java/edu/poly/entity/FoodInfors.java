package edu.poly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "food_infors", schema = "trip", catalog = "")
public class FoodInfors {
    private int id;
    private int placeInforId;
    private String name;
    private int price;
    private String images;
    private String detail;
    private Boolean isDeletedAt;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private PlaceInfors placeInforsByPlaceInforId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "place_infor_id", nullable = false)
    public int getPlaceInforId() {
        return placeInforId;
    }

    public void setPlaceInforId(int placeInforId) {
        this.placeInforId = placeInforId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Price", nullable = false)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
    @Column(name = "Detail", nullable = true, length = -1)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "Is_deleted_at", nullable = true)
    public Boolean getDeletedAt() {
        return isDeletedAt;
    }

    public void setDeletedAt(Boolean deletedAt) {
        isDeletedAt = deletedAt;
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
        FoodInfors that = (FoodInfors) o;
        return id == that.id &&
                placeInforId == that.placeInforId &&
                price == that.price &&
                Objects.equals(name, that.name) &&
                Objects.equals(images, that.images) &&
                Objects.equals(detail, that.detail) &&
                Objects.equals(isDeletedAt, that.isDeletedAt) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placeInforId, name, price, images, detail, isDeletedAt, createdAt, updatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "place_infor_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public PlaceInfors getPlaceInforsByPlaceInforId() {
        return placeInforsByPlaceInforId;
    }

    public void setPlaceInforsByPlaceInforId(PlaceInfors placeInforsByPlaceInforId) {
        this.placeInforsByPlaceInforId = placeInforsByPlaceInforId;
    }
}
