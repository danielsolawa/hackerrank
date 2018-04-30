package com.danielsolawa.codefights.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class ArrayMaxConsecutiveSum {

	

	int arrayMaxConsecutiveSum(int[] inputArray, int k) {
		Deque<Integer> deq = new LinkedList<>();
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int n : inputArray) {
			count += n;
			deq.add(n);
			if(deq.size() == k) {
				max = Math.max(max, count);
				int removed = deq.removeFirst();
				count -= removed;
			}
		}
		
		return max;
	}
}
