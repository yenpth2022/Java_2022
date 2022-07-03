package lab_12;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger() {
        int randomTigerSpeed = new SecureRandom().nextInt(75);
        flyBehavior = new FlyNoWay();
        System.out.println("randomTigerSpeed = " + randomTigerSpeed);

        this.speed = randomTigerSpeed;
    }

    @Override
    protected String getName() {
        return "Tiger";
    }
}
