package com.tit.day04.exceptions.banktransactionsystem;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
