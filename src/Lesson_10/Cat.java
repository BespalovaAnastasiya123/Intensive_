package Lesson_10;

public class Cat extends Animal {
    private static int food;
    private static int catCount = 0;

    public Cat(String name, int food) {
        super(name);
        Cat.food = food;
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

    public void eat(Bowl bowl) {
        if (food > 0 && bowl.getFoodInBowl() >= food) {
            System.out.println(getName() + " поел и он сытый.");
            bowl.eatFoodFromBowl(food);
        } else {
            System.out.println(getName() + " не поел и он голодный.");
        }
    }
}








