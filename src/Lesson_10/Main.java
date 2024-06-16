package Lesson_10;

public class Main {
    public static void main(String[] args) {
        Animal catMurzik = new Cat("Мурзик", 0);
        Animal catBarsik = new Cat("Барсик", 0);
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
        cats[0] = new Cat("Васька", 3);
        cats[1] = new Cat("Баська", 3);
        cats[2] = new Cat("Маха", 3);
        cats[3] = new Cat("Пузик", 3);

        Bowl bowl = new Bowl(13);
        System.out.println("Сейчас в тарелке " + bowl.getFoodInBowl() + " единиц еды");
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println();

        bowl.addToBowl(11);
        for (Cat cat : cats) {
            cat.eat(bowl);
        }
        System.out.println();

        Circle circle = new Circle(3, "Green", "White");
        Rectangle rectangle = new Rectangle(1, 1, "Black", "Yellow");
        Triangle triangle = new Triangle(1, 1, 1, "Yellow", "Black");

        circle.shapeInfo();
        rectangle.shapeInfo();
        triangle.shapeInfo();
    }
}
