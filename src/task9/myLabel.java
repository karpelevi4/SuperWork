package task9;

import javafx.scene.control.Label;

public abstract class myLabel {

    private Label label;
    private int labelPositionX;
    private int labelPositionY;

    public myLabel(int labelPositionX, int labelPositionY) {
        this.label.setLayoutY(labelPositionY);
        this.label.setLayoutX(labelPositionX);
    }

    public abstract void updateLabelText();
}
