package task11.sides;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SidesTest extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		
		Side center = new Side("CENTER", 200, 200);
		Side west = new Side("WEST", 0, 200);
		Side south = new Side("SOUTH", 200, 400);
		Side north = new Side("NORTH", 200, 0);
		Side east = new Side("EAST", 400, 200);
		
		center.waitForMouse();
		west.waitForMouse();
		south.waitForMouse();
		north.waitForMouse();
		east.waitForMouse();
		
		Group root = new Group(center.getCanvas(),
            west.getCanvas(), south.getCanvas(),
            north.getCanvas(), east.getCanvas());
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Sides");
		stage.show();
	}
	}
