package com.cpg.lab6.Exercise;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale=Locale.getDefault();
		int amount=10000;
		Currency c=Currency.getInstance(locale);
		System.out.println("using currency cde: "+amount+" "+c.getCurrencyCode());
		System.out.println("using currency symbol: "+amount+" "+c.getSymbol());
		System.out.println("using currency name: "+amount+" "+c.getDisplayName());
	}
}
