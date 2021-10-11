package task11.sides;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SidesTest extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		Canvas canvas = new Canvas(800,600);
		Pane root = new Pane(canvas);
		Scene scene = new Scene(root );
		stage.setScene(scene);
		stage.setTitle("Sides");
		
		GraphicsContext g = canvas.getGraphicsContext2D();
		
		g.setFill(Color.web("#b5cef7"));
		g.fillRect(0,0,canvas.getWidth()/2, canvas.getHeight()/2);
		
		g.setFill(Color.web("#b5f7c6"));
		g.fillRect(canvas.getWidth()/2,0,canvas.getWidth(), canvas.getHeight()/2);
		
		g.setFill(Color.web("#f7dfb5"));
		g.fillRect(0,canvas.getHeight()/2,canvas.getWidth()/2, canvas.getWidth());
		
		g.setFill(Color.web("#e3b5f7"));
		g.fillRect(canvas.getWidth()/2,canvas.getHeight()/2,canvas.getWidth(), canvas.getHeight());
		
		g.setFill(Color.web("#fff"));
		g.fillOval(canvas.getWidth()/4,canvas.getHeight()/4,canvas.getWidth()/2, canvas.getHeight()/2);
		
		stage.show();
	}
	}
