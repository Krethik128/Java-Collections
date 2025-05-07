package com.gevernova.regex;

class SpaceReplacer {
    public static String replaceMultipleSpaces(String text) {
        return text.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "This is an  example with   multiple    spaces.";
        System.out.println(replaceMultipleSpaces(text));
    }
}
