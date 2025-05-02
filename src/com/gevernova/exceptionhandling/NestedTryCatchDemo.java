package com.gevernova.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Array initialization
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter the array index: ");
            int index = scanner.nextInt();
            System.out.print("Enter the divisor value: ");
            int divisor = scanner.nextInt();

            try {
                int number = numbers[index];  // Accessing the number at the given index

                try {
                    int result = number / divisor;  // Performing division
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    // Handle division by zero
                    System.out.println("Error: Cannot divide by zero!");
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                // Handle invalid array index
                System.out.println("Error: Invalid array index!");
            }

        } catch (Exception e) {
            // Handle any other exceptions that may occur
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always executed
            System.out.println("Execution has completed.");
        }
    }
}
