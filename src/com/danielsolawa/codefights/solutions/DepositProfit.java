package com.danielsolawa.codefights.solutions;

public class DepositProfit {

	
	int depositProfit(double deposit, double rate, double threshold) {

		if(deposit >= threshold)
			return 0;
		
		return 1 + depositProfit(deposit += (deposit * (rate/100)), rate, threshold);
		
	}
}
