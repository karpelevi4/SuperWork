package task9;

public class Winner extends MyLabel {

    public Winner(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {

        super(firstTeam, secondTeam, labelPositionX, labelPositionY);
        this.label.setText("Winner: DRAW");
    }

    public String findWinner() {

        if (this.firstTeam.getPoints() > this.secondTeam.getPoints())
            return this.firstTeam.getName();

        if (this.firstTeam.getPoints() == this.secondTeam.getPoints())
            return "DRAW";

        return this.secondTeam.getName();
    }

    @Override
    public void updateLabelText() {

        this.label.setText("Winner: " + this.findWinner());
    }
}
