package edu.poly.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "districts")
public class Districts {
    private int id;
    private String name;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
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
    @Column(name = "Name", nullable = false, length = 50)
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
        Districts districts = (Districts) o;
        return id == districts.id &&
                Objects.equals(name, districts.name) &&
                Objects.equals(isDeleted, districts.isDeleted) &&
                Objects.equals(createdAt, districts.createdAt) &&
                Objects.equals(updatedAt, districts.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "districtsByDistrictId")
    public Collection<PlaceInfors> getPlaceInforsById() {
        return placeInforsById;
    }

    public void setPlaceInforsById(Collection<PlaceInfors> placeInforsById) {
        this.placeInforsById = placeInforsById;
    }
}
