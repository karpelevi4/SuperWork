package task3.human;

public class Hand {

    private int numberOfFingers;
    private boolean ringOn;

    public Hand(int numberOfFingers, boolean ringOn) {
        this.numberOfFingers = numberOfFingers;
        this.ringOn = ringOn;
    }

    public int getNumberOfFingers() {
        return numberOfFingers;
    }

    public void setNumberOfFingers(int numberOfFingers) {
        this.numberOfFingers = numberOfFingers;
    }

    public void setRingOn(boolean ringOn) {
        this.ringOn = ringOn;
    }

    public boolean hasRingOn() {
        return ringOn;
    }
}
