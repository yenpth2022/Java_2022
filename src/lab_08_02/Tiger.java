package lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {

    public Tiger() {
        this.setName("Tiger");
        int tigerRandomSpeed = new SecureRandom().nextInt(100);
        this.setSpeed(tigerRandomSpeed);
    }
}
