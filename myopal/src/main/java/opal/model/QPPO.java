package opal.model;

public class QPPO {
    private Integer qppoid;

    private Integer coid;

    private String qpponame;

    private String qdes;

    private String qmethod;

    private Integer ppmid;

    public Integer getQppoid() {
        return qppoid;
    }

    public void setQppoid(Integer qppoid) {
        this.qppoid = qppoid;
    }

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public String getQpponame() {
        return qpponame;
    }

    public void setQpponame(String qpponame) {
        this.qpponame = qpponame == null ? null : qpponame.trim();
    }

    public String getQdes() {
        return qdes;
    }

    public void setQdes(String qdes) {
        this.qdes = qdes == null ? null : qdes.trim();
    }

    public String getQmethod() {
        return qmethod;
    }

    public void setQmethod(String qmethod) {
        this.qmethod = qmethod == null ? null : qmethod.trim();
    }

    public Integer getPpmid() {
        return ppmid;
    }

    public void setPpmid(Integer ppmid) {
        this.ppmid = ppmid;
    }
}