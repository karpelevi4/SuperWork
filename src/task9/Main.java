package task9;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{
	
	private Result result;
	private LastScorer lastScorer;
	private Winner winner;

	public static void main(String[] args) {

		launch(args);
	}

	public void update(Team team) {
		team.updatePoints();
		result.updateLabelText();
		lastScorer.setLastScorer(team);
		lastScorer.updateLabelText();
		winner.updateLabelText();
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

		result = new Result(milan, madrid, 350, 250);
		lastScorer = new LastScorer(milan, madrid, 350, 300);
		winner = new Winner(milan, madrid, 350, 350);

		milan.getButton().setOnAction(e-> update(milan));

		madrid.getButton().setOnAction(e-> update(madrid));

		Group root = new Group();
        root.getChildren().addAll(result.label, lastScorer.label, winner.label, milan.getButton(), madrid.getButton());

		Scene scene = new Scene(root);
		setSceneAndStage(stage, scene);
	}
}
