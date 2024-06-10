package Lesson_10;

public abstract class Animal {
    String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void run(int dist);

    public abstract void swim(int dist);
}
