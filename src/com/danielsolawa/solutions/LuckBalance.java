package com.danielsolawa.solutions;

import java.util.ArrayList;
import java.util.List;

public class LuckBalance {
	

	static int luckBalance(int n, int k, int[][] contests) {
		List<Integer> list = new ArrayList<>();
		int luckAmount = 0;
		
		
		for(int i = 0; i < n; i++) {
			if(contests[i][1] == 1) 
				list.add(contests[i][0]);	
			else 
				luckAmount += contests[i][0];
	
		}
		
		list.sort((n1, n2) -> n1 - n2);
		

		for(int i = list.size() -1; i >= 0; i--) {
			
			if(k > 0) {
				luckAmount += list.get(i);
			}else {
				luckAmount -= list.get(i);
			}
				
			k--;
		}
 
		
		return luckAmount;
    }

}
