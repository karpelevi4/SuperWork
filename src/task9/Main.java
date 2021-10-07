package task9;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    public void update(Team team, Result result, LastScorer lastScorer, Winner winner) {
        team.updatePoints();
        result.updateLabelText();
        lastScorer.setLastScorer(team);
        lastScorer.updateLabelText();
        winner.updateLabelText();
    }

    @Override
    public void start(Stage stage) {

        Team milan = new Team("Милан", 0, 0);
        Team madrid = new Team("Мадрид", 60, 0);

        Result result = new Result(milan, madrid, 0, 50);
        LastScorer lastScorer = new LastScorer(milan, madrid, 0, 100);
        Winner winner = new Winner(milan, madrid, 0, 150);

        milan.getButton().setOnAction(value-> update(milan, result, lastScorer, winner));

        madrid.getButton().setOnAction(value-> update(madrid, result, lastScorer, winner));

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
