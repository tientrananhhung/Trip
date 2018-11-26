package edu.poly.model;

import edu.poly.common.StringUtils;

public class TicketDetailDTO {

    private String nameTicket;
    private String priceTicket;
    private Integer quantityTicket;

    public TicketDetailDTO() {
    }

    public TicketDetailDTO(String nameTicket, String priceTicket, Integer quantityTicket) {
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

    public String getPriceTicket() {
        return StringUtils.formatCurrency(priceTicket);
    }

    public void setPriceTicket(String priceTicket) {
        this.priceTicket = priceTicket;
    }

    public Integer getQuantityTicket() {
        return quantityTicket;
    }

    public void setQuantityTicket(Integer quantityTicket) {
        this.quantityTicket = quantityTicket;
    }
}
