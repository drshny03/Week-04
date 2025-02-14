package com.tit.day04.exceptions.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

 class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the First Number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter the Second Number: ");
            int secondNumber = scanner.nextInt();

            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}
