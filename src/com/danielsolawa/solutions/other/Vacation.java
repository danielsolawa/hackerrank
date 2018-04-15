package com.danielsolawa.solutions.other;

import java.util.HashSet;
import java.util.Set;

public class Vacation {

	
	public static void main(String[] args) {
		int[] arr = {5,2,2,1,1,4,7,5,5,4,2,7,1};
		System.out.println(vacation(arr));
	}
	
	
	static int vacation(int[] myArr) {
		int pathLength = -1;
		int start = 0;
		int temp = 0;
		Set<Integer> distinct = new HashSet<>();
		
		for(int i = 0; i < myArr.length; i++) {
			distinct.add(myArr[i]);
		}
		
				
		while(myArr.length  > start + distinct.size()) {
			
			if(start + distinct.size() < myArr.length) {
				temp = countPathRight(myArr, distinct.size(), start);
				int result = Math.abs(temp - start);
				if(result < pathLength || pathLength == -1) pathLength = result;
				start = temp;
			}

			if(start - distinct.size() >= 0) {
				temp = countPathLeft(myArr, distinct.size(), start);
				int result = Math.abs(temp - start);
				if(result < pathLength) pathLength = result;	
			}

		}
		
		
		return pathLength + 1;
	}

	static int countPathRight(int[] arr, int numOfDistinct, int start) {
		Set<Integer> set = new HashSet<>();
		int index = -1;
		for(int i = start; i < arr.length; i++) {
			set.add(arr[i]);
			if(set.size() == numOfDistinct) {
				index = i;
				break;
			}
		}
		
		return index;
		
	}
	
	static int countPathLeft(int[] arr, int numOfDistinct, int start) {
		Set<Integer> set = new HashSet<>();
		int index = -1;
		for(int i = start; i >= 0 ; i--) {
			set.add(arr[i]);
			if(set.size() == numOfDistinct) {
				index = i;
				break;
			}
		}
		
		return index;
		
	}
}
