package task9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    public static void updatePoints(int points) {
        points++;
    }

    @Override
    public void start(Stage stage) {
        int milanPoints = 0;
        int madridPoints = 0;

        Team milan = new Team("Милан", 0, 0);
        Team madrid = new Team("Милан", 60, 0);

        /*
        Button milanButton = new Button("Милан");
        milanButton.setFocusTraversable(false);
        Button madridButton = new Button("Мадрид");
        madridButton.setFocusTraversable(false);
        madridButton.setLayoutX(60);
         */

        Label resaultLabel = new Label("Result: " + milanPoints + " X " + madridPoints);
        resaultLabel.setLayoutY(50);

        Label lastScorerLabel = new Label("Last Scorer: N/A");
        lastScorerLabel.setLayoutY(100);

        Label winnerLabel = new Label("Winner: DRAW");
        winnerLabel.setLayoutY(150);

        /*
        milanButton.setOnAction(value ->  {
            resaultLabel.setText("Result: " + (milanPoints + 1) + " X " + madridPoints);
            lastScorerLabel.setText("Last Scorer: Milan");
        });

        madridButton.setOnAction((event) ->  {

            resaultLabel.setText("Result: " + milanPoints + " X " + (madridPoints + 1));
            lastScorerLabel.setText("Last Scorer: Madrid");
        });

         */

        Group root = new Group();

        root.getChildren().add(madrid.getButton(), madrid.getButton());

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Результаты матчей (Милан и Мадрид)");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
}
