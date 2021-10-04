package task6.priceable;

public class Clothes implements  Priceable{
    private double price;
    private String size;

    public Clothes(String size, double price) {
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
