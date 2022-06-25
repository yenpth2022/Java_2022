package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {

    private String name = "Dog";
    private int dogRandomSpeed = new SecureRandom().nextInt(50);
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return dogRandomSpeed;
    }
}
