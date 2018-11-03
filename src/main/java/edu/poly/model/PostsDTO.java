package edu.poly.model;

import edu.poly.entity.PostCategorys;
import edu.poly.entity.Posts;
import edu.poly.entity.Users;

import java.sql.Timestamp;

public class PostsDTO {
    private int id;
    private String title;
    private String image;
    private String description;
    private Integer view;
    private Timestamp updatedAt;
    private PostCategorys postCategorysByPostCategoryId;
    private Users usersByUserId;

    public PostsDTO() {
    }

    public PostsDTO(int id, String title, String image, String description, Integer view, Timestamp updatedAt, PostCategorys postCategorysByPostCategoryId, Users usersByUserId) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.view = view;
        this.updatedAt = updatedAt;
        this.postCategorysByPostCategoryId = postCategorysByPostCategoryId;
        this.usersByUserId = usersByUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PostCategorys getPostCategorysByPostCategoryId() {
        return postCategorysByPostCategoryId;
    }

    public void setPostCategorysByPostCategoryId(PostCategorys postCategorysByPostCategoryId) {
        this.postCategorysByPostCategoryId = postCategorysByPostCategoryId;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }


}
