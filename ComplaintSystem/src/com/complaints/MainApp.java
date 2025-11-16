package com.complaints;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplaintManager manager = new ComplaintManager(100);
        boolean running = true;
        while (running) {
            System.out.println("1. User Menu");
            System.out.println("2. Admin Menu");
            System.out.println("0. Exit");
            String ch = sc.nextLine();
            switch (ch) {
                case "1": userMenu(sc, manager); break;
                case "2": adminMenu(sc, manager); break;
                case "0": running = false; break;
            }
        }
        sc.close();
    }

    private static void userMenu(Scanner sc, ComplaintManager manager) {
        boolean back = false;
        while (!back) {
            System.out.println("1. Log Complaint");
            System.out.println("2. Check Status");
            System.out.println("0. Back");
            String ch = sc.nextLine();
            switch (ch) {
                case "1": logComplaint(sc, manager); break;
                case "2": checkStatus(sc, manager); break;
                case "0": back = true; break;
            }
        }
    }

    private static void logComplaint(Scanner sc, ComplaintManager manager) {
        try {
            System.out.println("1. Technical");
            System.out.println("2. Billing");
            String type = sc.nextLine();
            System.out.print("Name: "); String name = sc.nextLine().trim();
            System.out.print("Contact: "); String contact = sc.nextLine().trim();
            System.out.print("Description: "); String desc = sc.nextLine().trim();
            if (name.isEmpty() || contact.isEmpty() || desc.isEmpty()) throw new IllegalArgumentException();
            Complaint c = manager.addComplaint(type, name, contact, desc);
            if (c != null) System.out.println("Complaint ID: " + c.getId());
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    private static void checkStatus(Scanner sc, ComplaintManager manager) {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Complaint c = manager.findById(id);
            if (c == null) System.out.println("Not found");
            else System.out.println(c);
        } catch (Exception e) {
            System.out.println("Invalid ID");
        }
    }

    private static void adminMenu(Scanner sc, ComplaintManager manager) {
        System.out.print("Password: ");
        if (!sc.nextLine().equals("admin123")) return;
        boolean back = false;
        while (!back) {
            System.out.println("1. View OPEN");
            System.out.println("2. View CLOSED");
            System.out.println("3. Respond");
            System.out.println("4. View ALL");
            System.out.println("0. Back");
            String ch = sc.nextLine();
            switch (ch) {
                case "1": manager.showByStatus("OPEN"); break;
                case "2": manager.showByStatus("CLOSED"); break;
                case "3": respond(sc, manager); break;
                case "4": manager.showAll(); break;
                case "0": back = true; break;
            }
        }
    }

    private static void respond(Scanner sc, ComplaintManager manager) {
        try {
            System.out.print("Enter ID: ");
            int id = Integer.parseInt(sc.nextLine());
            Complaint c = manager.findById(id);
            if (c == null || c.getStatus().equals("CLOSED")) return;
            System.out.print("Response: ");
            String res = sc.nextLine().trim();
            if (res.isEmpty()) throw new IllegalArgumentException();
            manager.respond(c, res);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}