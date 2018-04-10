package com.danielsolawa.solutions;

public class StringConstruction {

	
	static int stringConstruction(String s) {
	       int result = 0;
	       while(s.length() > 0) {
	    	   s = s.replaceAll(String.valueOf(s.charAt(0)), "");
	    	   result++;
	       }
	       
	       
	       return result;
	    }
}
