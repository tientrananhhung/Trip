package edu.poly.model;

public class PostCountStatisticsDTO {
    private Integer Tong_Post;
    private Integer Deleted;
    private Integer Max_View;
    private String Title;
    private String Users;
    private String thang;
    public PostCountStatisticsDTO() {
    }

    public PostCountStatisticsDTO(Integer tong_Post, Integer deleted, Integer max_View, String title, String users, String thang) {
        Tong_Post = tong_Post;
        Deleted = deleted;
        Max_View = max_View;
        Title = title;
        Users = users;
        this.thang = thang;
    }

    public Integer getTong_Post() {
        return Tong_Post;
    }

    public void setTong_Post(Integer tong_Post) {
        Tong_Post = tong_Post;
    }

    public Integer getDeleted() {
        return Deleted;
    }

    public void setDeleted(Integer deleted) {
        Deleted = deleted;
    }

    public Integer getMax_View() {
        return Max_View;
    }

    public void setMax_View(Integer max_View) {
        Max_View = max_View;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUsers() {
        return Users;
    }

    public void setUsers(String users) {
        Users = users;
    }

    public String getThang() {
        return thang;
    }

    public void setThang(String thang) {
        this.thang = thang;
    }
}
