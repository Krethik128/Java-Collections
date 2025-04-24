package collections.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {

    public static String getNthFromEnd(LinkedList<String> elements, int n) {
        if (n <= 0 || elements == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        ListIterator<String> lead = elements.listIterator();
        ListIterator<String> follow = elements.listIterator();

        // Move lead pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!lead.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            lead.next();
        }

        // Move both pointers until lead reaches the end
        while (lead.hasNext()) {
            lead.next();
            follow.next();
        }

        return follow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        String result = getNthFromEnd(list, n);
        System.out.println("The " + n + "th element from the end is: " + result);
    }
}
