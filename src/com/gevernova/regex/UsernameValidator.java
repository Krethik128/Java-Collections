package com.gevernova.regex;


class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("user_123: " + isValidUsername("user_123"));
        System.out.println("123user: " + isValidUsername("123user"));
        System.out.println("us: " + isValidUsername("us"));
    }
}
