package Lesson_10;

public interface perimeterCircle {
    double getRadius();

    default double perimeterCircle() {
        return 2 * Math.PI * getRadius();
    }
}
