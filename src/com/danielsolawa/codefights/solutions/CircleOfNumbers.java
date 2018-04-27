package com.danielsolawa.codefights.solutions;

public class CircleOfNumbers {

	
	int circleOfNumbers(int n, int firstNumber) {
		int halfElement = n/2;
		
		if(firstNumber + halfElement > n)
			return firstNumber - halfElement; 
		else if(firstNumber + halfElement < n)
			return firstNumber + halfElement;
		else
			return 0;

	
	}
	
}
