package task5.dog;

public class Husky extends Dog{

    int strength;

    public Husky(String name, boolean happy, int strength) {
        super(name, happy);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void specialFeature() {
        System.out.println("Huskies are strong. "
                + this.getName() + " has "
                + this.getStrength() + " strength points."
        );
    }
}
