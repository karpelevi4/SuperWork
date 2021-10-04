package task5.dish;

abstract class Dish {

    private String material;
    private int price;

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

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void displayInfo();
}
