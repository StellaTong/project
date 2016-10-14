package opal.model;

import java.util.Date;

public class BO {
    private Integer boid;

    private String boname;

    private Date botime;

    private String bmethod;

    private String bdes;

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    public String getBoname() {
        return boname;
    }

    public void setBoname(String boname) {
        this.boname = boname == null ? null : boname.trim();
    }

    public Date getBotime() {
        return botime;
    }

    public void setBotime(Date botime) {
        this.botime = botime;
    }

    public String getBmethod() {
        return bmethod;
    }

    public void setBmethod(String bmethod) {
        this.bmethod = bmethod == null ? null : bmethod.trim();
    }

    public String getBdes() {
        return bdes;
    }

    public void setBdes(String bdes) {
        this.bdes = bdes == null ? null : bdes.trim();
    }
}