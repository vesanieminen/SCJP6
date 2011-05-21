package com.vesanieminen.scjp6;

public class ClassTypes {

	public static void main(String[] args) {
		new NormalClass().print();
	}

}

class NormalClass {

	class InnerClass {
		void print() {
			System.out.println("in inner class");
		}
	}

	void print() {
		System.out.println("in normal class");

		new InnerClass().print();

		class LocalClass {
			void print() {
				System.out.println("in local class");
			}
		}
		new LocalClass().print();

		new NormalClass() {
			@Override
			void print() {
				System.out.println("in anonymous class");
			}
		}.print();
	}
}


