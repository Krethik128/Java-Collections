package com.gevernova.exceptionhandling.customexceptions.bankaccount;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(-500); // Try -500, 10000, or 2000 to test all cases
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
