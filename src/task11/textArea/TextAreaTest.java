package task11.textArea;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TextAreaTest extends Application {

	public static void main(String[] args) {

		launch(args);
	}

	public void addMenuToBar(MenuBar menuBar, String menuName, String firstChoice, String secondChoice, String thirdChoice) {
		Menu menu = new Menu(menuName);
		MenuItem firstItem = new MenuItem(firstChoice);
		MenuItem secondItem = new MenuItem(secondChoice);
		MenuItem thirdItem = new MenuItem(thirdChoice);
		menu.getItems().addAll(firstItem, secondItem, thirdItem);
		menuBar.getMenus().add(menu);
	}

	@Override
	public void start(Stage stage) {

		MenuBar menuBar = new MenuBar();
		addMenuToBar(menuBar, "Цвет", "Красный", "Синий", "Чёрный");
		addMenuToBar(menuBar, "Шрифт", "Verdana", "Helvetica", "Impact");

		BorderPane top = new BorderPane();
		top.setTop(menuBar);
		
		

		Group root = new Group(top);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Text area");
		stage.setWidth(800);
		stage.setHeight(800);
		stage.show();
	}
}
