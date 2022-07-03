package lab_12;

import java.security.SecureRandom;

public class Falcon extends Animal {

    public Falcon() {
        int randomFalconSpeed = new SecureRandom().nextInt(100);
        flyBehavior = new FlyWithWings();
        System.out.println("randomFalconSpeed = " + randomFalconSpeed);

        this.speed = randomFalconSpeed;
    }

    @Override
    protected String getName() {
        return "Falcon";
    }
}
