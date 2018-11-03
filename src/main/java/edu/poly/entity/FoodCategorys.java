package edu.poly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "food_categorys", schema = "trip", catalog = "")
public class FoodCategorys {
    private int id;
    private String name;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Foods> foodsById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        FoodCategorys that = (FoodCategorys) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(isDeleted, that.isDeleted) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "foodCategorysByFoodCategoryId", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Foods> getFoodsById() {
        return foodsById;
    }

    public void setFoodsById(Collection<Foods> foodsById) {
        this.foodsById = foodsById;
    }
}
