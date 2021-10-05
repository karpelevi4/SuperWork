package task5.dog;

public abstract class Dog {

    private String name;
    private boolean happy;

    public Dog(String name, boolean happy) {
        this.happy = happy;
        this.name = name;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return happy;
    }

    public abstract void specialFeature();
}
