package com.vesanieminen.scjp6;

public class Polymorphism {

	public static void main(String[] args) {
		BaseClass baseClass = new SubClass();
		baseClass.print();
		
		RootClass rootClass = new SubClass();
		rootClass.print();
		
		rootClass = new BaseClass();
		rootClass.print();
	}

}

class RootClass {

	public void print() {
		System.out.print("RootClass.print() ");
	}
	
}

class BaseClass extends RootClass {
	
	@Override
	public void print() {
		super.print();
		System.out.println("BaseClass.print()");
	}
	
}

class SubClass extends BaseClass {
	
	@Override
	public void print() {
		System.out.println("SubClass.print()");
	}
	
}
