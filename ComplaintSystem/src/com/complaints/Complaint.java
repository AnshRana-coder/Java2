package com.complaints;

public abstract class Complaint {
    private int id;
    private String userName;
    private String contactInfo;
    private String description;
    private String status;
    private String resolution;

    public Complaint(int id, String userName, String contactInfo, String description) {
        this.id = id;
        this.userName = userName;
        this.contactInfo = contactInfo;
        this.description = description;
        this.status = "OPEN";
        this.resolution = "";
    }

    public int getId() { return id; }
    public String getUserName() { return userName; }
    public String getContactInfo() { return contactInfo; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    public abstract String getType();
    public abstract int prioritize();

    public String toFileLine() {
        String safeDesc = description.replace("|", "/");
        String safeRes = resolution.replace("|", "/");
        return id + "|" + getType() + "|" + userName + "|" + contactInfo + "|" + safeDesc + "|" + status + "|" + safeRes;
    }

    public String toString() {
        String s = "ID: " + id + ", Type: " + getType() + ", User: " + userName + ", Status: " + status + ", Priority: " + prioritize() + ", Desc: " + description;
        if (status.equalsIgnoreCase("CLOSED")) s += ", Resolution: " + resolution;
        return s;
    }
}