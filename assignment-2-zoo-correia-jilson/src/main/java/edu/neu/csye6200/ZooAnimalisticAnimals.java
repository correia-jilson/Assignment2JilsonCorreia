package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;

public class ZooAnimalisticAnimals {
	
	public void animalPrint() {
        List<AnimalisticAPI> list = new ArrayList<AnimalisticAPI>();
        list.add(new LionZ());
        list.add(new TigerZ());
        list.add(new HorseZ());

        for (AnimalisticAPI animal : list) {
            System.out.println(animal);
            animal.makeSound();
        }
    }

}
