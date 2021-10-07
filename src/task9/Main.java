package task9;

import javafx.application.Application;
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

        /*
        Button milanButton = new Button("Милан");
        milanButton.setFocusTraversable(false);
        Button madridButton = new Button("Мадрид");
        madridButton.setFocusTraversable(false);
        madridButton.setLayoutX(60);
         */


        /*
        Label resultLabel = new Label("Result: " + milanPoints + " X " + madridPoints);
        resultLabel.setLayoutY(50);

        Label lastScorerLabel = new Label("Last Scorer: N/A");
        lastScorerLabel.setLayoutY(100);

        Label winnerLabel = new Label("Winner: DRAW");
        winnerLabel.setLayoutY(150);
         */

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

        Team milan = new Team("Милан", 0, 0);
        Team madrid = new Team("Мадрид", 60, 0);

        Result result = new Result(milan, madrid, 0, 50);
        LastScorer lastScorer = new LastScorer(milan, madrid, 0, 100);
        Winner winner = new Winner(milan, madrid, 0, 150);

        Group root = new Group();
        root.getChildren().add(milan.getButton());
        root.getChildren().add(madrid.getButton());
        root.getChildren().add(result.label);
        root.getChildren().add(lastScorer.label);
        root.getChildren().add(winner.label);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Результаты матчей (Милан и Мадрид)");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
}
