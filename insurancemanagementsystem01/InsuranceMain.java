package com.tit.day02.insurancemanagementsystem01;

import java.util.Date;

public class InsuranceMain {
    public static void main(String[] args) {
        PolicyManagement pm = new PolicyManagement();

        pm.addPolicy(new Policy("P101", "Darshan", new Date(2025, 5, 20), "Health", 1200));
        pm.addPolicy(new Policy("P102", "Rajveer", new Date(2025, 2, 10), "Car", 1000));
        pm.addPolicy(new Policy("P103", "Ankit", new Date(2025, 3, 15), "Home", 1000));
        pm.addPolicy(new Policy("P101", "Aditya", new Date(2025, 5, 20), "Health", 1200)); // Duplicate

        pm.displayAllPolicies();
        pm.displayExpiringSoon();
        pm.displayByCoverageType("Health");
        pm.findDuplicatePolicies();
    }
}
