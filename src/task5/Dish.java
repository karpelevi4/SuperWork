package task5;

public abstract class Dish {
    private final String material;
    private final int price;
    public Dish(String material, int price){
        this.material = material;
        this.price = price;
    }

    public String getMaterial(){
        return material;
    }

    public int getPrice(){
        return price;
    }

    public abstract void displayInfo();
}
