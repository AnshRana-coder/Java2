package com.complaints;

public class TechnicalComplaint extends Complaint {
    public TechnicalComplaint(int id, String userName, String contactInfo, String description) {
        super(id, userName, contactInfo, description);
    }
    public String getType() { return "TECH"; }
    public int prioritize() { return 3; }
}