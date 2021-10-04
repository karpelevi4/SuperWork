package task6.priceable;

public class Food implements Priceable{
    private double price;
    private String date;

    public Food(String date, double price) {
        this.date = date;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
