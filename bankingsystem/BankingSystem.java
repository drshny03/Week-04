package com.tit.day02.bankingsystem;

import java.util.*;

public class BankingSystem {


    private HashMap<Integer, Double> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    // Request withdrawal
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Process withdrawal (fixed amount of 100 for simplicity)
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int account = withdrawalQueue.poll();
            if (accounts.get(account) >= 100) {
                accounts.put(account, accounts.get(account) - 100);
                System.out.println("Withdrawn 100 from Account: " + account);
            } else {
                System.out.println("Insufficient balance in Account: " + account);
            }
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        TreeMap<Double, List<Integer>> sortedAccounts = new TreeMap<>();
        for (var entry : accounts.entrySet()) {
            sortedAccounts.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        System.out.println("Accounts Sorted by Balance: " + sortedAccounts);
    }
}
