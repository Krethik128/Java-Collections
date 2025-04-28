package javaeight.streams.practiceproblems;

import java.util.Arrays;

public class ReduceSum {
    public static void main(String[] args) {
        int []numbers={1,2,3,4,5,6,6,78,9};
        int sum = Arrays.stream(numbers).
                filter(n -> n % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
