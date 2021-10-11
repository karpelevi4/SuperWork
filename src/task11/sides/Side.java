package task11.sides;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;

public class Side {
	
	private String name;
	private Canvas canvas;
	private GraphicsContext gc;
	
	public Side(String name, int positionX, int positionY) {
		
		this.name = name;
		
		canvas = new Canvas(200, 200);
		canvas.setLayoutX(positionX);
		canvas.setLayoutY(positionY);
		
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.web("hsl(" + Math.random() * 360 + ", 50%, 80%)"));
		gc.fillRect(0, 0, 200, 200);
		gc.setFill(Color.BLACK);
		gc.fillText(name, 20, 20);
	}
	
	public String getName() {
		return name;
	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public void waitForMouse() {
		canvas.setOnMouseEntered(e -> {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Мышь вошла в " + name);
			alert.setHeaderText(null);
			alert.setGraphic(null);
			alert.setContentText("Добро пожаловать в " + name);
			alert.showAndWait();
		});
	}
}
