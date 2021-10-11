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

	@Override
	public void start(Stage stage) {
	    
        menuBar = new MenuBar();
		Menu colorMenu = new Menu("Цвет");
		MenuItem colorRed = new MenuItem("Красный");
		MenuItem colorBlue = new MenuItem("Синий");
		MenuItem colorBlack = new MenuItem("Чёрный");
		colorMenu.getItems().addAll(colorRed, colorBlue, colorBlack);
		menuBar.getMenus().add(colorMenu);
		
		Menu fontMenu = new Menu("Шрифт");
		MenuItem fontVerdana = new MenuItem("Verdana");
		MenuItem fontImpact = new MenuItem("Impact");
		MenuItem fontComicSans = new MenuItem("Comic Sans MS");
		fontMenu.getItems().addAll(fontVerdana, fontImpact, fontComicSans);
		menuBar.getMenus().add(fontMenu);

		BorderPane top = new BorderPane();
		top.setTop(menuBar);
		
		TextArea textArea = new TextArea("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		textArea.setPrefWidth(600);
		textArea.setPrefHeight(600);
		textArea.setWrapText(true);
		textArea.setLayoutY(50);
		
		colorBlue.setOnAction(e -> textArea.setStyle("-fx-text-fill: blue ;"));
		colorRed.setOnAction(e -> textArea.setStyle("-fx-text-fill: red ;"));
		colorBlack.setOnAction(e -> textArea.setStyle("-fx-text-fill: black ;"));

		fontImpact.setOnAction(e -> textArea.setFont(Font.font("Impact", 20)));
		fontVerdana.setOnAction(e -> textArea.setFont(Font.font("Verdana", 20)));
		fontComicSans.setOnAction(e -> textArea.setFont(Font.font("Comic Sans MS", 20)));
		
		Group root = new Group(top, textArea);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Text area");
		stage.show();
	}
}
