package task7;

public class Square extends Rectangle {

    public Square() {
        super();
    };

    public Square(double side) {
        this.width = side;
        this.length = side;
    };

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    };

    public double getSide() {return width;};

    public  void setSide(double side) {
        this.width = side;
        this.length = side;
    };

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
