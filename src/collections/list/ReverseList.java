package collections.list;
import java.util.*;

public class ReverseList {
    public static <T> void reverseList(List<T> list) {
        // Get the size of the list
        int n = list.size();
        // Iterate through the first half of the list
        for (int i = 0; i < n / 2; i++) {
            // Swap the element at index i with the element at index (n - 1 - i)
            T temp = list.get(i);
            list.set(i, list.get(n - 1 - i));
            list.set(n - 1 - i, temp);
        }
    }
        public static void main (String[]args){
            // Example with ArrayList
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("Original ArrayList: " + arrayList);
            reverseList(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);

            // Example with LinkedList
            LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("a", "b", "c", "d"));
            System.out.println("Original LinkedList: " + linkedList);
            reverseList(linkedList);
            System.out.println("Reversed LinkedList: " + linkedList);
        }
    }
