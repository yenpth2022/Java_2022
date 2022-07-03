package lab_12;

public class Animal {

    protected FlyBehavior flyBehavior;
    protected int speed;

    protected boolean performFly(){
        return flyBehavior.fly();
    }

    protected String getName() {
        return null;
    }

    protected int speed() {
        return speed;
    }
}
