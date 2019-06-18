package models;

public class data {
    private boolean isup;
    private int returncode;
    private String log;
    private String serviceName;

    public String getLink() {
        return link;
    }

    private String link;
    public data(String serviceName, boolean isup, int returncode, String log, String link) {
        this.serviceName = serviceName;
        this.isup = isup;
        this.returncode = returncode;
        this.log = log;
        this.link = link;
    }



    public String getServiceName() {
        return serviceName;
    }

    public boolean isIsup() {
        return isup;
    }

    public int getReturncode() {
        return returncode;
    }

    public String getLog() {
        return log;
    }


}
