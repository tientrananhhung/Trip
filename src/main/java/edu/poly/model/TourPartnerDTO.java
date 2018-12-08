package edu.poly.model;

import java.util.List;

public class TourPartnerDTO {
    private Integer id;
    private String name;
    private String address;
    private String content;
    private String image;
    private Integer policy;
    private String lat;
    private String lng;
    ServicePartnerDTO service;

    public TourPartnerDTO() {
    }

    public TourPartnerDTO(Integer id, String name, String address, String content, String image, Integer policy, String lat, String lng, ServicePartnerDTO service) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.content = content;
        this.image = image;
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
