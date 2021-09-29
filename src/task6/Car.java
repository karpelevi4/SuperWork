package task6;

public class Car implements Nameable {
    String name;
    int price;

    Car (String n, int p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }
}
