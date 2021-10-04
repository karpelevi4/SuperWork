package task6.nameable;

import task6.nameable.Nameable;

public class Animal implements Nameable {
    private String name;
    private int age;

    public Animal (String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }
}
