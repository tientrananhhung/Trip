package edu.poly.model;

public class FoodCategoryDTO {
    private Integer id;
    private String name;

    public FoodCategoryDTO() {
    }

    public FoodCategoryDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
