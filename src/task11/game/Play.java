package task11.game;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Play extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Button submit = new Button("Submit");
        submit.setLayoutY(50);

        Button clear = new Button("Clear");
        clear.setLayoutY(100);

        TextField textField = new TextField();



        Group root = new Group();
        root.getChildren().add(textField);
        root.getChildren().add(submit);
        root.getChildren().add(clear);
        stage.setScene(new Scene(root));
        stage.setTitle("HBox Experiment 1");
        stage.setHeight(400);
        stage.setWidth(600);
        stage.show();
    }
}
