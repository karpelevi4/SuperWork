package task8;
//--module-path "C:\javafx-sdk-17.0.0.1\lib" --add-modules javafx.controls,javafx.fxml

//Создайте окно, нарисуйте в нем 20 случайных фигур случайного цвета.
// Классы фигур должны наследоваться от абстрактного класса Shape,
// в котором описаны свойства фигуры: цвет, позиция.

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Figures extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Random figures");
        Group root = new Group();
        Canvas canvas = new Canvas(800, 800);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for(int i=0; i<20; i++) {
            int kindOfFigure = (int)(Math.random()*3);
            if (kindOfFigure == 0) {
                Circle figure = new Circle();
                figure.paint(gc);
            }
            if (kindOfFigure == 1) {
                Square figure = new Square();
                figure.paint(gc);
            }
            if (kindOfFigure == 2) {
                Triangle figure = new Triangle();
                figure.paint(gc);
            }
        }
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}