package com.gevernova.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProgrammingLanguageExtractor {
    public static List<String> extractLanguages(String text) {
        Pattern pattern = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }
        return languages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        System.out.println(extractLanguages(text));
    }
}
