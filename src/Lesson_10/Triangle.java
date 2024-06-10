package Lesson_10;

public class Triangle implements Shape {
    private static final String NAME = "Треугольник";
    private double sideA;
    private double sideB;
    private double sideC;
    private String borderColor;
    private String contextColor;

    public Triangle(double sideA, double sideB, double sideC, String borderColor, String contextColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
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
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double square() {
        double p = perimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideB));
    }
}
