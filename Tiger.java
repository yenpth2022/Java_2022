package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal {

    private String name = "Tiger";

    private int tigerRandomSpeed = new SecureRandom().nextInt(100);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return tigerRandomSpeed;
    }
}
