package edu.poly.model;

public class UserStatisticsDTO {
    private Integer Tong_User;
    private Integer Actived;
    private Integer Deleted;
    private String Thang;

    public UserStatisticsDTO() {
    }

    public UserStatisticsDTO(Integer tong_User, Integer actived, Integer deleted, String thang) {
        Tong_User = tong_User;
        Actived = actived;
        Deleted = deleted;
        Thang = thang;
    }

    public Integer getTong_User() {
        return Tong_User;
    }

    public void setTong_User(Integer tong_User) {
        Tong_User = tong_User;
    }

    public Integer getActived() {
        return Actived;
    }

    public void setActived(Integer actived) {
        Actived = actived;
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
