package Lesson_13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String[] words = {"машина", "компьютер", "мяч", "шорты", "мяч", "сумка", "машина", "цветы", "конфета", "мяч", "сумка", "конфета", "мышь"};

        Map<String, Integer> wordCount = new HashMap<>();

        // Подсчитываем количество встреч каждого слова
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

        System.out.println("\nКоличество встреч каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Петров", "+375335757888");
        phonebook.add("Иванов", "+375335757889");
        phonebook.add("Сидоров", "+375335757890");
        phonebook.add("Иванов", "+375335757891");

        System.out.println("Номер по запросу Петров: " + phonebook.get("Петров"));
        System.out.println("Номер по запросу Иванов: " + phonebook.get("Иванов"));
        System.out.println("Номер по запросу Сидоров: " + phonebook.get("Сидоров"));
    }
}

