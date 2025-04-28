package javaeight.streams.practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MinMax {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++ ){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        long cnt=list.stream().filter(x->x%2==1).count();
        System.out.println(cnt);
    }
}
