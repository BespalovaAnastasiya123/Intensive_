package Lesson_10;

public class Main {
    public static void main(String[] args) {
        Animal catMurzik = new Cat("Мурзик");
        Animal catBarsik = new Cat("Барсик");
        Animal dogSharik = new Dog("Шарик");
        Animal dogBobik = new Dog("Бобик");

        catMurzik.run(0);
        catMurzik.swim(150);
        catBarsik.swim(90);
        catBarsik.run(190);
        System.out.println();

        dogBobik.run(180);
        dogBobik.swim(180);
        dogSharik.run(350);
        dogSharik.swim(800);
        System.out.println();

        System.out.println("Количество созданных котов = " + Cat.getCatCount());
        System.out.println("Количество созданных собак = " + Dog.getDogCount());
        System.out.println("Количество созданных животных = " + Animal.getAnimalCount());
        System.out.println();

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Васька");
        cats[1] = new Cat("Баська");
        cats[2] = new Cat("Маха");
        cats[3] = new Cat("Пузик");
        for (Cat cat : cats) {
            cat.eat(5);
        }
        System.out.println();

        Cat.addToPlate(100);
        for (Cat cat : cats) {
            cat.eat(18);
        }
        System.out.println();

        Circle circle = new Circle(3, "Green", "White");
        Rectangle rectangle = new Rectangle(4, 5, "Black", "Yellow");
        Triangle triangle = new Triangle(10, 10, 10, "Yellow", "Black");

        circle.perimeter();
        circle.square();
        System.out.println();

        rectangle.perimeter();
        rectangle.square();
        System.out.println();

        triangle.perimeter();
        triangle.square();
        System.out.println();

        circle.shapeInfo();
        rectangle.shapeInfo();
        triangle.shapeInfo();
    }
}
