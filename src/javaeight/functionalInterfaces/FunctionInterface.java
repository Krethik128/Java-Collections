package javaeight.functionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        // Represents a function that accepts one argument and produces a result.
        Function<Integer,Double> multiplyByHundred= x-> (double)x * 100;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be multiplied by 100 using Lambda function  ");

        int number=sc.nextInt();
        System.out.println(multiplyByHundred.apply(number));

        Function<Integer,Integer> obj1=Function.identity();
        System.out.println(obj1.apply(5));
    }
}
