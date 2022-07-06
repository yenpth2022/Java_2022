package lab_09;

import java.security.SecureRandom;
import java.util.ArrayList;

import static java.util.Arrays.asList;

public class TestBuilder {

    public static void main(String[] args) {
        AnimalWithBuilder.Builder builder = new AnimalWithBuilder.Builder();

        AnimalWithBuilder dog = builder.setName("Dog").
                setSpeed((new SecureRandom().nextInt(50))).
                setFlyable(false).build();
        System.out.println(dog);

        AnimalWithBuilder tiger = builder.setName("Tiger").
                setSpeed((new SecureRandom().nextInt(100))).
                setFlyable(false).build();
        System.out.println(tiger);

        AnimalWithBuilder horse = builder.setName("Horse").
                setSpeed((new SecureRandom().nextInt(75))).
                setFlyable(false).build();
        System.out.println(horse);

        AnimalWithBuilder falcon = builder.setName("Falcon").
                setSpeed((new SecureRandom().nextInt(120))).
                setFlyable(true).build();
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