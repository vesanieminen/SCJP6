package com.vesanieminen.scjp6;

public class PrimitivetypeGotchas {

	public static void main(String[] args) {
		short s1 = 1000;
		short s2 = 2000;
		//short s3 = s1 + s2; // doesn't work because s1 and s2 are promoted to int for the + operator
		s2 += s1 + s2; // += and .= are exceptions to the above
		System.out.println(s2);
		
		int i = 300;
		byte b = (byte)i; // 300 does not fit into int, but type casting takes out the the bits that don't fit
		System.out.println(b);
		
		System.out.println(Float.NaN == Float.NaN); // prints false
		System.out.println(Float.isNaN(Float.NaN)); // prints true
		
		System.out.println(Float.POSITIVE_INFINITY > Float.POSITIVE_INFINITY);
		
		System.out.println(1 + 2 + "3"); // prints 33
		System.out.println("1" + 2 + 3); // prints 123
	}

}
