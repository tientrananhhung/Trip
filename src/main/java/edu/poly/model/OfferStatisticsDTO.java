package edu.poly.model;

public class OfferStatisticsDTO {
    private Integer Tong_Offer;
    private Integer Used;
    private String Thang;

    public OfferStatisticsDTO() {
    }

    public OfferStatisticsDTO(Integer tong_Offer, Integer used, String thang) {
        Tong_Offer = tong_Offer;
        Used = used;
        Thang = thang;
    }

    public Integer getTong_Offer() {
        return Tong_Offer;
    }

    public void setTong_Offer(Integer tong_Offer) {
        Tong_Offer = tong_Offer;
    }

    public Integer getUsed() {
        return Used;
    }

    public void setUsed(Integer used) {
        Used = used;
    }

    public String getThang() {
        return Thang;
    }

    public void setThang(String thang) {
        Thang = thang;
    }
}
