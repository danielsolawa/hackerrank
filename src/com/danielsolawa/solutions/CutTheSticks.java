package com.danielsolawa.solutions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

	static void cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= 0) {
				continue;
			}
			int stick = arr[i];
			int sticksCut = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] <= 0) {
					continue;
				}
				arr[j] = arr[j] - stick;
				sticksCut++;
				
			}
			System.out.println(sticksCut);
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        
        cutTheSticks(arr);
     

        in.close();
    }
}
