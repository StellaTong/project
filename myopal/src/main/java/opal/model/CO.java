package opal.model;

public class CO {
    private Integer coid;

    private Integer dboid;

    private String coname;

    private String codes;

    private Integer ppmid;

    private String comed;

    public Integer getCoid() {
        return coid;
    }

    public void setCoid(Integer coid) {
        this.coid = coid;
    }

    public Integer getDboid() {
        return dboid;
    }

    public void setDboid(Integer dboid) {
        this.dboid = dboid;
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname == null ? null : coname.trim();
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes == null ? null : codes.trim();
    }

    public Integer getPpmid() {
        return ppmid;
    }

    public void setPpmid(Integer ppmid) {
        this.ppmid = ppmid;
    }

    public String getComed() {
        return comed;
    }

    public void setComed(String comed) {
        this.comed = comed == null ? null : comed.trim();
    }
}