package task9;

import javafx.scene.control.Button;

public class Team {

    private int points;
    private String name;
    private Button button;

    public Team(String name, int buttonPositionX, int buttonPositionY) {
        this.points = 0;
        this.name = name;
        this.button = new Button(name);
        this.button.setLayoutX(buttonPositionX);
        this.button.setLayoutX(buttonPositionY);
        this.button.setFocusTraversable(false);
    }

    public int getPoints() {
        return points;
    }

    public void updatePoints() {
        this.points++;
    }

    public Button getButton() {
        return button;
    }
}
