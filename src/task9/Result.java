package task9;

import javafx.scene.control.Label;

public class Result extends myLabel {

    private Team firstTeam;
    private Team secondTeam;

    public Result(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {

        super(labelPositionX, labelPositionY);
        this.getLabel().setText("Result: " + firstTeam.getPoints() + " X " + secondTeam.getPoints());
    }

    public void updateLabelText() {
        this.getLabel().setText("Result: " + firstTeam.getPoints() + " X " + secondTeam.getPoints());
    }
}
