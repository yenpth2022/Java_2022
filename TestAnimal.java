package lab_10;

import java.util.Arrays;

public class TestAnimal {

    public static void main(String[] args) {
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog() {
        };

        System.out.println("The random speed of horse = " + horse.getSpeed());
        System.out.println("The random speed of tiger = " + tiger.getSpeed());
        System.out.println("The random speed of dog = " + dog.getSpeed());

        System.out.println("=====================");

        new AnimalController().getFastestAnimal(Arrays.asList(horse, tiger, dog));
    }
}
