package Lesson_10;

public class Cat extends Animal {
    private static int catCount = 0;
    private static int foodInPlate = 30;
    private static boolean wellFed = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public String getName() {
        return name;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int dist) {
        if (dist > 0 && dist <= 200) {
            System.out.println(getName() + " пробежал " + dist + " метров.");
        } else if (dist <= 0) {
            System.out.println("Ошибка. Неверный ввод параметра.");
        } else {
            System.out.println(getName() + " не сможет пробежать " + dist + " метров.");
        }
    }

    @Override
    public void swim(int dist) {
        System.out.println(getName() + " не умеет плавать.");
    }

    public void eat(int food) {
        if (food >= 0 && foodInPlate >= food) {
            foodInPlate -= food;
            wellFed = true;
            if (wellFed) {
                System.out.println(getName() + " поел и он сытый.");
            }
        } else {
            System.out.println(getName() + " не поел и он голодный.");
        }
    }

    public static void addToPlate(int food) {
        if (food > 0) {
            foodInPlate += food;
            System.out.println("В тарелку добавлено " + food + " единиц корма. Сейчас в миске стало " + foodInPlate + "  единиц корма.");
        }
    }
}



