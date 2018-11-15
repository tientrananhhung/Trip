package edu.poly.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tours")
public class Tours {
    private int id;
    private int userId;
    private String name;
    private String address;
    private String content;
    private String image;
    private String images;
    private Integer policy;
    private String lat;
    private String lng;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Rates> ratesById;
    private Collection<Services> servicesById;
    private Users usersByUserId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "Address", nullable = false, length = 200)
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
    @Column(name = "Image", nullable = true, length = 50)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "Images", nullable = true, length = -1)
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Basic
    @Column(name = "Policy", nullable = true)
    public Integer getPolicy() {
        return policy;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
    }

    @Basic
    @Column(name = "Lat", nullable = true, length = 20)
    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Basic
    @Column(name = "Lng", nullable = true, length = 20)
    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
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
        Tours tours = (Tours) o;
        return id == tours.id &&
                userId == tours.userId &&
                Objects.equals(name, tours.name) &&
                Objects.equals(address, tours.address) &&
                Objects.equals(content, tours.content) &&
                Objects.equals(images, tours.images) &&
                Objects.equals(policy, tours.policy) &&
                Objects.equals(lat, tours.lat) &&
                Objects.equals(lng, tours.lng) &&
                Objects.equals(isDeleted, tours.isDeleted) &&
                Objects.equals(createdAt, tours.createdAt) &&
                Objects.equals(updatedAt, tours.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, name, address, content, images, policy, lat, lng, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "toursByTourId", fetch = FetchType.LAZY)
//    @Fetch(value = FetchMode.SUBSELECT)
//    @JsonIgnoreProperties({"ratesById"})
    public Collection<Rates> getRatesById() {
        return ratesById;
    }

    public void setRatesById(Collection<Rates> ratesById) {
        this.ratesById = ratesById;
    }

    @OneToMany(mappedBy = "toursByTourId", fetch = FetchType.LAZY)
//    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Services> getServicesById() {
        return servicesById;
    }

    public void setServicesById(Collection<Services> servicesById) {
        this.servicesById = servicesById;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}
