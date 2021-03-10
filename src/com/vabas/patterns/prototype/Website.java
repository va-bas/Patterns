package com.vabas.patterns.prototype;

public class Website implements Copying{
    private int id;
    private String websiteName;
    private String source;

    public Website(int id, String websiteName, String source) {
        this.id = id;
        this.websiteName = websiteName;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public Object copy() {
        Website copy = new Website(id, websiteName, source);
        return copy;
    }

    public void showWs(){
        Website copy = new Website(id, websiteName, source);
        System.out.println(copy);
    }

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", websiteName='" + websiteName + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
