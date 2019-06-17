package models;

public class data {
    private boolean isup;
    private int returncode;
    private String log;
    private String serviceName;

    public data(String serviceName, boolean isup, int returncode, String log) {
        this.serviceName = serviceName;
        this.isup = isup;
        this.returncode = returncode;
        this.log = log;
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
