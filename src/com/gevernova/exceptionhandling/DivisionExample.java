package com.gevernova.exceptionhandling;
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter numerator: ");
            int a = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int b = scanner.nextInt();

            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Operation completed");
        }
    }
}

