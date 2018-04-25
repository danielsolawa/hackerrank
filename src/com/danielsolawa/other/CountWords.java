package com.danielsolawa.other;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {

	
	public static void main(String[] args) {
		String s = "fdgfdg g fg fg fg fg gfgf gfg . fgfdgfdgfdgfd erre rere r!  ?fdsfds fdsf dsfsd dsfsd  dsfsd  dsfsd  dsfsd  dfdf?";
		System.out.println(countWords(s));
		
	}
	
	
	static int countWords(String s) {
		String[] senteces = s.split("\\?|\\!|\\.");
		Pattern p = Pattern.compile("[a-zA-Z]{2,}");
		int max = Integer.MIN_VALUE;
		
		for(String s1 : senteces) {
			Matcher m = p.matcher(s1);
			int count = 0;
			while(m.find()){
				count++;
			}
			max = Math.max(max, count);
		}
		
		return max;
	}
}
