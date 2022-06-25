package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal {

    private String name = "Horse";
    private int randomHorseSpeed = new SecureRandom().nextInt(75);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return randomHorseSpeed;
    }
}
