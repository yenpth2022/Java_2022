package lab_09;

import java.util.ArrayList;

public class TestBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();

        AnimalWithBuilder dog = builder.setName("Dog").setFlyable(false).build();
        System.out.println(dog);

        AnimalWithBuilder tiger = builder.setName("Tiger").setFlyable(false).build();
        System.out.println(tiger);

        AnimalWithBuilder horse = builder.setName("Horse").setFlyable(false).build();
        System.out.println(horse);

        AnimalWithBuilder falcon = builder.setName("Falcon").setFlyable(true).build();
        System.out.println(falcon);

        ArrayList<AnimalWithBuilder> animalList = new ArrayList<AnimalWithBuilder>();
        animalList.add(dog);
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(falcon);
        // System.out.println(animalList);
        // check flyable
        int maxSpeed = 0;
        String fastest = "";
        for (AnimalWithBuilder animal : animalList) {
            if (animal.isFlyable() == true) {

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
