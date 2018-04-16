package com.danielsolawa.datastructures;

public interface Tree <T extends Comparable>{
	
	boolean isEmpty();
	int cardinality();
	boolean isMember(T t);
	NonEmptyTree<T> add (T t);
}
