package com.gevernova.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RepeatingWordFinder {
    public static List<String> findRepeatingWords(String text) {
        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        List<String> repeatingWords = new ArrayList<>();
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1).toLowerCase());
        }
        // To get unique repeating words
        return repeatingWords.stream().distinct().toList();
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        System.out.println(findRepeatingWords(text));
    }
}
