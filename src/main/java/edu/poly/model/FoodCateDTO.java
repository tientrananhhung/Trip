package edu.poly.model;

public class FoodCateDTO {
    private Integer id;
    private String name;
    private Integer fid;
    private String fname;
    private String fopentime;
    private Integer piid;
    private String piname;
    private String piimage;
    private String piphone;
    private String piaddress;
    private Integer did;
    private String dname;

    public FoodCateDTO() {
    }

    public FoodCateDTO(Integer id, String name, Integer fid, String fname, String fopentime, Integer piid, String piname, String piimage, String piphone, String piaddress, Integer did, String dname) {
        this.id = id;
        this.name = name;
        this.fid = fid;
        this.fname = fname;
        this.fopentime = fopentime;
        this.piid = piid;
        this.piname = piname;
        this.piimage = piimage;
        this.piphone = piphone;
        this.piaddress = piaddress;
        this.did = did;
        this.dname = dname;
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

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFopentime() {
        return fopentime;
    }

    public void setFopentime(String fopentime) {
        this.fopentime = fopentime;
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

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
