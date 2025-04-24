package collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class FindKeyWithHighestValue {
    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        if (map.isEmpty()) {
            return null;
        }
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> dataMap = new HashMap<>();
        dataMap.put("A", 10);
        dataMap.put("B", 20);
        dataMap.put("C", 15);
        String keyWithMax = findKeyWithMaxValue(dataMap);
        System.out.println("Map: " + dataMap);
        System.out.println("Key with the highest value: " + keyWithMax);
    }
}
