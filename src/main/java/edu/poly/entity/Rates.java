package edu.poly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rates")
public class Rates {
    private int id;
    private int tourId;
    private int userId;
    private String comment;
    private int star;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Tours toursByTourId;
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
    @Column(name = "tour_id", nullable = false)
    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
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
    @Column(name = "Comment", nullable = true, length = 250)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "Star", nullable = false)
    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
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
        Rates rates = (Rates) o;
        return id == rates.id &&
                tourId == rates.tourId &&
                userId == rates.userId &&
                star == rates.star &&
                Objects.equals(comment, rates.comment) &&
                Objects.equals(isDeleted, rates.isDeleted) &&
                Objects.equals(createdAt, rates.createdAt) &&
                Objects.equals(updatedAt, rates.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tourId, userId, comment, star, isDeleted, createdAt, updatedAt);
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tour_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Tours getToursByTourId() {
        return toursByTourId;
    }

    public void setToursByTourId(Tours toursByTourId) {
        this.toursByTourId = toursByTourId;
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
