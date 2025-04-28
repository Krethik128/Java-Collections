package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaptoLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "apple", "banana", "apple", "orange", "banana", "apple"
        );
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(
                        word -> word,           // key: the word itself
                        word -> word.length(),   // value: its length
                        (v1, v2) -> v1
                ));

        System.out.println(map);
    }
}
