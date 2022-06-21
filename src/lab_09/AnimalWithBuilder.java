package lab_09;

import lab_08_02.Animal;

import java.security.SecureRandom;

public class AnimalWithBuilder {
    /**
     * Racing animal with builder design pattern (adding attribute flyable)
     * Eagle, Falcon, Tiger, Snake....
     * Animal tiger = new Animal.Builder().withWings(false).....build();
     * Animal falcon = new Animal.Builder().withWings(true).....build();
     */
    private String name = "dog";
    private int speed = 50;
    private boolean flyable = false;

    protected AnimalWithBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    // Inner Class
    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        // Write Only
        public Builder setName(String name) {
            this.name = name;
            if (name.equals("Dog")) {
                this.speed = new SecureRandom().nextInt(50);
            } else if (name.equals("Tiger")) {
                this.speed = new SecureRandom().nextInt(100);
            } else if (name.equals("Horse")) {
                this.speed = new SecureRandom().nextInt(75);
            } else if (name.equals("Falcon")) {
                this.speed = new SecureRandom().nextInt(120);
            }
            return this;
        }

//        public Builder setSpeed(int speed) {
//            this.speed = speed;
//            return this;
//        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalWithBuilder build() {
            return new AnimalWithBuilder(this);
        }

    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}
