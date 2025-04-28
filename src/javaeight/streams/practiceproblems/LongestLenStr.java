package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestLenStr {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple","BigBanana"
        );
        String result=words.stream()
                        .max(Comparator.comparingInt(String::length))
                                .orElse("");

        System.out.println(result);
    }
}
