package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    public static <K, V extends Number> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> mergedMap = new HashMap<>(map1);
        map2.forEach((key, value) -> mergedMap.merge(key, value, (v1, v2) -> {
            if (v1 instanceof Integer && v2 instanceof Integer) {
                return (V) Integer.valueOf(v1.intValue() + v2.intValue());
            } else if (v1 instanceof Double && v2 instanceof Double) {
                return (V) Double.valueOf(v1.doubleValue() + v2.doubleValue());
            }
            throw new IllegalArgumentException("Unsupported number types for merging.");
        }));
        return mergedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        Map<String, Integer> merged = mergeMaps(map1, map2);
        System.out.println("Map1: " + map1);
        System.out.println("Map2: " + map2);
        System.out.println("Merged Map: " + merged);

        Map<String, Double> map3 = new HashMap<>();
        map3.put("X", 1.5);
        map3.put("Y", 2.5);
        Map<String, Double> map4 = new HashMap<>();
        map4.put("Y", 3.5);
        map4.put("Z", 4.5);
        Map<String, Double> mergedDouble = mergeMaps(map3, map4);
        System.out.println("Map3: " + map3);
        System.out.println("Map4: " + map4);
        System.out.println("Merged Double Map: " + mergedDouble);
    }
}
