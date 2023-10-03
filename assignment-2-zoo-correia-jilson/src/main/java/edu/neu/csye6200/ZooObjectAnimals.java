package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooObjectAnimals {
	public void animalPrint() {
        List<Object> list1 = new ArrayList<Object>();
        list1.add(new LionX());
        list1.add(new TigerX());
        list1.add(new HorseX());

        for (Object animal : list1) {
            System.out.println(animal);
            ((AnimalAPI) animal) .makeSound();
        }

        List<Object> list2 = new ArrayList<Object>();
        list2.add(new LionY());
        list2.add(new TigerY());
        list2.add(new HorseY());

        for (Object animal : list2) {
        	System.out.println(animal);
            ((AbstractAnimalAPI) animal).makeSound();
        }

        List<Object> list3 = new ArrayList<Object>();
        list3.add(new LionZ());
        list3.add(new TigerZ());
        list3.add(new HorseZ());

        for (Object animal : list3) {
        	System.out.println(animal);
            ((AnimalisticAPI) animal).makeSound();
        }
    }
}
