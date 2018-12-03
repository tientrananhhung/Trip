package edu.poly.model;

import java.sql.Date;
import java.sql.Timestamp;

public class PostIndexDTO {
    private Integer id;
    private String title;
    private String image;
    private String description;
    private Integer view;
    private Date updatedAt;

    public PostIndexDTO() {
    }

    public PostIndexDTO(Integer id, String title, String image, String description, Integer view, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.view = view;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
