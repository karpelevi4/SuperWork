package task11.game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Play extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Player player = new Player();

		Button submit = new Button("Submit");
		submit.setLayoutY(50);
		submit.setLayoutX(15);
		submit.setFocusTraversable(false);

		Button clear = new Button("Clear");
		clear.setLayoutY(50);
		clear.setLayoutX(75);
		clear.setFocusTraversable(false);

		TextField textField = new TextField();
		textField.setPromptText("Guess the number");
		textField.setFocusTraversable(false);

		Label label = new Label();
		label.setLayoutY(100);

		submit.setOnAction(e -> {
			if ((textField.getText() != null && !textField.getText().isEmpty())) {






				label.setText("Number "+ textField.getText() +" was submitted");
			} else {
				label.setText("You have not left any number");
			}
		});

		clear.setOnAction(e -> {
			textField.clear();
		});

		Group root = new Group();
		root.setLayoutY(100);
		root.setLayoutX(200);
		root.getChildren().add(textField);
		root.getChildren().add(submit);
		root.getChildren().add(clear);
		root.getChildren().add(label);
		stage.setScene(new Scene(root));
		stage.setTitle("Guess the number");
		stage.setHeight(400);
		stage.setWidth(600);
		stage.show();
	}
}
