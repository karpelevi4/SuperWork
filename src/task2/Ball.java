package task2;

public class Ball {

    private String owner;
    private String kind;
    private int weight;
    private boolean play;

    public Ball() {
        this.owner = "Unknown";
        this.kind = "normal";
        this.weight = 400;
        this.play = false;
    }

    public Ball(String owner, String kind, int weight, boolean play) {
        this.owner = owner;
        this. kind = kind;
        this.weight = weight;
        this.play = play;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBeeingPlayedwith() {
        return play;
    }

    public void play(boolean play) {

        System.out.println((this.play ? "Somebody else already plays with the ball":
                "You started playing with the ball."));
        this.play = true;
    }

    public void stopPlaying() {
        this.play = false;
    }
}
