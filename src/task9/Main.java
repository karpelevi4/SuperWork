package task9;

import javafx.application.Application;
import javafx.scene.paint.Color;
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

    public void addToGroup(Group root, Team firstTeam, Team secondTeam,
        Result result, LastScorer lastScorer,Winner winner) {
        root.getChildren().add(firstTeam.getButton());
        root.getChildren().add(secondTeam.getButton());
        root.getChildren().add(result.label);
        root.getChildren().add(lastScorer.label);
        root.getChildren().add(winner.label);
    }

    public void setSceneAndStage(Stage stage, Scene scene) {
        stage.setScene(scene);
        stage.setTitle("Результаты матчей (Милан и Мадрид)");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.setResizable(false);
        scene.setFill(Color.web("#AFEEEE"));
        stage.show();
    }

    @Override
    public void start(Stage stage) {

        Team milan = new Team("Милан", 340, 200);
        Team madrid = new Team("Мадрид", 400, 200);

        Result result = new Result(milan, madrid, 350, 250);
        LastScorer lastScorer = new LastScorer(milan, madrid, 350, 300);
        Winner winner = new Winner(milan, madrid, 350, 350);

        milan.getButton().setOnAction(e-> update(milan, result, lastScorer, winner));

        madrid.getButton().setOnAction(e-> update(madrid, result, lastScorer, winner));

        Group root = new Group();
        addToGroup(root, milan, madrid, result, lastScorer, winner);

        Scene scene = new Scene(root);
        setSceneAndStage(stage, scene);
    }
}
