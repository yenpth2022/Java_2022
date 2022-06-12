package lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal {

    int randomHorseSpeed = new SecureRandom().nextInt(75);
    public Horse(){
        this.setName("Horse");
        this.setSpeed(randomHorseSpeed);
    }
}
