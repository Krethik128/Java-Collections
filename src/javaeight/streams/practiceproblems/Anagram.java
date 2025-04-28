package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String[] array={"eat","tea","tan","ate","nat","bat"};
        List<String> newArr= Arrays.asList(array);
        Collection<List<String>> ars = newArr.stream()
                .collect(Collectors.groupingBy(
                        word -> Arrays.stream(word.toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.joining()),// optional, to preserve order
                        Collectors.toList()
                ))
                .values();
        System.out.println(ars);
    }
}
