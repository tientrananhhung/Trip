package edu.poly.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "users")
public class Users {
    private int id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String address;
    private Date birthday;
    private Boolean gender;
    private String avatar;
    private int role;
    private Boolean isActive;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String token;
    private Collection<Foods> foodsById;
    private Collection<Offers> offersById;
    private Collection<Orders> ordersById;
    private Collection<Partners> partnersById;
    private Collection<Posts> postsById;
    private Collection<Rates> ratesById;
    private Collection<Tours> toursById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @NotEmpty
    @Column(name = "Name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @NotEmpty
    @Column(name = "Username", nullable = false, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "Password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @NotEmpty
    @Column(name = "Phone", nullable = true, length = 12,unique = true)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @NotEmpty
    @Column(name = "Email", nullable = true, length = 50,unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "Birthday", nullable = true)
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "Gender", nullable = true)
    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Avatar", nullable = true, length = 50)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "Role", nullable = false)
    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Basic
    @Column(name = "Is_active", nullable = true)
    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
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

    @Basic
    @Column(name = "Token", nullable = true)
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return id == users.id &&
                role == users.role &&
                Objects.equals(name, users.name) &&
                Objects.equals(username, users.username) &&
                Objects.equals(password, users.password) &&
                Objects.equals(phone, users.phone) &&
                Objects.equals(email, users.email) &&
                Objects.equals(address, users.address) &&
                Objects.equals(birthday, users.birthday) &&
                Objects.equals(gender, users.gender) &&
                Objects.equals(avatar, users.avatar) &&
                Objects.equals(isActive, users.isActive) &&
                Objects.equals(isDeleted, users.isDeleted) &&
                Objects.equals(createdAt, users.createdAt) &&
                Objects.equals(updatedAt, users.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, phone, email, address, birthday, gender, avatar, role, isActive, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.LAZY)
//    @Fetch(value = FetchMode.SUBSELECT)
//    @JsonIgnoreProperties({"foodsById"})
//    @Fetch (FetchMode.SELECT)
    public Collection<Foods> getFoodsById() {
        return foodsById;
    }

    public void setFoodsById(Collection<Foods> foodsById) {
        this.foodsById = foodsById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.LAZY)
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Offers> getOffersById() {
        return offersById;
    }

    public void setOffersById(Collection<Offers> offersById) {
        this.offersById = offersById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.LAZY)
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Partners> getPartnersById() {
        return partnersById;
    }

    public void setPartnersById(Collection<Partners> partnersById) {
        this.partnersById = partnersById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.LAZY )
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Posts> getPostsById() {
        return postsById;
    }

    public void setPostsById(Collection<Posts> postsById) {
        this.postsById = postsById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.LAZY )
//    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Rates> getRatesById() {
        return ratesById;
    }

    public void setRatesById(Collection<Rates> ratesById) {
        this.ratesById = ratesById;
    }

    @OneToMany(mappedBy = "usersByUserId",  fetch = FetchType.EAGER )
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Tours> getToursById() {
        return toursById;
    }

    public void setToursById(Collection<Tours> toursById) {
        this.toursById = toursById;
    }
}
