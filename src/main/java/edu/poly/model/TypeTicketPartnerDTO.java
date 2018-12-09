package edu.poly.model;

import edu.poly.common.StringUtils;

public class TypeTicketPartnerDTO {
    private String name;
    private String price;

    public TypeTicketPartnerDTO() {
    }

    public TypeTicketPartnerDTO(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return StringUtils.formatCurrency(price);
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
