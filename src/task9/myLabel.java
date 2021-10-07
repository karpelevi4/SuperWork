package task9;

import javafx.scene.control.Label;

public abstract class myLabel {

    protected Label label;
    protected Team firstTeam;
    protected Team secondTeam;

    public myLabel(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {
        this.label = new Label("");
        this.label.setLayoutY(labelPositionY);
        this.label.setLayoutX(labelPositionX);
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }

    public abstract void updateLabelText();
}
