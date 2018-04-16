package com.danielsolawa.datastructures;

public class EmptyTree <T extends Comparable> implements Tree<T>{

	@Override
	public boolean isEmpty() {
	
		return true;
	}

	@Override
	public int cardinality() {
		
		return 0;
	}

	@Override
	public boolean isMember(T t) {
		
		return false;
	}

	@Override
	public NonEmptyTree<T> add(T t) {
		
		return new NonEmptyTree<T>(t);
	}

}
