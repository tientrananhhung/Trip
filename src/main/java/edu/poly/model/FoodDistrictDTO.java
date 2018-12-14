package edu.poly.model;

public class FoodDistrictDTO {
    private Integer id;
    private String name;
    private Integer piid;
    private String piname;
    private String piimage;
    private String piphone;
    private String piaddress;
    private Integer fid;
    private String fopentime;

    public FoodDistrictDTO() {
    }

    public FoodDistrictDTO(Integer id, String name, Integer piid, String piname, String piimage, String piphone, String piaddress, Integer fid, String fopentime) {
        this.id = id;
        this.name = name;
        this.piid = piid;
        this.piname = piname;
        this.piimage = piimage;
        this.piphone = piphone;
        this.piaddress = piaddress;
        this.fid = fid;
        this.fopentime = fopentime;
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

    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }

    public String getPiname() {
        return piname;
    }

    public void setPiname(String piname) {
        this.piname = piname;
    }

    public String getPiimage() {
        return piimage;
    }

    public void setPiimage(String piimage) {
        this.piimage = piimage;
    }

    public String getPiphone() {
        return piphone;
    }

    public void setPiphone(String piphone) {
        this.piphone = piphone;
    }

    public String getPiaddress() {
        return piaddress;
    }

    public void setPiaddress(String piaddress) {
        this.piaddress = piaddress;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFopentime() {
        return fopentime;
    }

    public void setFopentime(String fopentime) {
        this.fopentime = fopentime;
    }
}
