package edu.poly.model;

public class TicketDetailDTO {

    private String nameTicket;
    private Integer priceTicket;
    private Integer quantityTicket;

    public TicketDetailDTO() {
    }

    public TicketDetailDTO(String nameTicket, Integer priceTicket, Integer quantityTicket) {
        this.nameTicket = nameTicket;
        this.priceTicket = priceTicket;
        this.quantityTicket = quantityTicket;
    }

    public String getNameTicket() {
        return nameTicket;
    }

    public void setNameTicket(String nameTicket) {
        this.nameTicket = nameTicket;
    }

    public Integer getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(Integer priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Integer getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(Integer quantityTicket) {
        this.quantityTicket = quantityTicket;
    }
}
