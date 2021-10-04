package task7;

public class MovableRectangle implements Movable{

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y2, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean haveSameSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed)
                && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        if (!haveSameSpeed()) return;
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        if (!haveSameSpeed()) return;
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        if (!haveSameSpeed()) return;
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        if (!haveSameSpeed()) return;
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
