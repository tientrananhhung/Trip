package edu.poly.model;

import java.util.List;

public class TourPartnerDTO {
    private Integer id;
    private Integer userId;
    private String name;
    private String address;
    private String content;
    private String image;
    private List<String> images;
    private Integer policy;
    private String lat;
    private String lng;
    ServicePartnerDTO service;

    public TourPartnerDTO() {
    }

    public TourPartnerDTO(Integer id, Integer userId, String name, String address, String content, String image, List<String> images, Integer policy, String lat, String lng, ServicePartnerDTO service) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.address = address;
        this.content = content;
        this.image = image;
        this.images = images;
        this.policy = policy;
        this.lat = lat;
        this.lng = lng;
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Integer getPolicy() {
        return policy;
    }

    public void setPolicy(Integer policy) {
        this.policy = policy;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public ServicePartnerDTO getService() {
        return service;
    }

    public void setService(ServicePartnerDTO service) {
        this.service = service;
    }
}
