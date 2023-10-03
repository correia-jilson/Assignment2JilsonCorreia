package edu.neu.csye6200;

/**
 * 
 * @author Ruchika Sharma
 * Assignment 2 Jilson Correia
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		System.out.println("Using Concrete Class -");  //displaying using ZooAnimals concrete classes X
    	ZooAnimals zooAnimal = new ZooAnimals();
    	zooAnimal.animalPrint();
		System.out.println();

		System.out.println("Using Abstract Class -");  //displaying using ZooAbstractAnimals Abstract classes Y
    	ZooAbstractAnimals zooAbstractAnimal = new ZooAbstractAnimals();
    	zooAbstractAnimal.animalPrint();
		System.out.println();

		System.out.println("Using Interface -");  //displaying ZooAnimalisticAnimals derived from AnimalisticAPI   Interface Z
		ZooAnimalisticAnimals zooAnimalisticAnimal = new ZooAnimalisticAnimals();
		zooAnimalisticAnimal.animalPrint();
		System.out.println();

		System.out.println("Using Object Class -");  //displaying using object class ZooObjectAnimal  X+Y+Z
		ZooObjectAnimals zooObjectAnimal = new ZooObjectAnimals();
		zooObjectAnimal.animalPrint();
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
