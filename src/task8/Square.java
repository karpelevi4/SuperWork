package task8;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Shape{

    private int side;

    public Square() {
        super();
        this.side = r.nextInt(50);
    }

    @Override
    public void paint(GraphicsContext gc) {
        gc.setFill(Color.web(color));
        gc.fillRect(x,y,side,side);
    }
}
