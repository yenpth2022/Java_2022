package lab_09;

import java.util.ArrayList;

import static java.util.Arrays.asList;

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

        new Controller().getFastestAnimal(asList(dog, tiger, horse, falcon));
    }
}