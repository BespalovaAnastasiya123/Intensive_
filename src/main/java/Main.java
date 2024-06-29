public class Main {
    public static void main(String[] args) {

        String[] words = {"машина", "компьютер", "мяч", "шорты", "мяч", "сумка", "машина", "цветы", "конфета", "мяч", "сумка", "конфета", "мышь"};

        PhoneBook phonebook = new PhoneBook();
        UniqueWords.arrayInfo(words);

        phonebook.add("Петров", "+375335757888");
        phonebook.add("Иванов", "+375335757889");
        phonebook.add("Сидоров", "+375335757890");
        phonebook.add("Иванов", "+375335757891");

        System.out.println("Номер по запросу Петров: " + phonebook.get("Петров"));
        System.out.println("Номер по запросу Иванов: " + phonebook.get("Иванов"));
        System.out.println("Номер по запросу Сидоров: " + phonebook.get("Сидоров"));
    }
}
