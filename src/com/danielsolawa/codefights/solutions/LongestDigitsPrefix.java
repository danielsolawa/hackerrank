package com.danielsolawa.codefights.solutions;

public class LongestDigitsPrefix {

	
	String longestDigitsPrefix(String inputString) {
		String prefix = "";
		
		for (int i = 0; i < inputString.length(); i++) {
			char currentCharacter = inputString.charAt(i);
			if(Character.isDigit(currentCharacter))
				prefix += currentCharacter;
			else 
				break;
	
		}
		
		return prefix;
	}
}
