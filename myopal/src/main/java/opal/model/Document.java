package opal.model;

public class Document {
    private Integer docid;

    private Integer processid;

    private String docprotype;

    private String doctype;

    private String docname;

    private String docroot;

    private Integer downloadcount;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public String getDocprotype() {
        return docprotype;
    }

    public void setDocprotype(String docprotype) {
        this.docprotype = docprotype == null ? null : docprotype.trim();
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype == null ? null : doctype.trim();
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname == null ? null : docname.trim();
    }

    public String getDocroot() {
        return docroot;
    }

    public void setDocroot(String docroot) {
        this.docroot = docroot == null ? null : docroot.trim();
    }

    public Integer getDownloadcount() {
        return downloadcount;
    }

    public void setDownloadcount(Integer downloadcount) {
        this.downloadcount = downloadcount;
    }
}