package Lesson_10;

public class Rectangle implements Shape, PerimeterRectangle {
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

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
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
        return getLength() * getWidth();
    }

    @Override
    public void shapeInfo() {
        System.out.printf("%s имеет площадь = %.2f, периметр = %.2f, цвет фона - %s, цвет границ - %s%n",
                getName(), square(), perimeterRectangle(), getContextColor(), getBorderColor());
    }
}

