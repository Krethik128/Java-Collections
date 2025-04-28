package javaeight.streams.practiceproblems;

import java.util.*;

public class FlatMap {
    public static void main(String[] args) {
        System.out.println("\n"+"using flatMap for flatten a list of list into single list");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );
        Set<String> IntermediateOps=new HashSet<>();
        List<String> lists=listOfLists.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .filter(s->s.startsWith("s"))
                .peek(IntermediateOps::add)
                .toList();
        System.out.println(lists);
    }
    public static void add1(){
        System.out.println();
    }
}
