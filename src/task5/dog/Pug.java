package task5.dog;

public class Pug extends Dog{

    int friends;

    public Pug(String name, boolean happy, int friends) {
        super(name, happy);
        this.friends = friends;
    }

    public int getFriends() {
        return friends;
    }

    @Override
    public void specialFeature() {
        System.out.println("Pugs are friendly. "
        + this.getName() + " has "
        + this.getFriends() + " friends."
        );
    }
}
