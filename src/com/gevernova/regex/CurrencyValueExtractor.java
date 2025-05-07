package com.gevernova.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CurrencyValueExtractor {
    public static List<String> extractCurrencyValues(String text) {
        Pattern pattern = Pattern.compile("[$]?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        List<String> values = new ArrayList<>();
        while (matcher.find()) {
            values.add(matcher.group());
        }
        return values;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        System.out.println(extractCurrencyValues(text));
    }
}
