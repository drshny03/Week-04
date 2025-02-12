package com.tit.day02.bankingsystem;

public class BankingSystemMain {

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount(9529, 25000);
        bank.addAccount(6699, 852963);
        bank.addAccount(8520, 123456);

        bank.requestWithdrawal(9529);
        bank.requestWithdrawal(6699);
        bank.processWithdrawals();

        bank.displaySortedAccounts();
    }
}
