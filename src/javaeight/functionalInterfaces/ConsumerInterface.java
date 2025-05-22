package javaeight.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
       List<Integer> list= Arrays.asList(1,2,3,4);

        Consumer<Integer> objOne= System.out::println;
        objOne.accept(5);
        Consumer<List<Integer>> printList=x->{
        for(int i:x){
            System.out.print(i+" ");
            }
        };
        printList.accept(list);

        list.forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
