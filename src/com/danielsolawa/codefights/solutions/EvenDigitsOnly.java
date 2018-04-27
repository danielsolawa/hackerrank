package com.danielsolawa.codefights.solutions;

public class EvenDigitsOnly {

	boolean evenDigitsOnly(int n) {
		String s = String.valueOf(n);
		
		for (int i = 0; i < s.length(); i++) {
			int digit = s.charAt(i) - '0';
			if(!(digit % 2 == 0))
				return false;
		}
		
		
		return true;
	}

	
}
