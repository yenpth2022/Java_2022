package lab_09;

import java.util.List;

public class Controller {

    public void getFastestAnimal(List<AnimalWithBuilder> animalList)  {
        int maxSpeed = 0;
        String fastest = "";
        for (AnimalWithBuilder animal : animalList) {
            if (animal.isFlyable() == true) {
                System.out.println(animal.getName() + " has wings so can't join the racing");
            } else {
                // flyable = false =>> Compare speed =>> Find fastest
                if (animal.getSpeed() > maxSpeed) {
                    maxSpeed = animal.getSpeed();
                    fastest = animal.getName();
                }
            }

        }
        System.out.println("The faster animal = " + fastest + " with max speed = " + maxSpeed);
    }
}
