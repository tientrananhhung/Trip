package edu.poly.model;

public class PostCategoryDTO {
    private Integer pcID;
    private String pcName;

    public PostCategoryDTO() {
    }

    public PostCategoryDTO(Integer pcID, String pcName) {
        this.pcID = pcID;
        this.pcName = pcName;
    }

    public Integer getPcID() {
        return pcID;
    }

    public void setPcID(Integer pcID) {
        this.pcID = pcID;
    }

    public String getPcName() {
        return pcName;
    }

    public void setPcName(String pcName) {
        this.pcName = pcName;
    }
}
