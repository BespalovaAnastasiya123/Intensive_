package Lesson_10;

public class Circle implements Shape {
    private static final String NAME = "Круг";
    private double radius;
    private String contextColor;
    private String borderColor;

    public Circle(double radius, String contextColor, String borderColor) {
        this.radius = radius;
        this.contextColor = contextColor;
        this.borderColor = borderColor;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getContextColor() {
        return contextColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
