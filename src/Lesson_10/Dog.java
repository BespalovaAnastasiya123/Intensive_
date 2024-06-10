package Lesson_10;

public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public String getName() {
        return name;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int dist) {
        if (dist > 0 && dist <= 500) {
            System.out.println(getName() + " пробежал " + dist + " метров.");
        } else if (dist <= 0) {
            System.out.println("Ошибка. Неверный ввод параметра.");
        } else {
            System.out.println(getName() + " не сможет пробежать " + dist + " метров.");
        }
    }

    @Override
    public void swim(int dist) {
        if (dist > 0 && dist <= 10) {
            System.out.println(getName() + " пролыл " + dist + " метров.");
        } else if (dist <= 0) {
            System.out.println("Неверный ввод параметра. Повторите снова.");
        } else {
            System.out.println(getName() + " не сможет проплыть " + dist + " метров.");
        }
    }
}

