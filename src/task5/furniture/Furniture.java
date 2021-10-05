package task5.furniture;

public abstract class Furniture {
    private String material;
    private int price;

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract void use();
}
