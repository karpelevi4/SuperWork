package task5.furniture;

public class Main {
    public static void main(String[] args) {
        Chair c = new Chair("plastic", 40, true);
        Table t = new Table("wood", 100, false);

        c.use();
        t.use();
    }
}
