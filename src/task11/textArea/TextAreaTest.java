package task11.textArea;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TextAreaTest extends Application {
    
    private MenuBar menuBar;

	public static void main(String[] args) {

		launch(args);
	}

	public void addMenuToBar(String menuName, String firstChoice, String secondChoice, String thirdChoice) {
		Menu menu = new Menu(menuName);
		MenuItem firstItem = new MenuItem(firstChoice);
		MenuItem secondItem = new MenuItem(secondChoice);
		MenuItem thirdItem = new MenuItem(thirdChoice);
		menu.getItems().addAll(firstItem, secondItem, thirdItem);
		menuBar.getMenus().add(menu);
	}

	@Override
	public void start(Stage stage) {
	    
        menuBar = new MenuBar();
		addMenuToBar("Цвет", "Красный", "Синий", "Чёрный");
		addMenuToBar("Шрифт", "Verdana", "Helvetica", "Impact");

		BorderPane top = new BorderPane();
		top.setTop(menuBar);
		
		TextArea textArea = new TextArea();
		textArea.setPrefWidth(600);
		textArea.setPrefHeight(600);
		textArea.setLayoutY(50);
		
		textArea.setFont(Font.font("Impact", 20));
		textArea.setStyle("-fx-text-fill: red ;");

		Group root = new Group(top, textArea);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Text area");
		stage.show();
	}
}
