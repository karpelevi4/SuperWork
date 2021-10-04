package task7;

public class Square extends Rectangle {

    public Square() {};

    public Square(double side) {};

    public Square(double side, String color, boolean filled) {};

    public double getSide() {return 1;};

    public  void setSide(double side) {};

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
        return super.toString();
    }
}
