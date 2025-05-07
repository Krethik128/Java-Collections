package com.gevernova.regex;

class CreditCardValidator {
    public static boolean isValidVisa(String cardNumber) {
        String regex = "^4\\d{15}$";
        return cardNumber.matches(regex);
    }

    public static boolean isValidMasterCard(String cardNumber) {
        String regex = "^5\\d{15}$";
        return cardNumber.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("Visa 4123456789012345: " + isValidVisa("4123456789012345"));
        System.out.println("Visa 5123456789012345: " + isValidVisa("5123456789012345"));
        System.out.println("MasterCard 5123456789012345: " + isValidMasterCard("5123456789012345"));
        System.out.println("MasterCard 4123456789012345: " + isValidMasterCard("4123456789012345"));
    }
}
