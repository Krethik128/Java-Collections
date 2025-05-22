package javaeight.streams.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOps {
    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6,6,78,9};
        //Squaring and sorting
        Arrays.stream(numbers).map(x->x*x).sorted().forEach(x-> System.out.print(x+" "));

        //Sum entire array
        List<Integer> answer=Arrays.asList(6,2,3,4,5,66);
        System.out.println("\n");
        Optional<Integer> reuslt=answer.stream().reduce((x, y)->x+y);//Optional class is used ot handle empty value
        System.out.println(answer.stream().reduce((x,y)->x+y));

        //Counting occurrences of a character
        String string="Hello world Hello Hi ";
        long value=string.chars().filter(x->x=='H').count();
        long totalChars=string.chars().skip(' ').count();
        System.out.println(value);
        System.out.println(totalChars);

        //Stateful and Stateless operations
        /* *state full are those which know about entire array elements like distinct, sorted
           *stateless are those which doesn't care about next or previous elements like map , just does the operation on the given element
         */

        List<String> newList=Arrays.asList("Kretihk","STUTI","ABC");


        List<String>verdict=newList.stream().
                filter(name->{
                    System.out.println("Filtering name: "+name);
                    return name.length()>3;
                }).toList();
        System.out.println("After Terminal ops");
        System.out.println(verdict);
        System.out.println("\n");

        //reduce
        System.out.println("Using Reduce Operator");
        Optional<Integer>sum =answer.stream().reduce(Integer::sum);
        System.out.println(sum.get());
        System.out.println("\n");

        /*Short Circuit methods are those who terminates as soon as the condition satisfies
        like anyMatch, allMatch, noneMatch, findFirst , findAny
         */
        //Short Circuit Methods
        //anyMatch , noneMatch , allMatch
        Boolean greaterThan=answer.stream().anyMatch(x->x>10);
        Boolean allSatisfies=answer.stream().allMatch(x->x>50);

        //AnyMatch , findFirst , FindAny
        System.out.println(answer.stream().findAny().get());



    }
}
