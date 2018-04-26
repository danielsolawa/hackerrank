package com.danielsolawa.codefights.solutions;

import java.util.HashSet;
import java.util.Set;

public class AreEquallyStrong {
	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	    int yourSum = yourLeft + yourRight;
	    int friendsSum = friendsLeft + friendsRight;
		
		Set<Integer> set = new HashSet<>();
	    set.add(yourLeft);
	    set.add(yourRight);
	    set.add(friendsLeft);
	    set.add(friendsRight);
	    
	    return ((set.size() == 2) || (set.size() == 1)) && yourSum == friendsSum;
	}
}
