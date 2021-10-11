package task11.sides;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SidesTest extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		Canvas canvas = new Canvas(800,600);
		double cWidth = canvas.getWidth();
		double cHeight = canvas.getHeight();
		Group root = new Group(canvas);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Sides");
		
		GraphicsContext g = canvas.getGraphicsContext2D();
		
		g.setFill(Color.web("#b5cef7"));
		g.fillRect(cWidth/3, 0, cWidth/3, cHeight/3);
		
		g.setFill(Color.web("#b5f7c6"));
		g.fillRect(0, cHeight/3, cWidth/3, cHeight/3);
		
		g.setFill(Color.web("#f7dfb5"));
		g.fillRect(cWidth/3, cHeight*2/3, cWidth/3, cHeight/3);
		
		g.setFill(Color.web("#e3b5f7"));
		g.fillRect(cWidth*2/3, cHeight/3, cWidth/3, cHeight/3);
		
		g.setFill(Color.web("#e9f7b5"));
		g.fillRect(cWidth/3, cHeight/3, cWidth/3, cHeight/3);
		
		canvas.setOnMouseEntered(e -> {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setTitle("Мышь вошла в определённую область");
			alert.setHeaderText(null);
			alert.setGraphic(null);
			alert.setContentText("Добро пожаловать");
			alert.showAndWait();
		});
		
		stage.show();
	}
	}
