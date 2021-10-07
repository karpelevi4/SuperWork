package task9;

public class Winner extends myLabel{

    public Winner(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {
        super(firstTeam, secondTeam, labelPositionX, labelPositionY);
        this.label.setText("Winner: DRAW");
    }

    @Override
    public void updateLabelText() {
        this.label.setText("Winner: " + this.firstTeam.getName());
    }
}
