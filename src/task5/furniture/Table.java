package task5.furniture;

public class Table extends Furniture{

    private boolean cloth;

    public Table(String material, int price, boolean cloth) {
        super(material, price);
        this.cloth = cloth;
    }

    public boolean hasCloth() {
        return cloth;
    }

    @Override
    public void use() {
        System.out.println("You can have dinner at this table " +
                "made of " + this.getMaterial() +
                ". It has " + (this.hasCloth()?"a":"no") +
                " cloth. And costs " + this.getPrice() +
                " dollars."
        );
    }
}
