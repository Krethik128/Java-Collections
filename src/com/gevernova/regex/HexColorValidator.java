package com.gevernova.regex;

class HexColorValidator {
    public static boolean isValidHexColor(String hexColor) {
        String regex = "^#([0-9A-Fa-f]{6})$";
        return hexColor.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println("#FFA500: " + isValidHexColor("#FFA500"));
        System.out.println("#ff4500: " + isValidHexColor("#ff4500"));
        System.out.println("#123: " + isValidHexColor("#123"));
    }
}