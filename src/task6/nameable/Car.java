package task6.nameable;

public class Car implements Nameable {
    private String name;
    private int price;

    public Car (String n, int p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }
}
