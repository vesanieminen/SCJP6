package com.vesanieminen.scjp6;

public class Interfaces {

	public static void main(String[] args) {
		MyInterface object = new MyClass();
		System.out.println(object.printMyValue());
	}

}

interface MyInterface {
	double myValue = 9.81;
	double printMyValue();
}

abstract class MyAbstractClass implements MyInterface {
	public double printMyValue() {
		return myValue;
	}
}

class MyClass extends MyAbstractClass {
	
	@Override
	public double printMyValue() {
		return myValue * myValue;
	}	
}
