package javaeight.lambdaexpression;

import java.util.function.Predicate;

public class CheckEvenNumbers {
    public static void main(String[] args){
        // lambda expression to check for even number
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // testing
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(7));
    }
}
