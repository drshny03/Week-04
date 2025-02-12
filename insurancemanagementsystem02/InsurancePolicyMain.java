package com.tit.day02.insurancemanagementsystem02;

import java.util.Date;

public class InsurancePolicyMain {

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy(new Policy("P101", "Darshan", new Date(2025, 5, 20), "Health", 1200));
        system.addPolicy(new Policy("P102", "Rajveer", new Date(2025, 2, 10), "Auto", 800));
        system.addPolicy(new Policy("P103", "Aditya", new Date(2025, 3, 15), "Home", 1000));

        System.out.println("\nPolicy Details: " + system.getPolicyByNumber("P101"));
        system.listExpiringPolicies();
        system.listPoliciesByHolder("Darshan");
        system.removeExpiredPolicies();
    }
}
