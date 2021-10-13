package task9;

public class Result extends MyLabel {

    public Result(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {

        super(firstTeam, secondTeam, labelPositionX, labelPositionY);
        this.label.setText("Result: 0 X 0");
    }

    @Override
    public void updateLabelText() {

        this.label.setText("Result: " + this.firstTeam.getPoints() + " X " + this.secondTeam.getPoints());
    }
}
