package lab_08_02;

/**
 * Horse: Max 75 km/h
 * Tiger: Max 100 Km/h
 * Dog: Max 60 KM/h
 *
 * Create an Animal class with a method speed() which return a random speeds
 * Create 3 objects for those 3 animal type
 * Run and see which animal is winner for racing
 *
 * Print result with format: Winner is <Animal name>, with speed: <speed>
 * int randomSpeed = new SecureRandom().nextInt(50);
 */

public class Animal {

    private String name;
    private int speed;

    public Animal() {
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}
