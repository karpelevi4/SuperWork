package task8;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {

    private int width;

    public Triangle() {
        super();
        this.width = r.nextInt(50);
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setFill(Color.web(color));
        gc.fillPolygon(new double[]{x, x + width, x}, new double[]{y, y, y + width}, 3);
    }
}
