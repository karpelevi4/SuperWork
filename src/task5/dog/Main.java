package task5.dog;

public class Main {
    public static void main(String[] args) {
        Pug Fred = new Pug("Fred", true, 5);
        Husky Will = new Husky("Will", true, 70);

        Fred.specialFeature();
        Will.specialFeature();
    }
}
