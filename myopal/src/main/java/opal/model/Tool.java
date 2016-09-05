package opal.model;

public class Tool {
    private Integer toolid;

    private Integer processid;

    private String toolname;

    private String tooldes;

    private String url;

    public Integer getToolid() {
        return toolid;
    }

    public void setToolid(Integer toolid) {
        this.toolid = toolid;
    }

    public Integer getProcessid() {
        return processid;
    }

    public void setProcessid(Integer processid) {
        this.processid = processid;
    }

    public String getToolname() {
        return toolname;
    }

    public void setToolname(String toolname) {
        this.toolname = toolname == null ? null : toolname.trim();
    }

    public String getTooldes() {
        return tooldes;
    }

    public void setTooldes(String tooldes) {
        this.tooldes = tooldes == null ? null : tooldes.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}