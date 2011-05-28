package com.vesanieminen.scjp6;

public class StringSplittingAndFormatting {

	public static void main(String[] args) {
		String s1 = "Hello, how are you doing this fine morning?";
		String s2 = "you";
		String[] splitted = s1.split(s2);
		printStringArray(splitted);

		splitted = s1.split("\\s");
		printStringArray(splitted);
		
		Object[] array = {"123.123", 456.456, 789};
		System.out.printf("%3$d + %1$s + %2$.2f", array);
	}

	private static void printStringArray(String[] splitted) {
		for (String s : splitted) {
			System.out.println("|" + s + "|");
		}
	}

}
