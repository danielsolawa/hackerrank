package com.danielsolawa.codefights.solutions;

public class ChessBoardCellColor {

	boolean chessBoardCellColor(String cell1, String cell2) {
		int firstLetter = (int) cell1.charAt(0) - 64;
		int firstDigit = cell1.charAt(1);
		int secondLetter = (int) cell2.charAt(0) - 64;
		int secondDigit =  cell2.charAt(1);
		

		
		return determineColor(firstLetter, firstDigit) == determineColor(secondLetter, secondDigit);
	}
	
	
	int determineColor(int letter, int digit) {
		if(isEven(letter) && isEven(digit))
			return 1;
		else if(!isEven(letter) && !isEven(digit))
			return 1;
		
		return 0;
	}


	boolean isEven(int n) {
		return n % 2 == 0;
	}
	
	
}
