package task8;

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Picture extends Application {
    private String picturePath;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Creating an image
        Image image = new Image(new FileInputStream("C:/2/1.jpg"));
        //Setting the image view
        ImageView imageView = new ImageView(image);

        //Setting the position of the image
        imageView.setX(20);
        imageView.setY(10);

        //setting the fit height and width of the image view
        imageView.setFitHeight(250);
        imageView.setFitWidth(240);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);

        Group group = new Group(imageView);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Picture");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }
}