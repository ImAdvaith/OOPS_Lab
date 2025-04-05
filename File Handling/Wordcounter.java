import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        File file = new File("notes.txt");
        if (!file.exists()) {
            System.out.println("File not found.");
            return;
        }

        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sorted = new ArrayList<>(wordCount.entrySet());
            sorted.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 10 frequent words:");
            for (int i = 0; i < Math.min(10, sorted.size()); i++) {
                Map.Entry<String, Integer> entry = sorted.get(i);
                System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
