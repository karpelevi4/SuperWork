package task6.nameable;

public class Planet implements Nameable {
    String name;
    String weight;

    Planet (String n, String w) {
        name = n;
        weight = w;
    }

    public String getName() {
        return name;
    }
}
