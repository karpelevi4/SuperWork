package task3.human;

public class Head {

    boolean hatOn;
    int hairLength;

    public Head(int hairLength, boolean hatOn) {
        this.hatOn = hatOn;
        this.hairLength = hairLength;
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public boolean hasHatOn() {
        return hatOn;
    }

    public void putHatOn() {
        this.hatOn = true;
    }

    public void putHatOff() {
        this.hatOn = false;
    }
}
