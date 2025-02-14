package com.tit.day04.exceptions.finallyblockexcecution;
import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the Another Number : ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Operation completed");
        }

        scanner.close();
    }
}

