package com.danielsolawa.codefights.solutions;

public class ArrayChange {

	static int arrayChange(int[] inputArray) {
		int result = 0;
		
		for(int i = 1; i < inputArray.length; i++) {
			if(inputArray[i-1] >= inputArray[i]) {
				int difference = Math.abs(inputArray[i - 1] - inputArray[i]) + 1 ;
				inputArray[i] += difference;
				result += difference;
			}
		}
		
		return result;
	}

}
