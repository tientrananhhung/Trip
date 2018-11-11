package edu.poly.model;

import edu.poly.common.StringUtils;

import java.util.List;

public class TourDetailDTO {
    private Integer id;
    private String name;
    private String address;
    private String content;
    private List<String> images;
    private Integer policy;
    private String lat;
    private String lng;
    private Boolean deleted;
    private Integer partnerId;
    private String partnerName;
    private String partnerAddress;
    private Integer serviceId;
    private String serviceName;
    private String servicePrice;
    private String serviceNormalPrice;
    private String serviceDetail;
    private Boolean serviceIsDefault;
    private Boolean serviceIsdeted;
    private Integer ticketId;
    private Integer ticketQuantity;
    private Boolean ticketType;
    private Integer ticketCount;

    public TourDetailDTO() {
    }

    public TourDetailDTO(Integer id, String name, String address, String content, List<String> images, Integer policy, String lat, String lng, Boolean deleted, Integer partnerId, String partnerName, String partnerAddress, Integer serviceId, String serviceName, String servicePrice, String serviceNormalPrice, String serviceDetail, Boolean serviceIsDefault, Boolean serviceIsdeted, Integer ticketId, Integer ticketQuantity, Boolean ticketType, Integer ticketCount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.content = content;
        this.images = images;
        this.policy = policy;
        this.lat = lat;
        this.lng = lng;
        this.deleted = deleted;
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.partnerAddress = partnerAddress;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.serviceNormalPrice = serviceNormalPrice;
        this.serviceDetail = serviceDetail;
        this.serviceIsDefault = serviceIsDefault;
        this.serviceIsdeted = serviceIsdeted;
        this.ticketId = ticketId;
        this.ticketQuantity = ticketQuantity;
        this.ticketType = ticketType;
        this.ticketCount = ticketCount;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Integer getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerAddress() {
        return partnerAddress;
    }

    public void setPartnerAddress(String partnerAddress) {
        this.partnerAddress = partnerAddress;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePrice() {
        return StringUtils.formatCurrency(servicePrice);
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceNormalPrice() {
        return StringUtils.formatCurrency(serviceNormalPrice);
    }

    public void setServiceNormalPrice(String serviceNormalPrice) {
        this.serviceNormalPrice = serviceNormalPrice;
    }

    public String getServiceDetail() {
        return serviceDetail;
    }

    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    public Boolean getServiceIsDefault() {
        return serviceIsDefault;
    }

    public void setServiceIsDefault(Boolean serviceIsDefault) {
        this.serviceIsDefault = serviceIsDefault;
    }

    public Boolean getServiceIsdeted() {
        return serviceIsdeted;
    }

    public void setServiceIsdeted(Boolean serviceIsdeted) {
        this.serviceIsdeted = serviceIsdeted;
    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(Integer ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public Boolean getTicketType() {
        return ticketType;
    }

    public void setTicketType(Boolean ticketType) {
        this.ticketType = ticketType;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }
}
