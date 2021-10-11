package task8;

//Создайте окно, реализуйте анимацию с
// помощью картинки, состоящей из нескольких кадров.

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Animation extends Application {
    private String picturePath;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Creating an image
        Image image1 = new Image(new FileInputStream("C:/2/frame1.jpg"));
        Image image2 = new Image(new FileInputStream("C:/2/frame2.jpg"));
        Image image3 = new Image(new FileInputStream("C:/2/frame3.jpg"));
        Image image4 = new Image(new FileInputStream("C:/2/frame4.jpg"));

        //Setting the image view
        ImageView imageView = new ImageView(image1);

        //Setting the position of the image
        imageView.setX(20);
        imageView.setY(10);

        //setting the fit height and width of the image view
        imageView.setFitHeight(250);
        imageView.setFitWidth(240);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);


        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.5), e-> imageView.setImage(image2)),
                new KeyFrame(Duration.seconds(1.0), e-> imageView.setImage(image3)),
                new KeyFrame(Duration.seconds(1.5), e-> imageView.setImage(image4)),
                new KeyFrame(Duration.seconds(2.0), e-> imageView.setImage(image1))
        );

        timeline.setCycleCount(20);
        timeline.play();
        timeline.setOnFinished(e -> System.out.println("Do something here"));

        Group group = new Group(imageView);

        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("Picture");
        stage.setWidth(300);
        stage.setHeight(300);
        stage.setResizable(false);
        stage.show();
    }
}