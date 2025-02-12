package com.tit.day02.insurancemanagementsystem01;

import java.util.*;

public class PolicyManagement {


    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("\nAll Policies (HashSet - Unordered): " + hashSet);
        System.out.println("\nAll Policies (LinkedHashSet - Order Maintained): " + linkedHashSet);
        System.out.println("\nAll Policies (TreeSet - Sorted by Expiry Date): " + treeSet);
    }

    public void displayExpiringSoon() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = cal.getTime();

        System.out.println("\nPolicies Expiring Soon:");
        for (Policy policy : treeSet) {
            if (policy.expiryDate.before(threshold)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String type) {
        System.out.println("\nPolicies with Coverage Type: " + type);
        for (Policy policy : hashSet) {
            if (policy.coverageType.equalsIgnoreCase(type)) {
                System.out.println(policy);
            }
        }
    }

    public void findDuplicatePolicies() {
        Set<String> seen = new HashSet<>();
        System.out.println("\nDuplicate Policies:");
        for (Policy policy : linkedHashSet) {
            if (!seen.add(policy.policyNumber)) {
                System.out.println(policy);
            }
        }
    }
}