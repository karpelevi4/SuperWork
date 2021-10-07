package task9;

public class LastScorer extends myLabel {

    public LastScorer(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {
        super(firstTeam, secondTeam, labelPositionX, labelPositionY);
        this.label.setText("Last Scorer: N/A");
    }

    @Override
    public void updateLabelText() {
        this.label.setText("Last Scorer: " + this.firstTeam.getName());
    }
}
