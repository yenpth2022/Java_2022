package lab_12;

import java.util.ArrayList;

public class TestAnimal {

    public static void main(String[] args) {

        Falcon falcon = new Falcon();
        new AnimalController().performFly(falcon);
        Tiger tiger = new Tiger();
        new AnimalController().performFly(tiger);
        Dog dog = new Dog();
        new AnimalController().performFly(dog);
        Horse horse = new Horse();
        new AnimalController().performFly(horse);

        ArrayList<Animal> arrayList = new ArrayList<>();
        arrayList.add(falcon);
        arrayList.add(tiger);
        arrayList.add(dog);
        arrayList.add(horse);

        AnimalController animalController = new AnimalController();
        animalController.getFastestAnimal(arrayList);
    }
}
