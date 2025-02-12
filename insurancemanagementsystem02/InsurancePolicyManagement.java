package com.tit.day02.insurancemanagementsystem02;
import java.util.*;
public class InsurancePolicyManagement {
    private Map<String, Policy> hashMap = new HashMap<>();
    private Map<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Date, Policy> treeMap = new TreeMap<>();

    public void addPolicy(Policy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);
        treeMap.put(policy.expiryDate, policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public void listExpiringPolicies() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = cal.getTime();

        System.out.println("\nPolicies Expiring Soon:");
        for (Map.Entry<Date, Policy> entry : treeMap.entrySet()) {
            if (entry.getKey().before(threshold)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void listPoliciesByHolder(String name) {
        System.out.println("\nPolicies for: " + name);
        for (Policy policy : hashMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(name)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date today = new Date();
        treeMap.headMap(today, true).clear();
        hashMap.values().removeIf(p -> p.expiryDate.before(today));
        linkedHashMap.values().removeIf(p -> p.expiryDate.before(today));
        System.out.println("\nExpired policies removed.");
    }
}