package edu.poly.model;

public class PostStatisticsDTO {
    private Integer Tong_Post;
    private Integer Deleted;
    private String Thang;

    public PostStatisticsDTO() {
    }

    public PostStatisticsDTO(Integer tong_Post,Integer deleted, String thang) {
        Tong_Post = tong_Post;
        Deleted = deleted;
        Thang = thang;
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

    public String getThang() {
        return Thang;
    }

    public void setThang(String thang) {
        Thang = thang;
    }
}
