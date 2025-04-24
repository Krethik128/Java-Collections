package collections.map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class WordFrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordFrequencies = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordFrequencies;
    }
    public static void main(String[] args) {
        String filePath = "/Users/krethik/Desktop/sample.txt";
        File file = new File(filePath);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Hello world, hello Java!");
        } catch (FileNotFoundException e) {
            System.err.println("Error creating sample file: " + e.getMessage());
            return;
        }
        Map<String, Integer> frequencyMap = countWordFrequency(filePath);
        System.out.println("Word Frequencies: " + frequencyMap);
    }
}

