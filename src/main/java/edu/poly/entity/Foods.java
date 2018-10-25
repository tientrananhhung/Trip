package edu.poly.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "foods")
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Opentime")
    private String openTime;

    @Column(name = "Is_deleted")
    private boolean isDeleted;

    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "Updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private FoodCategorys foodCategorys;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Users users;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<PlaceInfors> placeInfors = new HashSet<PlaceInfors>(0);

    public Foods() {
    }

    public Foods(String name, String openTime, boolean isDeleted, Date createdAt, Date updatedAt, FoodCategorys foodCategorys, Users users) {
        this.name = name;
        this.openTime = openTime;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.foodCategorys = foodCategorys;
        this.users = users;
    }

    public Foods(String name, String openTime, boolean isDeleted, Date createdAt, Date updatedAt, FoodCategorys foodCategorys, Users users, Set<PlaceInfors> placeInfors) {
        this.name = name;
        this.openTime = openTime;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.foodCategorys = foodCategorys;
        this.users = users;
        this.placeInfors = placeInfors;
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

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
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

    public FoodCategorys getFoodCategorys() {
        return foodCategorys;
    }

    public void setFoodCategorys(FoodCategorys foodCategorys) {
        this.foodCategorys = foodCategorys;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Set<PlaceInfors> getPlaceInfors() {
        return placeInfors;
    }

    public void setPlaceInfors(Set<PlaceInfors> placeInfors) {
        this.placeInfors = placeInfors;
    }

}
