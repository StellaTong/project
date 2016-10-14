package opal.model;

public class PPM {
    private Integer ppmid;

    private String ppmdes;

    private String ppmexp;

    private Integer processid;

    private String metricname;

    public Integer getPpmid() {
        return ppmid;
    }

    public void setPpmid(Integer ppmid) {
        this.ppmid = ppmid;
    }

    public String getPpmdes() {
        return ppmdes;
    }

    public void setPpmdes(String ppmdes) {
        this.ppmdes = ppmdes == null ? null : ppmdes.trim();
    }

    public String getPpmexp() {
        return ppmexp;
    }

    public void setPpmexp(String ppmexp) {
        this.ppmexp = ppmexp == null ? null : ppmexp.trim();
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public String getMetricname() {
        return metricname;
    }

    public void setMetricname(String metricname) {
        this.metricname = metricname == null ? null : metricname.trim();
    }
}