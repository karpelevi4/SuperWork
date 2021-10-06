package task8;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Animation extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Text text = new Text("Hello world!");
        text.setLayoutY(80);
        text.setLayoutX(80);

        Group group = new Group(text);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Window");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}
