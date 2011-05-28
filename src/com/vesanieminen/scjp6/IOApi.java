package com.vesanieminen.scjp6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class IOApi {

	public static void main(String[] args) {
		serializationTest();
	}
	
	static void serializationTest() {
		Dog dog = new Dog(30, "Spot");
		System.out.println("The dog before serialization: " + dog.name + " - " + dog.weight);
		try {
			FileOutputStream fs = new FileOutputStream("dog.db");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(dog);
			os.flush();
			os.close();
			
			FileInputStream fis = new FileInputStream("dog.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dog = (Dog)ois.readObject();
			ois.close();
		}
		catch (Exception e) { }
		System.out.println("The dog after serialization: " + dog.name + " - " + dog.weight);
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



