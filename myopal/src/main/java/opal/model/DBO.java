package opal.model;

public class DBO {
    private Integer dboid;

    private Integer boid;

    private String dbname;

    private String dmethod;

    private String ddes;

    public Integer getDboid() {
        return dboid;
    }

    public void setDboid(Integer dboid) {
        this.dboid = dboid;
    }

    public Integer getBoid() {
        return boid;
    }

    public void setBoid(Integer boid) {
        this.boid = boid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname == null ? null : dbname.trim();
    }

    public String getDmethod() {
        return dmethod;
    }

    public void setDmethod(String dmethod) {
        this.dmethod = dmethod == null ? null : dmethod.trim();
    }

    public String getDdes() {
        return ddes;
    }

    public void setDdes(String ddes) {
        this.ddes = ddes == null ? null : ddes.trim();
    }
}