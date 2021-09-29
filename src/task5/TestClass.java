package task5;

public class TestClass {
    public static void main(String[] args){
        Plate plate_one = new Plate("стекло", 549, 22);
        Cup cup_one = new Cup("керамика", 499, 24);

        plate_one.displayInfo();
        System.out.println();
        cup_one.displayInfo();
    }
}
