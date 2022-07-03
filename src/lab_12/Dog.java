package lab_12;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
        int randomDogSpeed = new SecureRandom().nextInt(50);
        flyBehavior = new FlyNoWay();
        System.out.println("randomDogSpeed = " + randomDogSpeed);

        this.speed = randomDogSpeed;
        this.flyBehavior = flyBehavior;
    }

    @Override
    protected String getName() {
        return "Dog";
    }
}
