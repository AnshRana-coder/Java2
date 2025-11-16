package com.complaints;

public class BillingComplaint extends Complaint {
    public BillingComplaint(int id, String userName, String contactInfo, String description) {
        super(id, userName, contactInfo, description);
    }
    public String getType() { return "BILL"; }
    public int prioritize() { return 2; }
}