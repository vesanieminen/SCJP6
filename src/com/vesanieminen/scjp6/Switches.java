package com.vesanieminen.scjp6;

public class Switches {

	public static void main(String[] args) {
		byte b = 0;
		switch(b) {
			default:
				System.out.println("default");
			case 0:
				System.out.println("0");
				break;
			case 127:
				System.out.println("127!");
				break;
			//case 128: // compile error 
			//	break;
		}
	}

}
