package task6.priceable;

public class Toy implements Priceable{
    private double price;
    private String color;

    public Toy(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
