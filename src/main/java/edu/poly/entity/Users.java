package edu.poly.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Username")
    private String userName;

    @Column(name = "Password")
    private String passWord;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Address")
    private String address;

    @Column(name = "Birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column(name = "Gender")
    private boolean gender;

    @Column(name = "Avatar")
    private String avatar;

    @Column(name = "Role")
    private int role;

    @Column(name = "Is_active")
    private boolean isActive;

    @Column(name = "Is_deleted")
    private boolean isDeleted;

    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "Updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Partners> partners = new HashSet<Partners>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Rates> rates = new HashSet<Rates>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Tours> tours = new HashSet<Tours>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Orders> orders = new HashSet<Orders>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Offers> offers = new HashSet<Offers>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Posts> posts = new HashSet<Posts>(0);

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    private Set<Foods> foods = new HashSet<Foods>(0);

    public Users() {
    }

    public Users(String name, String userName, String passWord, String phone, String email, String address, Date birthday, boolean gender, String avatar, int role, boolean isActive, boolean isDeleted, Date createdAt, Date updatedAt) {
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.avatar = avatar;
        this.role = role;
        this.isActive = isActive;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

    public Set<Partners> getPartners() {
        return partners;
    }

    public void setPartners(Set<Partners> partners) {
        this.partners = partners;
    }

    public Set<Rates> getRates() {
        return rates;
    }

    public void setRates(Set<Rates> rates) {
        this.rates = rates;
    }

    public Set<Tours> getTours() {
        return tours;
    }

    public void setTours(Set<Tours> tours) {
        this.tours = tours;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Set<Offers> getOffers() {
        return offers;
    }

    public void setOffers(Set<Offers> offers) {
        this.offers = offers;
    }

    public Set<Posts> getPosts() {
        return posts;
    }

    public void setPosts(Set<Posts> posts) {
        this.posts = posts;
    }

    public Set<Foods> getFoods() {
        return foods;
    }

    public void setFoods(Set<Foods> foods) {
        this.foods = foods;
    }
}