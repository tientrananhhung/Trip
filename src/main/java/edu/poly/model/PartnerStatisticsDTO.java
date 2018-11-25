package edu.poly.model;

public class PartnerStatisticsDTO {
    private Integer Tong_Partner;
    private Integer Actived;
    private Integer Deleted;
    private String Thang;

    public PartnerStatisticsDTO() {
    }

    public PartnerStatisticsDTO(Integer tong_Partner, Integer actived, Integer deleted, String thang) {
        Tong_Partner = tong_Partner;
        Actived = actived;
        Deleted = deleted;
        Thang = thang;
    }

    public Integer getTong_Partner() {
        return Tong_Partner;
    }

    public void setTong_Partner(Integer tong_Partner) {
        Tong_Partner = tong_Partner;
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
