package com.gevernova.regex;

class LicensePlateValidator {
    public static boolean isValidLicensePlate(String licensePlate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return licensePlate.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("AB1234: " + isValidLicensePlate("AB1234"));
        System.out.println("A12345: " + isValidLicensePlate("A12345"));
    }
}