package task6;

public class Animal implements Nameable {
    String name;
    int age;

    Animal (String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }
}
