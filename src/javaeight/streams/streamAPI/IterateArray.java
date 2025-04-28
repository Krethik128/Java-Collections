package javaeight.streams.streamAPI;

import java.util.Arrays;
import java.util.List;

public class IterateArray {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,6,8,10);
        int[] arr ={1,2,3,4,5,6};

        list.stream().filter(x->x%2==0).forEach(x-> System.out.println(x)); //Using Streams methods

        for(int i=0;i<arr.length;i++){//Using Normal function call to print elements divisible by 2
            if(CheckEven(arr[i])){
                Print(arr[i]);
            }
        }

    }
    public static void Print(int x){ //Print number
        System.out.println(x);
    }
    public static boolean CheckEven(int x){//Check if number is even
        return x%2==0;
    }
}
