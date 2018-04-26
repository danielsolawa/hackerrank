package com.danielsolawa.codefights.solutions;

public class IPv4Address {
	
	static boolean isIPv4Address(String inputString) {
		String[] numbers = inputString.split("\\.");
	
		if(numbers.length != 4)
			return false;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i].length() == 0) 
				return false;
			
			try {
				int n = Integer.parseInt(numbers[i]);

				if(n < 0 || n > 255)
					return false;
			}catch(NumberFormatException e) {
				return false;
			}
		}
		
		return true;
	}
}
