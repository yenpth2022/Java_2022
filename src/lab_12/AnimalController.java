package lab_12;

import lab_09.AnimalWithBuilder;

import java.util.List;

public class AnimalController {
    void performFly(Animal animal) {
        animal.performFly();
    }

    // flyable = true =>> Don't race
    // flyable = false =>> add Animal to List => find animal with the fastest speed

    public void getFastestAnimal(List<Animal> animalList) {
        int maxSpeed = 0;
        String fastest = "";
        for (Animal animal : animalList) {
            if (animal.performFly() == true) {
                System.out.println(animal.getName() + " have wings so can't join this race");
            } else {
                // flyable = false =>> Compare speed =>> Find fastest
                if (animal.speed() > maxSpeed) {
                    maxSpeed = animal.speed();
                    fastest = animal.getName();
                }
            }

        }
        System.out.println("The faster animal = " + fastest + " with max speed = " + maxSpeed);
    }
}
