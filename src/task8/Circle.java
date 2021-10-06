package task8;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {

    private int radius;

    public Circle() {
        super();
        this.radius = r.nextInt(50);
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setFill(Color.web(color));
        gc.fillOval(x, y, radius * 2, radius * 2);
    }
}
