package task3.circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle("pink", 12);
        System.out.println(c);
        c.paintAnyColor("blue");
        System.out.println(c);
        System.out.println("Circle's area is " + c.getArea());
    }
}
