package com.danielsolawa.other;

import java.util.*;



public class FindAllSubsets {
	
	
	public static void main(String[] args) {
		FindAllSubsets fas = new FindAllSubsets();
		fas.printAllSubsets(Arrays.asList(1,2,3));
	}

	
	public void printAllSubsets(List<Object> list) {
		int numberOfSubsets = 1 << list.size(); // equal to 2^list.size()
		
		for(int i = 0; i < numberOfSubsets; i++) {
			int mask = 1;
			for(int j = 0; j < list.size(); j++) {
				if((mask & i) > 0)
					System.out.print(list.get(j) + " ");
				mask = mask << 1;
			}
			System.out.println();
		}
	}
}
