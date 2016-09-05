package opal.model;

public class PPB {
    private Integer ppbid;

    private String ppbname;

    private String metricname;

    private String lcl;

    private String cl;

    private String ucl;

    public Integer getPpbid() {
        return ppbid;
    }

    public void setPpbid(Integer ppbid) {
        this.ppbid = ppbid;
    }

    public String getPpbname() {
        return ppbname;
    }

    public void setPpbname(String ppbname) {
        this.ppbname = ppbname == null ? null : ppbname.trim();
    }

    public String getMetricname() {
        return metricname;
    }

    public void setMetricname(String metricname) {
        this.metricname = metricname == null ? null : metricname.trim();
    }

    public String getLcl() {
        return lcl;
    }

    public void setLcl(String lcl) {
        this.lcl = lcl == null ? null : lcl.trim();
    }

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl == null ? null : cl.trim();
    }

    public String getUcl() {
        return ucl;
    }

    public void setUcl(String ucl) {
        this.ucl = ucl == null ? null : ucl.trim();
    }
}