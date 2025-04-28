package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordsFromSentence {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is powerful",
                "Streams are powerful and elegant",
                "Functional programming with Java"
        );

        List<String> uniqueWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split into words
                .map(String::toLowerCase)     // Normalize (optional)
                .distinct()                   // Remove duplicates
                .sorted()                     // Sort alphabetically
                .collect(Collectors.toList());

        System.out.println(uniqueWords);

    }
}
