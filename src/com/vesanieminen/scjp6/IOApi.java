package com.vesanieminen.scjp6;

import java.io.Serializable;

public class IOApi {

	public static void main(String[] args) {
		serializationTest();
	}
	
	static void serializationTest() {
		Dog dog = new Dog(30, "Spot");
		System.out.println("The dog before serialization: " + dog.name + " - " + dog.weight);
		// TODO: serialization and deserialization
	}

}

class Animal {
	
	private static final double defaultWeight = 50;
	
	double weight = defaultWeight;
	
}

class Dog extends Animal implements Serializable {
	
	String name;
	
	public Dog(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
}



