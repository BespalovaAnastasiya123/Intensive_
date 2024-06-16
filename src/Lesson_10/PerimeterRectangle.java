package Lesson_10;

public interface PerimeterRectangle {
    double getLength();

    double getWidth();

    default double perimeterRectangle() {
        return (getLength() + getWidth()) * 2;
    }
}
