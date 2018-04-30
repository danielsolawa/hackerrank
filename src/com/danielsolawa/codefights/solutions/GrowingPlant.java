package com.danielsolawa.codefights.solutions;

public class GrowingPlant {

	 int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int current = 0;
		int days = 0;
		while(current <  desiredHeight) {
			days++;
			current += upSpeed;
			if(current >= desiredHeight)
				break;
			current -= downSpeed;
			
		}
		
		
	    return days;
	}
}
