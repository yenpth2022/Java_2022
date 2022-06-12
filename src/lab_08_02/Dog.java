package lab_08_02;

import java.security.SecureRandom;

public class Dog extends Animal {

    int dogRandomSpeed = new SecureRandom().nextInt(50);
    public Dog(){
        this.setName("Dog");
        this.setSpeed(dogRandomSpeed);
    }
}
