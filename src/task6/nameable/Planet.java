package task6.nameable;

public class Planet implements Nameable {
    private String name;
    private String weight;

    public Planet (String n, String w) {
        name = n;
        weight = w;
    }

    public String getName() {
        return name;
    }
}
