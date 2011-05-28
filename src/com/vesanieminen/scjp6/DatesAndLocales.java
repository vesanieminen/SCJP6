package com.vesanieminen.scjp6;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatesAndLocales {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2011, 4, 28);
		calendar.add(Calendar.HOUR_OF_DAY, 12);
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, new Locale("fi", "FI"));
		System.out.println(dateFormat.format( calendar.getTime() ));
		calendar.roll(Calendar.MONTH, 8);
		System.out.println(dateFormat.format( calendar.getTime() ));
		
		//printAvailableLocales();
		
		BigDecimal balance = BigDecimal.valueOf(1500);
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("fi", "FI"));
		System.out.println(numberFormat.format(balance));
	}
	
	private static void printAvailableLocales() {
		Locale[] locales = DateFormat.getAvailableLocales();
		for(Locale locale : locales) {
			System.out.println(locale.getDisplayName());
		}
	}

}
