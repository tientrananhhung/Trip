package edu.poly.model;

public class PostDTO {
    private Integer id;
    private String image;
    private String title;
    private String categoryname;
    private String description;

    public PostDTO() {
    }

    public PostDTO(Integer id, String image, String title, String categoryname,String description) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.categoryname = categoryname;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
