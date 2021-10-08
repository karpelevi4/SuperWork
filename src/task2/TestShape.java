package task2;

public class TestShape {

    public static void main(String[] args) {

        Shape circle = new Shape("circle", false, 233);
        Shape square = new Shape("square", true, 100);

        System.out.println(circle);
        System.out.println(square);
    }
}
