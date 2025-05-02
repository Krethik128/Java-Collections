package com.gevernova.exceptionhandling;

public class ExceptionPropagationDemo {

    // Throws ArithmeticException
    public static void methodOne() {
        int result = 10 / 0;
    }

    // Calls methodOne (exception propagates)
    public static void methodTwo() {
        methodOne();
    }

    public static void main(String[] args) {
        try {
            methodTwo();  // Exception handled here
        } catch (ArithmeticException e) {
            System.out.println("Handled the exception in main method");
        } finally {
            System.out.println("Execution has completed");
        }
    }
}
