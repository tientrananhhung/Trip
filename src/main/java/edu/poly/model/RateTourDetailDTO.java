package edu.poly.model;


public class RateTourDetailDTO {
    private Integer id;
    private String comment;
    private Integer star;
    private Boolean isDeleted;
    private String createdAt;
    private String updatedAt;
    private String name;
    private String avatar;
    private Integer totalPage;
    private Double totalRate;
    private Integer totalComment;

    public RateTourDetailDTO() {
    }

    public RateTourDetailDTO(Integer id, String comment, Integer star, Boolean isDeleted, String createdAt, String updatedAt, String name, String avatar, Integer totalPage, Double totalRate, Integer totalComment) {
        this.id = id;
        this.comment = comment;
        this.star = star;
        this.isDeleted = isDeleted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.avatar = avatar;
        this.totalPage = totalPage;
        this.totalRate = totalRate;
        this.totalComment = totalComment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Double getTotalRate() {
        return totalRate;
    }

    public void setTotalRate(Double totalRate) {
        this.totalRate = totalRate;
    }

    public Integer getTotalComment() {
        return totalComment;
    }

    public void setTotalComment(Integer totalComment) {
        this.totalComment = totalComment;
    }
}