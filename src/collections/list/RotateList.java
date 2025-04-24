package collections.list;
import java.util.*;

class RotateList {
    public static <T> void rotateList(List<T> list, int rotateBy) {
        int n = list.size();
        // Ensure rotateBy is within the bounds of the list size
        rotateBy = rotateBy % n;
        // Handle negative rotation values
        if (rotateBy < 0) {
            rotateBy = n + rotateBy;
        }
        // If rotateBy is 0, no rotation is needed
        if (rotateBy == 0) {
            return;
        }
        // Perform the rotation using a temporary list
        List<T> temp = new ArrayList<>(list.subList(n - rotateBy, n));
        temp.addAll(list.subList(0, n - rotateBy));
        // Clear the original list and add the rotated elements
        list.clear();
        list.addAll(temp);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Original List: " + numbers);
        rotateList(numbers, rotateBy);
        System.out.println("Rotated List by " + rotateBy + ": " + numbers);

        List<String> letters = new LinkedList<>(Arrays.asList("P", "Q", "R", "S", "T"));
        int rotateByNegative = -1;
        System.out.println("Original List: " + letters);
        rotateList(letters, rotateByNegative);
        System.out.println("Rotated List by " + rotateByNegative + ": " + letters);
    }
}