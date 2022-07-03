package lab_12;

import java.security.SecureRandom;

public class Horse extends Animal {

    public Horse() {
        int randomHorseSpeed = new SecureRandom().nextInt(100);
        flyBehavior = new FlyNoWay();
        System.out.println("randomHorseSpeed = " + randomHorseSpeed);

        this.speed = randomHorseSpeed;
    }

    @Override
    protected String getName() {
        return "Horse";
    }
}
