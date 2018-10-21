package edu.poly.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Data")
    private String data;

    @Column(name = "Payment")
    private int payment;

    @Column(name = "Is_deleted")
    private boolean isDeleted;

    @Column(name = "Is_purchased")
    private boolean isPurchased;

    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "Updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Services services;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Users users;

    public Orders() {
    }

    public Orders(String data, boolean isDeleted, boolean isPurchased, Date createdAt, Date updatedAt, Services services, Users users) {
        this.data = data;
        this.isDeleted = isDeleted;
        this.isPurchased = isPurchased;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.services = services;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isPurchased() {
        return isPurchased;
    }

    public void setPurchased(boolean purchased) {
        isPurchased = purchased;
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

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
