package com.danielsolawa.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
	
    private static String gameOfThrones(String s){
		 int lettersWithoutPair = 0;
		 int i = 0;
	
		 while(i < s.length()) {
			 String currentLetter = String.valueOf(s.charAt(i));
			 String temp = s.replaceAll(currentLetter, "");
			 
			 int difference = s.length() - temp.length();
			 
			 if(!(difference % 2 == 0)) {
				 lettersWithoutPair++; 
			 }
			 
			 if(lettersWithoutPair > 1) {
				 return "NO";
			 }
			 
			 s = temp;
			 i = 0;
		 	 }
	 

		 	return "YES";
    }

	
	
	static boolean isLetter(char c) {
		String letter = String.valueOf(c);
		String regex = "[a-z]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(letter);
		
		return m.matches();
	}

    
}
