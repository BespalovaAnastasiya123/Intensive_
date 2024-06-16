package Lesson_10;

public class Circle implements Shape, perimeterCircle {
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
    public double getRadius() {
        return radius;
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void shapeInfo() {
        System.out.printf("%s имеет площадь = %.2f, периметр = %.2f, цвет фона - %s, цвет границ - %s%n",
                getName(), square(), perimeterCircle(), getContextColor(), getBorderColor());
    }

}

