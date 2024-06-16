package Lesson_10;

public interface PerimeterTriangle {
    double getSideA();

    double getSideB();

    double getSideC();

    default double perimeterTriangle() {
        return getSideA() + getSideB() + getSideC();
    }
}
