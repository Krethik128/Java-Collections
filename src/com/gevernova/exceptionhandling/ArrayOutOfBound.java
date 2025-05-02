package com.gevernova.exceptionhandling;

import java.util.Scanner;

public class ArrayOutOfBound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample integer array
        int[] arrayNumbers = {4, 5, 6, 78, 98, 52, 12, 63, 456, 10};

        try {
            System.out.println("Enter the index to get the value at: ");
            int index = scanner.nextInt();

            // Attempt to access value at the given index
            int value = arrayNumbers[index];
            System.out.println("Value at index " + index + " is " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handles invalid index input
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            // Handles case when array is not initialized
            System.out.println("Array is not initialized!");
        } finally {
            // Executes regardless of exception
            System.out.println("Program has ended");
            scanner.close();
        }
    }
}