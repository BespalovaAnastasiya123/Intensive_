import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWords {

    public static void arrayInfo(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Уникальные слова:");
        Set<String> uniqueWords = wordCount.keySet();
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nКоличество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

