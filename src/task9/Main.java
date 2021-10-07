package task9;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        int milanPoints = 0;
        int madridPoints = 0;


        Button milanButton = new Button("Милан");

        Button madridButton = new Button("Мадрид");
        madridButton.setLayoutX(60);

        Label resaultLabel = new Label("Result: " + milanPoints + " X " + madridPoints);
        resaultLabel.setLayoutY(50);

        Label lastScorerLabel = new Label("Last Scorer: N/A");
        lastScorerLabel.setLayoutY(100);

        Label winnerLabel = new Label("Winner: DRAW");
        winnerLabel.setLayoutY(150);

        milanButton.setOnAction(value ->  {

            resaultLabel.setText("Result: " + (milanPoints + 1) + " X " + madridPoints);
            lastScorerLabel.setText("Last Scorer: Milan");
        });

        madridButton.setOnAction(value ->  {

            resaultLabel.setText("Result: " + milanPoints + " X " + (madridPoints + 1));
            lastScorerLabel.setText("Last Scorer: Madrid");
        });

        Group root = new Group(madridButton, milanButton, resaultLabel,
                lastScorerLabel, winnerLabel);


        root.getChildren().addAll();

        Scene scene = new Scene(root, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Результаты матчей (Милан и Мадрид)");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
}
