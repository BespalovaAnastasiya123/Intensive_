package Lesson_10;

public interface Shape {
    String getName();

    String getBorderColor();

    String getContextColor();

    double square();

    default void shapeInfo() {
    }
}
