package edu.poly.model;

import java.util.List;

public class FoodDetailDTO {
private Integer placeInfoID;
private String placeInfoImage;
private String placeInfoLng;
private String placeInfoLat;
private String placeInfoPhone;
private String placeInfoAddress;
private String placeInfoName;
private String foodOpentime;
private String foodCategoryName;
private Integer foodCategoryID;
private String districtName;
private Integer districtID;
private List<FoodInforDTO> foodInforDTOList;

    public FoodDetailDTO() {
    }

    public FoodDetailDTO(Integer placeInfoID, String placeInfoImage, String placeInfoLng, String placeInfoLat, String placeInfoPhone, String placeInfoAddress, String placeInfoName, String foodOpentime, String foodCategoryName, Integer foodCategoryID, String districtName, Integer districtID, List<FoodInforDTO> foodInforDTOList) {
        this.placeInfoID = placeInfoID;
        this.placeInfoImage = placeInfoImage;
        this.placeInfoLng = placeInfoLng;
        this.placeInfoLat = placeInfoLat;
        this.placeInfoPhone = placeInfoPhone;
        this.placeInfoAddress = placeInfoAddress;
        this.placeInfoName = placeInfoName;
        this.foodOpentime = foodOpentime;
        this.foodCategoryName = foodCategoryName;
        this.foodCategoryID = foodCategoryID;
        this.districtName = districtName;
        this.districtID = districtID;
        this.foodInforDTOList = foodInforDTOList;
    }

    public Integer getPlaceInfoID() {
        return placeInfoID;
    }

    public void setPlaceInfoID(Integer placeInfoID) {
        this.placeInfoID = placeInfoID;
    }

    public String getPlaceInfoImage() {
        return placeInfoImage;
    }

    public void setPlaceInfoImage(String placeInfoImage) {
        this.placeInfoImage = placeInfoImage;
    }

    public String getPlaceInfoLng() {
        return placeInfoLng;
    }

    public void setPlaceInfoLng(String placeInfoLng) {
        this.placeInfoLng = placeInfoLng;
    }

    public String getPlaceInfoLat() {
        return placeInfoLat;
    }

    public void setPlaceInfoLat(String placeInfoLat) {
        this.placeInfoLat = placeInfoLat;
    }

    public String getPlaceInfoPhone() {
        return placeInfoPhone;
    }

    public void setPlaceInfoPhone(String placeInfoPhone) {
        this.placeInfoPhone = placeInfoPhone;
    }

    public String getPlaceInfoAddress() {
        return placeInfoAddress;
    }

    public void setPlaceInfoAddress(String placeInfoAddress) {
        this.placeInfoAddress = placeInfoAddress;
    }

    public String getPlaceInfoName() {
        return placeInfoName;
    }

    public void setPlaceInfoName(String placeInfoName) {
        this.placeInfoName = placeInfoName;
    }

    public String getFoodOpentime() {
        return foodOpentime;
    }

    public void setFoodOpentime(String foodOpentime) {
        this.foodOpentime = foodOpentime;
    }

    public String getFoodCategoryName() {
        return foodCategoryName;
    }

    public void setFoodCategoryName(String foodCategoryName) {
        this.foodCategoryName = foodCategoryName;
    }

    public Integer getFoodCategoryID() {
        return foodCategoryID;
    }

    public void setFoodCategoryID(Integer foodCategoryID) {
        this.foodCategoryID = foodCategoryID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Integer getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Integer districtID) {
        this.districtID = districtID;
    }

    public List<FoodInforDTO> getFoodInforDTOList() {
        return foodInforDTOList;
    }

    public void setFoodInforDTOList(List<FoodInforDTO> foodInforDTOList) {
        this.foodInforDTOList = foodInforDTOList;
    }
}
