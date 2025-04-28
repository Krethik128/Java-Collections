package javaeight.streams.practiceproblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortBasedOnFirstChar {
    public static void main(String[] args) {
       List<String> list= Arrays.asList("Krethik","Stuti","Ana","Sam","Ben");
       Set<String> holding= new HashSet<>();
       List<String> result=list.stream()
               .map(string->string.toLowerCase())
               .sorted((str1, str2) -> {
                   return str1.charAt(0)-str2.charAt(0);
               })
               .peek(x->holding.add(x))
               .toList();
        System.out.println(result);
    }


}
