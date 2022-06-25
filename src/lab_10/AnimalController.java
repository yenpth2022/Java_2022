package lab_10;

import java.util.List;
public class AnimalController {
    public void getFastestAnimal(List<Animal> animalList) {

        int maxSpeed = 0;
        String fastestAnimalName = "horse";

        for (Animal animal : animalList) {
            if (animal.getSpeed() > maxSpeed) {
                maxSpeed = animal.getSpeed();
                fastestAnimalName = animal.getName();
            }
        }
        System.out.println("Winner is " + fastestAnimalName + ", with speed: " + maxSpeed);

    }

}
