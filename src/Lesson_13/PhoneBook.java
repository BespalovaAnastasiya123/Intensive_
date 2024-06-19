package Lesson_13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private final Map<String, Set<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        Set<String> phones = phonebook.getOrDefault(lastName, new HashSet<>());
        phones.add(phoneNumber);
        phonebook.put(lastName, phones);
    }

    public Set<String> get(String lastName) {
        return phonebook.getOrDefault(lastName, new HashSet<>());
    }
}