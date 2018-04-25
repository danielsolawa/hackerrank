package com.danielsolawa.codefights.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class AreSimilar {

	boolean areSimilar(int[] a, int[] b) {
        Deque<Integer> deq = new LinkedList<>();
		
        for(int num :  a) {
                deq.add(num);
        }
		
        int count = 0;	
        for(int i =0; i < a.length; i++){
            if(deq.contains(b[i])){
                deq.remove(b[i]);
                if(a[i] != b[i])
                	count++;
            }  else 
                   return false;
          
            
            if(count > 2)
                return false;
            
        }

		
        return true;
}

}
