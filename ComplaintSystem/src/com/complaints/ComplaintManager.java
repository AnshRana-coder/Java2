package com.complaints;

import java.io.*;

public class ComplaintManager {
    private Complaint[] complaints;
    private int count;
    private int nextId;
    private static final String FILE_NAME = "complaints.txt";

    public ComplaintManager(int capacity) {
        complaints = new Complaint[capacity];
        count = 0;
        nextId = 1;
        loadFromFile();
    }

    public Complaint addComplaint(String typeChoice, String name, String contact, String desc) {
        if (count >= complaints.length) return null;
        Complaint c;
        if ("1".equals(typeChoice)) c = new TechnicalComplaint(nextId, name, contact, desc);
        else c = new BillingComplaint(nextId, name, contact, desc);
        complaints[count++] = c;
        nextId++;
        saveToFile();
        return c;
    }

    public Complaint findById(int id) {
        for (int i = 0; i < count; i++) if (complaints[i].getId() == id) return complaints[i];
        return null;
    }

    public void respond(Complaint c, String responseText) {
        if (c == null) return;
        c.setResolution(responseText);
        c.setStatus("CLOSED");
        saveToFile();
    }

    public void showByStatus(String status) {
        for (int i = 0; i < count; i++) if (complaints[i].getStatus().equalsIgnoreCase(status)) System.out.println(complaints[i]);
    }

    public void showAll() {
        for (int i = 0; i < count; i++) System.out.println(complaints[i]);
    }

    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < count; i++) bw.write(complaints[i].toFileLine() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving complaints: " + e.getMessage());
        }
    }

    private void loadFromFile() {
        File f = new File(FILE_NAME);
        if (!f.exists()) return;
        int maxId = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null && count < complaints.length) {
                String[] p = line.split("\\|");
                if (p.length < 7) continue;
                int id = Integer.parseInt(p[0]);
                String type = p[1];
                Complaint c;
                if ("TECH".equals(type)) c = new TechnicalComplaint(id, p[2], p[3], p[4]);
                else c = new BillingComplaint(id, p[2], p[3], p[4]);
                c.setStatus(p[5]);
                c.setResolution(p[6]);
                complaints[count++] = c;
                if (id > maxId) maxId = id;
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading complaints: " + e.getMessage());
        }
        nextId = maxId + 1;
    }
}