package task11.game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Play extends Application {

	public static void main(String[] args) {

		launch(args);
	}
	
	public void setGame(Group root, Stage stage, Button submit,
	                    Button clear, TextField textField, Label label) {
		
		submit.setLayoutY(50);
		submit.setLayoutX(15);
		submit.setFocusTraversable(false);
		
		clear.setLayoutY(50);
		clear.setLayoutX(75);
		clear.setFocusTraversable(false);
		
		label.setLayoutY(100);
		
		textField.setPromptText("Guess the number");
		textField.setFocusTraversable(false);
		
		root.setLayoutY(100);
		root.setLayoutX(200);
		root.getChildren().add(textField);
		root.getChildren().add(submit);
		root.getChildren().add(clear);
		root.getChildren().add(label);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		scene.setFill(Color.web("#A18FD6"));
		stage.setTitle("Guess the number");
		stage.setHeight(400);
		stage.setWidth(600);
		stage.show();
	}

	@Override
	public void start(Stage stage) throws Exception {

		Button submit = new Button("Submit");

		Button clear = new Button("Clear");

		TextField textField = new TextField();

		Label label = new Label();
		
		Player player = new Player();
		Game game = new Game(player, textField, label);

		submit.setOnAction(e -> game.play());

		clear.setOnAction(e -> textField.clear());

		Group root = new Group();
		setGame(root, stage, submit, clear, textField, label);
	}
}
