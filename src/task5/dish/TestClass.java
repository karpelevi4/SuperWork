package task5.dish;

public class TestClass {
    public static void main(String[] args){
        Plate plate_one = new Plate("стекло", 549, 22);
        Cup cup_one = new Cup("керамика", 499, 350);

        plate_one.displayInfo();
        System.out.println();
        cup_one.displayInfo();
    }
}
