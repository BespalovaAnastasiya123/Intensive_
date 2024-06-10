package Lesson_10;

public class Rectangle implements Shape {
    private static final String NAME = "Прямоугольник";
    private double length;
    private double width;
    private String borderColor;
    private String contextColor;

    public Rectangle(double length, double width, String borderColor, String contextColor) {
        this.length = length;
        this.width = width;
        this.borderColor = borderColor;
        this.contextColor = contextColor;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String getContextColor() {
        return contextColor;
    }

    @Override
    public double square() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }
}
