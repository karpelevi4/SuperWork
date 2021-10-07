package task9;

import javafx.scene.control.Label;

public class Result extends myLabel {

    private Team firstTeam;
    private Team secondTeam;
    private int labelPositionX;
    private int labelPositionY;
    private Label label;

    public Result(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {

        super(labelPositionX, labelPositionY);
        this.label.setText("Result: " + firstTeam.getPoints() + " X " + secondTeam.getPoints());
    }

    public void updateLabelText() {
        this.label.setText("Result: " + firstTeam.getPoints() + " X " + secondTeam.getPoints());
    }
}
