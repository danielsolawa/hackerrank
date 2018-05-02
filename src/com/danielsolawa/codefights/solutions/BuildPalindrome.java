package com.danielsolawa.codefights.solutions;

public class BuildPalindrome {

	
	 String buildPalindrome(String st) {
		String reversed = new StringBuilder(st).reverse().toString();
		
		String result = st;
		int i = 1;
		while(!isPalindrome(result)) {
			result = st +  reversed.substring(reversed.length() - i, reversed.length());
			i++;
		}

		return result;
	}
	
	
	 boolean isPalindrome(String str) {
	    return str.equals(new StringBuilder(str).reverse().toString());
	}
	
}
