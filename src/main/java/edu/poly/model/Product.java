package edu.poly.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Product {
    private String name;
    private int price;
    private CommonsMultipartFile[] fileData;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CommonsMultipartFile[] getFileData() {
        return fileData;
    }

    public void setFileData(CommonsMultipartFile[] fileData) {
        this.fileData = fileData;
    }
}
