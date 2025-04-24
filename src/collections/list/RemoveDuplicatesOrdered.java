package collections.list;
import java.util.*;

class RemoveDuplicatesOrdered {

    // Method to remove duplicates while preserving the original order
    public static <T> List<T> removeDuplicatesOrdered(List<T> list) {
        // Use a LinkedHashSet to store elements in insertion order and avoid duplicates
        Set<T> set = new LinkedHashSet<>(list);
        // Create a new ArrayList from the LinkedHashSet to maintain order
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> uniqueNumbers = removeDuplicatesOrdered(numbersWithDuplicates);
        System.out.println("Original List with Duplicates: " + numbersWithDuplicates);
        System.out.println("List with Duplicates Removed (Order Preserved): " + uniqueNumbers);

        List<String> stringsWithDuplicates = Arrays.asList("cat", "dog", "cat", "fish", "dog");
        List<String> uniqueStrings = removeDuplicatesOrdered(stringsWithDuplicates);
        System.out.println("Original List with Duplicates: " + stringsWithDuplicates);
        System.out.println("List with Duplicates Removed (Order Preserved): " + uniqueStrings);
    }
}
