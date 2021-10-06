package task8;

import javafx.scene.canvas.GraphicsContext;

import java.util.Random;

public abstract class Shape {
    String color;
    int x;
    int y;
    Random r = new Random();

    public Shape() {
        //рандомная позиция и рандомный цвет
        this.x = r.nextInt(800);
        this.y = r.nextInt(800);
        this.color = "rgb(" + r.nextInt(255) + ","
                + r.nextInt(255) + ","
                + r.nextInt(255) + ")";
    }

    public abstract void paint(GraphicsContext gc);
}
