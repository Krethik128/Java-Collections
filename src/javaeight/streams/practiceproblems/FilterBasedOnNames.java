package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBasedOnNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Ankit", "John");
        List<String>result=names.stream()
                .filter(x->x.startsWith("A"))
                .map(x->x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
