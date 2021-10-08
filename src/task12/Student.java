package task12;

import java.util.Random;

public class Student {

    private int iDNumber;
    private int gPA;

    public Student() {
        Random r = new Random();
        this.iDNumber = r.nextInt(100);
        this.gPA = r.nextInt(100);
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }
}
