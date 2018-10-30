package edu.poly.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "posts")
public class Posts {
    private int id;
    private int postCategoryId;
    private int userId;
    private String title;
    private String content;
    private Integer view;
    private Boolean isDeleted;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private PostCategorys postCategorysByPostCategoryId;
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
    @Column(name = "post_category_id", nullable = false)
    public int getPostCategoryId() {
        return postCategoryId;
    }

    public void setPostCategoryId(int postCategoryId) {
        this.postCategoryId = postCategoryId;
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
    @Column(name = "Title", nullable = false, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "View", nullable = true)
    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
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
        Posts posts = (Posts) o;
        return id == posts.id &&
                postCategoryId == posts.postCategoryId &&
                userId == posts.userId &&
                Objects.equals(title, posts.title) &&
                Objects.equals(content, posts.content) &&
                Objects.equals(view, posts.view) &&
                Objects.equals(isDeleted, posts.isDeleted) &&
                Objects.equals(createdAt, posts.createdAt) &&
                Objects.equals(updatedAt, posts.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postCategoryId, userId, title, content, view, isDeleted, createdAt, updatedAt);
    }

    @ManyToOne
    @JoinColumn(name = "post_category_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public PostCategorys getPostCategorysByPostCategoryId() {
        return postCategorysByPostCategoryId;
    }

    public void setPostCategorysByPostCategoryId(PostCategorys postCategorysByPostCategoryId) {
        this.postCategorysByPostCategoryId = postCategorysByPostCategoryId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}
