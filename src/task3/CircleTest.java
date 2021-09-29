package task3;

public class CircleTest {
    public static void main(String args[]) {
        Circle c = new Circle("pink", 12);
        System.out.println(c.toString());
        c.paintAnyColor("blue");
        System.out.println(c.toString());
        System.out.println("Circle's area is " + c.getArea());
    }
}
