package edu.neu.csye6200;


import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {
	
	public void animalPrint() {
	    List<AnimalAPI> list = new ArrayList<AnimalAPI>();
	    list.add(new LionX());
	    list.add(new TigerX());
	    list.add(new HorseX());

	    for (AnimalAPI animal : list) {
	        System.out.println(animal);
	        animal.makeSound();
	    }
	  }

}
