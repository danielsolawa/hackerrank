package com.danielsolawa.codefights.solutions;

public class VariableName {

	boolean variableName(String name) {
		if(Character.isDigit(name.charAt(0)))
			return false;
	
		if(name.matches("[a-zA-Z0-9\\_]{1,}"))
			return true;
		
		return false;
	}
	
}
