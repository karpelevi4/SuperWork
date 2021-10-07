package task9;

public class LastScorer extends myLabel {

    private String lastScorer;

    public LastScorer(Team firstTeam, Team secondTeam, int labelPositionX, int labelPositionY) {
        super(firstTeam, secondTeam, labelPositionX, labelPositionY);
        this.label.setText("Last Scorer: N/A");
    }

    public void setLastScorer(Team team) {
        this.lastScorer = team.getName();
    }

    @Override
    public void updateLabelText() {
        this.label.setText("Last Scorer: " + this.lastScorer);
    }
}
