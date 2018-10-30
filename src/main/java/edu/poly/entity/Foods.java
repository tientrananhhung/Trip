package edu.poly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "foods")
public class Foods {
    private int id;
    private int foodCategoryId;
    private int userId;
    private String name;
    private String opentime;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private FoodCategorys foodCategorysByFoodCategoryId;
    private Users usersByUserId;
    private Collection<PlaceInfors> placeInforsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "food_category_id", nullable = false)
    public int getFoodCategoryId() {
        return foodCategoryId;
    }

    public void setFoodCategoryId(int foodCategoryId) {
        this.foodCategoryId = foodCategoryId;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
    @Column(name = "Opentime", nullable = true, length = 50)
    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
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
        Foods foods = (Foods) o;
        return id == foods.id &&
                foodCategoryId == foods.foodCategoryId &&
                userId == foods.userId &&
                Objects.equals(name, foods.name) &&
                Objects.equals(opentime, foods.opentime) &&
                Objects.equals(isDeleted, foods.isDeleted) &&
                Objects.equals(createdAt, foods.createdAt) &&
                Objects.equals(updatedAt, foods.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, foodCategoryId, userId, name, opentime, isDeleted, createdAt, updatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "food_category_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public FoodCategorys getFoodCategorysByFoodCategoryId() {
        return foodCategorysByFoodCategoryId;
    }

    public void setFoodCategorysByFoodCategoryId(FoodCategorys foodCategorysByFoodCategoryId) {
        this.foodCategorysByFoodCategoryId = foodCategorysByFoodCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    @OneToMany(mappedBy = "foodsByFoodId")
    public Collection<PlaceInfors> getPlaceInforsById() {
        return placeInforsById;
    }

    public void setPlaceInforsById(Collection<PlaceInfors> placeInforsById) {
        this.placeInforsById = placeInforsById;
    }
}
