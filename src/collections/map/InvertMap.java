package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);// original value becomes new key

            // If the new key (original value) is not in the inverted map,
            // create a new empty list for it
            if (!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }

            // Add the key to the list of its corresponding value
            inverted.get(value).add(key);
        }

        return inverted;
    }

    public static void main(String[] args) {
        Map<String, Integer> original = Map.of("A", 1, "B", 2, "C", 1);
        System.out.println(invert(original)); // Output: {1=[A, C], 2=[B]}
    }
}
