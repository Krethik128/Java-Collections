package com.gevernova.exceptionhandling.customexceptions.Invalidageexception;

public class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
