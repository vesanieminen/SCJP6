package com.vesanieminen.scjp6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d*0");
		Matcher matcher = pattern.matcher("1000");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
		
		pattern = Pattern.compile("0\\d*0\\d*");
		matcher = pattern.matcher("1000");
		while (matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}		
	}

}
