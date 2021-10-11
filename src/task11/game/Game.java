package task11.game;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Game {
	private Player player;
	private TextField textField;
	private Label label;
	
	public Game(Player player, TextField textField, Label label) {
		this.player = player;
		this.textField = textField;
		this.label = label;
	}
	
	public  void play() {
		//Проверка, есть ли у игрока попытки
		if (player.getNumberOfTries() < 3) {
			
			//Проверка, есть ли что-то в тектовом поле
			if ((textField.getText() != null && !textField.getText().isEmpty())) {
				
				//Проверка, является ли введённая строка числом
				if (textField.getText().matches("[-+]?\\d+")) {
					
					//Проверка, подходит ли число под правила игры
					if ((Integer.parseInt(textField.getText()) >= 0) &&
							(Integer.parseInt(textField.getText()) < 21)) {
						
						player.setPossibleNumber(Integer.parseInt(textField.getText()));
						player.updateNumberOfTries();
						
						//Угадал ли игрок число
						if (player.getNumberToGuess() == player.getPossibleNumber()) {
							
							label.setText("Congratulations! You have won.");
						} else {
							
							label.setText("You guessed wrong number. It has to be " +
									              (player.getNumberToGuess() < player.getPossibleNumber() ?
											              "smaller" : "bigger"));
						}
						
						//Вывод введённого числа и оставшегося числа попыток для удобства игрока
						label.setText(label.getText() +
								              "\nYou submitted number " + player.getPossibleNumber() +
								              "\nNumer of tries left: " + (3 - player.getNumberOfTries()));
					} else {
						label.setText("You can only submit numbers from 0 to 20");
					}
				} else {
					label.setText("You cannot submit something that is not a number");
				}
			} else {
				label.setText("You have not left any number");
			}
		} else {
			label.setText("Game over");
		}
	}
}
