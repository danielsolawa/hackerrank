package com.danielsolawa.other;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class VacationCodility {
	
	public static void main(String[] args) {
		int[] arr = {7,5,2,7,2,7,4,7};
		long start = System.currentTimeMillis();
		System.out.println(vacation(arr));
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

	
	static int vacation(int[] arr) {
		int min = Integer.MAX_VALUE;
		Set<Integer> distinctNums = new HashSet<>();
		Set<Integer> currentNums = new HashSet<>();
		Deque<Integer> subArray = new LinkedList<>();
		
		for(int num : arr) {
			distinctNums.add(num);
		}
		
		
		int j = 0;
		
		while(j < arr.length) {
			if(currentNums.size() == distinctNums.size()) {
				min = Math.min(min, subArray.size());
				if(min == distinctNums.size())
					break;
				
				int removed = subArray.poll();
				if(!subArray.contains(removed)) {
					currentNums.remove(removed);
				}
			}else {
				int currentElement = arr[j];
				currentNums.add(currentElement);
				subArray.add(currentElement);
				j++;
			}
			
			
		}
		
		
		
		
		
		return min;
	}
}
