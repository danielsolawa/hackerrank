package com.danielsolawa.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {
	
	 private static final String REGEX_START = "((?=.*[";
	 private static final String REGEX_END = "]).{1,})";
	 
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String s1 = in.next();
	            String s2 = in.next();
	            String result = twoStrings(s1, s2);
	            System.out.println(result);
	        }
	    }

	 static String twoStrings(String s1, String s2){
		    String regex = REGEX_START + s1 + REGEX_END;
	        Pattern p = Pattern.compile(regex);
	        Matcher m = p.matcher(s2);
	
	        return m.matches() ? "YES" : "NO";
	 }
	 
	 
}
