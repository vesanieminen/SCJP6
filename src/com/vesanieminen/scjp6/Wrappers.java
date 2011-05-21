package com.vesanieminen.scjp6;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {

	public static void main(String[] args) {
		Integer integer = new Integer("11");
		int i = Integer.parseInt("100", 2);
		Float floatValue = new Float("11.1f");
		
		List list = new ArrayList();
		list.add(100);
		
		method(new Integer(0));
	}
	
	static void method(long l) {
		System.out.println("long");
	}
	
	static void method(Integer i) {
		System.out.println("long");
	}

}
