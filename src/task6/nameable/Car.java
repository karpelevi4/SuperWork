package task6.nameable;

import task6.nameable.Nameable;

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
