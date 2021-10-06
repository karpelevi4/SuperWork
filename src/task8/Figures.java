package task8;
//--module-path "C:\javafx-sdk-17.0.0.1\lib" --add-modules javafx.controls,javafx.fxml

//Создайте окно, нарисуйте в нем 20 случайных фигур случайного цвета.
// Классы фигур должны наследоваться от абстрактного класса Shape,
// в котором описаны свойства фигуры: цвет, позиция.

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Figures extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {


        Group group = new Group();

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Window");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}
