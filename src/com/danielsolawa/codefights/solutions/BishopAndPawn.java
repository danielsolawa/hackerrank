package com.danielsolawa.codefights.solutions;

public class BishopAndPawn {

	

	boolean bishopAndPawn(String bishop, String pawn) {
		char firstLetter = bishop.charAt(0);
		char firstNumber = bishop.charAt(1);
		char secondLetter = pawn.charAt(0);
		char secondNumber = pawn.charAt(1);
		
		int letterDifference = Math.abs( firstLetter - secondLetter);
		int numberDifference = Math.abs( firstNumber - secondNumber);

		if(firstLetter == secondLetter && firstNumber != secondNumber)
			return false;
		else if(firstNumber == secondNumber && firstLetter != secondLetter)
			return false;
		else if(letterDifference % 2 == 0 && !(numberDifference % 2 == 0))
			return false;
		else if(!(letterDifference % 2 == 0) && numberDifference % 2 == 0)
			return false;
		
		
		return true;
	}
}
