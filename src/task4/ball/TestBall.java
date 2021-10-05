package task4.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball standartBall = new Ball();
        System.out.println(standartBall);
        standartBall.move(6, 17.5);
        System.out.println(standartBall);
        Ball secondBall = new Ball(15, 33.9);
        System.out.println(secondBall.getX() + " " +secondBall.getY());
        secondBall.setX(45);
        secondBall.setY(71.2);
        System.out.println(secondBall.getX() + " " +secondBall.getY());
        secondBall.setXY(0, 0);
        System.out.println(secondBall.getX() + " " +secondBall.getY());
    }
}
