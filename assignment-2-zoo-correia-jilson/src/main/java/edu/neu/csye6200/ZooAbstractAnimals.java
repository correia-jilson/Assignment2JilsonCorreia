package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
	
	public void animalPrint() {
	    List<AbstractAnimalAPI> list = new ArrayList<AbstractAnimalAPI>();
	    list.add(new LionY());
	    list.add(new TigerY());
	    list.add(new HorseY());

	    for (AbstractAnimalAPI animal : list) {
	        System.out.println(animal);
	        animal.makeSound();
	    }
	  }

}
