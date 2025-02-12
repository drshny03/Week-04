package com.tit.day02.insurancemanagementsystem01;

import java.util.Date;

class Policy implements Comparable<Policy> {
    String policyNumber, policyholderName, coverageType;
    Date expiryDate;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Policy)) return false;
        return this.policyNumber.equals(((Policy) obj).policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + ", " + policyholderName + ", " + coverageType + ", " + expiryDate + ", " + premiumAmount;
    }
}