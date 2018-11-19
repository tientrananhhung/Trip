package edu.poly.model;

import edu.poly.common.StringUtils;

public class ServiceRuleDTO {
    private String name;
    private Integer price;
    private String priceFormat;

    public ServiceRuleDTO() {
    }

    public ServiceRuleDTO(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPriceFormat() {
        return StringUtils.formatCurrency(priceFormat);
    }

    public void setPriceFormat(String priceFormat) {
        this.priceFormat = priceFormat;
    }
}
