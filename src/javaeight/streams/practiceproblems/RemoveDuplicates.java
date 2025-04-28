package javaeight.streams.practiceproblems;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String lorem="KrethikKrethik";
        Arrays.stream(lorem.split(""))
                .distinct()
                .forEach(System.out::print);
    }
}
