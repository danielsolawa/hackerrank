package com.danielsolawa.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2D {

	  static void arrays2d(int[][] arr){
	        int currentSum = 0;
			int maxSum = -100;
			for(int i = 2; i < arr.length; i++) {
				for(int j = 2; j < arr[i].length; j++) {
					currentSum = arr[i][j] + arr[i][j - 1] + arr[i][j- 2] + arr[i-1][j-1] + arr[i-2][j] + arr[i-2][j - 1] + arr[i-2][j- 2];
					if(currentSum >  maxSum) {
						maxSum = currentSum;
					}
				}
			}
			
			System.out.println(maxSum);
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        
	        arrays2d(arr);
	        
	    }
	
	
}
