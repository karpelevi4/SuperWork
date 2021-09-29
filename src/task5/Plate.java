package task5;

class Plate extends Dish {
    private int radius;


    public Plate(String material, int price, int radius){
        super(material, price);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void displayInfo(){
        System.out.println("Материал тарелки: " + getMaterial() + ".");
        System.out.println("Цена тарелки: " + getPrice() + " руб.");
        System.out.println("Размер тарелки: " + getRadius() + " см.");
    }
}
