package javaeight.lambdaexpression;

import java.util.function.Predicate;

public class CheckStringEmpty {
    public static void main(String[] args){
        Predicate<String> isEmpty = str -> str.isEmpty();
        // testing
        System.out.println(isEmpty.test("Krethik"));
        System.out.println(isEmpty.test(""));
    }
}