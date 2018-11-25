package edu.poly.model;

import edu.poly.entity.Services;

import java.util.List;

public class ProcessOrderDTO {
    private String nameService;
    private String dateTicket;
    private String picture;
    private Integer tourId;
    private String tour;
    private List<TicketDetailDTO> ticketDetail;
    private Services services;

    public ProcessOrderDTO() {
    }

    public ProcessOrderDTO(String nameService, String dateTicket, String picture, Integer tourId, String tour, List<TicketDetailDTO> ticketDetail, Services services) {
        this.nameService = nameService;
        this.dateTicket = dateTicket;
        this.picture = picture;
        this.tourId = tourId;
        this.tour = tour;
        this.ticketDetail = ticketDetail;
        this.services = services;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getDateTicket() {
        return dateTicket;
    }

    public void setDateTicket(String dateTicket) {
        this.dateTicket = dateTicket;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getTourId() {
        return tourId;
    }

    public void setTourId(Integer tourId) {
        this.tourId = tourId;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public List<TicketDetailDTO> getTicketDetail() {
        return ticketDetail;
    }

    public void setTicketDetail(List<TicketDetailDTO> ticketDetail) {
        this.ticketDetail = ticketDetail;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
