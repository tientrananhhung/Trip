package edu.poly.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Offers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Code")
    private String code;

    @Column(name = "Deal")
    private int deal;

    @Column(name = "Is_used")
    private int isUsed;

    @Column(name = "Created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Users users;

    public Offers() {
    }

    public Offers(String code, int deal, int isUsed, Date createdAt, Users users) {
        this.code = code;
        this.deal = deal;
        this.isUsed = isUsed;
        this.createdAt = createdAt;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDeal() {
        return deal;
    }

    public void setDeal(int deal) {
        this.deal = deal;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
        this.isUsed = isUsed;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
