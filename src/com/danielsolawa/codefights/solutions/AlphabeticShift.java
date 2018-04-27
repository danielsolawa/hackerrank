package com.danielsolawa.codefights.solutions;

public class AlphabeticShift {

	String alphabeticShift(String inputString) {
		String shifted = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			char currentLetter = inputString.charAt(i);
			if(currentLetter == 'z') {
				currentLetter = 'a';
			}else {
				currentLetter = (char) (currentLetter + 1);
			}
			
			shifted += currentLetter;
			
		}
		
		return shifted;
	}
}
