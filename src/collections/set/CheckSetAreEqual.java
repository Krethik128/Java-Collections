package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CheckSetAreEqual {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scanner = new Scanner(System.in);

        // Creating two HashSets
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();

        // Input for setOne
        System.out.println("Enter the number of elements for setOne: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the elements for setOne: ");
        for (int i = 0; i < n1; i++) {
            setOne.add(scanner.nextInt());
        }

        // Input for setTwo
        System.out.println("Enter the number of elements for setTwo: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the elements for setTwo: ");
        for (int i = 0; i < n2; i++) {
            setTwo.add(scanner.nextInt());
        }

        //check two sets are equal
        boolean equal=true;
        if(setOne.size()!=setTwo.size()){
            System.out.println("Sets are not equal");
        }else {
            Iterator<Integer>it=setTwo.iterator();
            while(it.hasNext()){
                if(setOne.contains(it.next())){
                    equal=true;
                    continue;
                }
                else{
                    equal=false;
                }
            }
        }

        if (equal){
            System.out.println("Sets are equal");
        }
        else{
            System.out.println("Set are not equal");
        }

        // with in build method
        if(setOne.equals(setTwo)){
            System.out.println("Sets are equal");
        }
        else {
            System.out.println("Set are not equal");
        }
    }
}

