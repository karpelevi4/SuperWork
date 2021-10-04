package task5.dish;

class Cup extends Dish {
    private int volume;

    public Cup(String material, int price, int volume){
        super(material, price);
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public void displayInfo(){
        System.out.println("Материал стакана: " + getMaterial() + ".");
        System.out.println("Цена стакана: " + getPrice() + " руб.");
        System.out.println("Объем: " + getVolume() + " мл.");
    }
}
