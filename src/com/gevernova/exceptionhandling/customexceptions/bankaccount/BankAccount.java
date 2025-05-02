package com.gevernova.exceptionhandling.customexceptions.bankaccount;

public class BankAccount {
    private double balance = 5000;

    public void  withdraw(double amount) throws InsufficientBalanceException {
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("Total balance after withdrawl "+balance);
        }
        else if(amount>balance){
            throw new InsufficientBalanceException("Amount is greater than balance");
        }
        else{
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
