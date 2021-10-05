package task5.furniture;

public class Chair extends Furniture{

    private boolean back;

    public Chair(String material, int price, boolean back) {
        super(material, price);
        this.back = back;
    }

    public boolean hasBack() {
        return back;
    }

    @Override
    public void use() {
        System.out.println("You can seat on this chair " +
                "made of " + this.getMaterial() +
                ". It has " + (this.hasBack()?"a":"no") +
                " back. And costs " + this.getPrice() +
                " dollars."
        );
    }
}
