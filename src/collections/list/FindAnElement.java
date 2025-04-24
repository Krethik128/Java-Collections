package collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class FindAnElement {
    public static void main(String[] args) {
        // Step 1: Create and populate the LinkedList
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // Nth element from the end to find
        int N = 2;

        // Step 2: Initialize two iterators (fast and slow)
        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        // Step 3: Move the fast pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (fast.hasNext()) {
                fast.next(); // Advance fast pointer by one
            } else {
                // If the list has fewer than N elements
                System.out.println("Invalid N: Greater than list size");
                return;
            }
        }

        // Step 4: Move both fast and slow one step at a time until fast reaches the end
        while (fast.hasNext()) {
            fast.next();  // Move fast ahead
            slow.next();  // Move slow ahead in sync
        }

        // Step 5: Now slow is at the Nth node from the end
        if (slow.hasNext()) {
            System.out.println("Nth element from the end: " + slow.next());
        } else {
            System.out.println("N is too large");
        }
    }
}