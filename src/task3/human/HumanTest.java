package task3.human;

public class HumanTest {
    public static void main(String[] args) {

        Head h1 = new Head(50, true);
        Hand h2 = new Hand(10, false);
        Feet f = new Feet(39, true);

        Human Ann = new Human("Ann", h1, h2, f);

        Ann.displayInfo();
    }
}
