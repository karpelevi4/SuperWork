package task3.human;

public class Feet {

    boolean warm;
    int size;

    public Feet(int size, boolean warm) {
        this.size = size;
        this.warm = true;
    }

    public boolean isWarm() {
        return warm;
    }

    public int getSize() {
        return size;
    }

    public void makeWarm() {
        this.warm = true;
    }
}
