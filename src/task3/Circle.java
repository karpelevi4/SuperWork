package task3;

public class Circle {
    private double radius;
    private String color;

    public Circle(String c, double r) {
        color = c;
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void paintAnyColor(String c) {
        color = c;
        System.out.println("The circle was painted with " + c + " paint.");
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return color + " circle's radius is " + radius;
    }
}
