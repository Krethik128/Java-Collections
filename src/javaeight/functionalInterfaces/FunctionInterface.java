package javaeight.functionalInterfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        // Represents a function that accepts one argument and produces a result.
        Function<Integer,Double> multiplyByHundred= x-> (double)x * 100;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to be multiplied by 100 using Lambda function  ");

        int number=scanner.nextInt();
        System.out.println(multiplyByHundred.apply(number));

        Function<Integer,Integer> objOne=Function.identity();
        System.out.println(objOne.apply(5));
    }
}
