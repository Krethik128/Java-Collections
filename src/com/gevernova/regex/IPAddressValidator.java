package com.gevernova.regex;

class IPAddressValidator {
    public static boolean isValidIPAddress(String ipAddress) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ipAddress.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("192.168.1.1: " + isValidIPAddress("192.168.1.1"));
        System.out.println("256.0.0.1: " + isValidIPAddress("256.0.0.1"));
    }
}
