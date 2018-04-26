package com.danielsolawa.codefights.solutions;

public class ArrayMaximalAdjacentDifference {

	int arrayMaximalAdjacentDifference(int[] inputArray) {
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i < inputArray.length; i++) {
			max = Math.max(max, Math.abs(inputArray[i - 1] - inputArray[i]));
		}
		
		return max;
	}
	
}
