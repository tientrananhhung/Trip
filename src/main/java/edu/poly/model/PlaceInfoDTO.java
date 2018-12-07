package edu.poly.model;

public class PlaceInfoDTO {
    private Integer id;
    private String name;
    private String opentime;
    private Integer placeInfoID;
    private String placeInfoName;
    private String placeInfoImage;
    private String placeInfoPhone;
    private String placeInfoAddress;
    private Integer districtID;
    private String districtName;

    public PlaceInfoDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpentime() {
        return opentime;
    }

    public void setOpentime(String opentime) {
        this.opentime = opentime;
    }

    public Integer getPlaceInfoID() {
        return placeInfoID;
    }

    public void setPlaceInfoID(Integer placeInfoID) {
        this.placeInfoID = placeInfoID;
    }

    public String getPlaceInfoName() {
        return placeInfoName;
    }

    public void setPlaceInfoName(String placeInfoName) {
        this.placeInfoName = placeInfoName;
    }

    public String getPlaceInfoImage() {
        return placeInfoImage;
    }

    public void setPlaceInfoImage(String placeInfoImage) {
        this.placeInfoImage = placeInfoImage;
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

    public Integer getDistrictID() {
        return districtID;
    }

    public void setDistrictID(Integer districtID) {
        this.districtID = districtID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public PlaceInfoDTO(Integer id, String name, String opentime, Integer placeInfoID, String placeInfoName, String placeInfoImage, String placeInfoPhone, String placeInfoAddress, Integer districtID, String districtName) {

        this.id = id;
        this.name = name;
        this.opentime = opentime;
        this.placeInfoID = placeInfoID;
        this.placeInfoName = placeInfoName;
        this.placeInfoImage = placeInfoImage;
        this.placeInfoPhone = placeInfoPhone;
        this.placeInfoAddress = placeInfoAddress;
        this.districtID = districtID;
        this.districtName = districtName;
    }
}
