package task9;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button milanButton = new Button("Милан");

        Button madridButton = new Button("Мадрид");
        madridButton.setLayoutX(200); //размещение кнопки "Мадрид"

        Group root = new Group(madridButton, milanButton);


        root.getChildren().addAll();

        Scene scene = new Scene(root, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Результаты матчей (Милан и Мадрид)");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
}
