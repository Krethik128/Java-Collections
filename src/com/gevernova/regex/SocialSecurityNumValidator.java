package com.gevernova.regex;

public class SocialSecurityNumValidator {
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("123-45-6789: " + isValidSSN("123-45-6789"));
        System.out.println("123456789: " + isValidSSN("123456789"));
    }

}
