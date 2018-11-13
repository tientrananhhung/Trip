package edu.poly.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "services")
public class Services {
    private int id;
    private int tourId;
    private String name;
    private Integer price;
    private Integer normalPrice;
    private String detail;
    private Date startDate;
    private Date endDate;
    private Boolean isDefault;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Collection<Orders> ordersById;
    private Tours toursByTourId;
    private Collection<Tickets> ticketsById;

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
    @Column(name = "Name", nullable = false, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Price", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Normal_price", nullable = true)
    public Integer getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(Integer normalPrice) {
        this.normalPrice = normalPrice;
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
    @Column(name = "Start_date", nullable = true)
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "End_date", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Is_default", nullable = true)
    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
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
        Services services = (Services) o;
        return id == services.id &&
                tourId == services.tourId &&
                Objects.equals(name, services.name) &&
                Objects.equals(price, services.price) &&
                Objects.equals(normalPrice, services.normalPrice) &&
                Objects.equals(detail, services.detail) &&
                Objects.equals(startDate, services.startDate) &&
                Objects.equals(endDate, services.endDate) &&
                Objects.equals(isDefault, services.isDefault) &&
                Objects.equals(isDeleted, services.isDeleted) &&
                Objects.equals(createdAt, services.createdAt) &&
                Objects.equals(updatedAt, services.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tourId, name, price, normalPrice, detail, startDate, endDate, isDefault, isDeleted, createdAt, updatedAt);
    }

    @OneToMany(mappedBy = "servicesByServiceId", fetch = FetchType.LAZY)
    public Collection<Orders> getOrdersById() {
        return ordersById;
    }

    public void setOrdersById(Collection<Orders> ordersById) {
        this.ordersById = ordersById;
    }

    @ManyToOne
    @JoinColumn(name = "tour_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Tours getToursByTourId() {
        return toursByTourId;
    }

    public void setToursByTourId(Tours toursByTourId) {
        this.toursByTourId = toursByTourId;
    }

    @OneToMany(mappedBy = "servicesByServiceId", fetch = FetchType.LAZY)
    @Fetch(value = FetchMode.SUBSELECT)
    public Collection<Tickets> getTicketsById() {
        return ticketsById;
    }

    public void setTicketsById(Collection<Tickets> ticketsById) {
        this.ticketsById = ticketsById;
    }
}
