package Lesson_10;

public interface Shape {
    String getName();

    String getBorderColor();

    String getContextColor();

    double square();

    default double perimeter() {
        return 0;
    }

    default void shapeInfo() {
        System.out.printf("%s имеет площадь = %.2f, периметр = %.2f, цвет фона - %s, цвет границ - %s%n",
                getName(), square(), perimeter(), getContextColor(), getBorderColor());
    }
}
