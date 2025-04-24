package collections.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FindFrequency {

    // Method to count the frequency of each element in a List of Strings
    public static Map<String, Integer> findFrequency(List<String> list) {
        // Create a HashMap to store the frequency of each element
        Map<String, Integer> frequencyMap = new HashMap<>();
        // Iterate through each element in the list
        for (String element : list) {
            // If the element is already in the map, increment its count
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        // Return the frequency map
        return frequencyMap;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> frequency = findFrequency(inputList);
        System.out.println("Frequency of elements: " + frequency);
    }
}
