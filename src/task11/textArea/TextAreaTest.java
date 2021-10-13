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
	private TextArea textArea;

	public static void main(String[] args) {

		launch(args);
	}
	
	public void setTextArea() {
		textArea = new TextArea("Lorem ipsum dolor sit amet, consectetur adipiscing " +
		 "elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
		 "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
		 "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
		 "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui " +
		 "officia deserunt mollit anim id est laborum.");
		textArea.setFont(Font.font("Verdana", 20));
		textArea.setPrefWidth(600);
		textArea.setPrefHeight(600);
		textArea.setWrapText(true);
		textArea.setLayoutY(50);
	}
	
	@Override
	public void start(Stage stage) {

		MyMenu colorMenu = new MyMenu("Color", "red", "blue", "black");
		MyMenu fontMenu = new MyMenu("Font", "Verdana", "Impact", "Comic Sans MS");

		menuBar = new MenuBar();
		menuBar.getMenus().addAll(colorMenu.getMenu(), fontMenu.getMenu());
		BorderPane top = new BorderPane();
		top.setTop(menuBar);
		
		setTextArea();
		
		colorMenu.changeColor(textArea);
		fontMenu.changeFont(textArea);
		
		Group root = new Group(top, textArea);
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Text area");
		stage.setResizable(false);
		stage.show();
	}
}
