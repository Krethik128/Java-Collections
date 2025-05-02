package com.gevernova.exceptionhandling.customexceptions.bankaccount;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}
