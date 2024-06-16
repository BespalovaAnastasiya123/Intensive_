package Lesson_10;

public class Triangle implements Shape, PerimeterTriangle {
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

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
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
        double p = perimeterTriangle() / 2;
        return Math.sqrt(p) * (p - getSideA()) * (p - getSideB()) * (p - getSideC());
    }

    @Override
    public void shapeInfo() {
        System.out.printf("%s имеет площадь = %.2f, периметр = %.2f, цвет фона - %s, цвет границ - %s%n",
                getName(), square(), perimeterTriangle(), getContextColor(), getBorderColor());
    }
}
