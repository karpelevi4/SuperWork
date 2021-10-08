package task2;

public class Shape {

    private int area;
    private String kind;
    private  boolean filled;

    Shape (String kind, boolean filled, int area) {

        this.area = area;
        this.filled = filled;
        this.kind = kind;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "This shape's " +
                "area is " + area +
                ", it is a " + kind +
                ", and it is " + (this.isFilled()?"":"not ") + "filled";
    }
}
