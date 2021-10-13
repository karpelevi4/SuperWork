package task11.textArea;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

public class MyMenu {
	
	private Menu menu;
	private MenuItem firstItem;
	private MenuItem secondItem;
	private MenuItem thirdItem;
	
	public MyMenu(String menuName, String optionOne, String optionTwo, String optionThree) {
		
		this.menu = new Menu(menuName);
		this.firstItem = new MenuItem(optionOne);
		this.secondItem = new MenuItem(optionTwo);
		this.thirdItem = new MenuItem(optionThree);
		this.menu.getItems().addAll(firstItem, secondItem, thirdItem);
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public void changeColor(TextArea textArea) {
		
		firstItem.setOnAction(e -> textArea.setStyle("-fx-text-fill: red ;"));
		secondItem.setOnAction(e -> textArea.setStyle("-fx-text-fill: blue ;"));
		thirdItem.setOnAction(e -> textArea.setStyle("-fx-text-fill: black ;"));
	}
	
	public void changeFont(TextArea textArea) {
		
		firstItem.setOnAction(e -> textArea.setFont(Font.font("Verdana", 20)));
		secondItem.setOnAction(e -> textArea.setFont(Font.font("Impact", 20)));
		thirdItem.setOnAction(e -> textArea.setFont(Font.font("Comic Sans MS", 20)));
	}
}
