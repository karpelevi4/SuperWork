package task3.human;
//композиция

public class Human {

    private String name;
    private Hand hand;
    private Head head;
    private Feet feet;

    public Human(String name, Head head, Hand hand, Feet feet) {
        this.name = name;
        this.hand = hand;
        this.feet = feet;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("This human's name is " + this.getName());
        System.out.println("Hair length is " + this.head.getHairLength()
        + " and there is" + (this.head.hasHatOn()?" a ":" no ") + "hat on");
        System.out.println("Number of fingers is " + this.hand.getNumberOfFingers()
        + " and there is" + (this.hand.hasRingOn()?" a ":" no ") + "ring on");
        System.out.println("Feet's size is " + this.feet.getSize()
        + " and they are " + (this.feet.isWarm()?"warm":"cold"));
    }
}
