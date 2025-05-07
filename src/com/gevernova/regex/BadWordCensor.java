package com.gevernova.regex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

class BadWordCensor {
    public static String censorBadWords(String text, List<String> badWords) {
        String censoredText = text;
        for (String badWord : badWords) {
            String replacement = "****";
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(badWord) + "\\b", Pattern.CASE_INSENSITIVE);
            censoredText = pattern.matcher(censoredText).replaceAll(replacement);
        }
        return censoredText;
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        System.out.println(censorBadWords(text, badWords));
    }
}
