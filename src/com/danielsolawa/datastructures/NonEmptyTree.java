package com.danielsolawa.datastructures;

public class NonEmptyTree<T extends Comparable> implements Tree<T> {
	
	T data;
	Tree<T> left;
	Tree<T> right;
	
	public NonEmptyTree(T data) {
		this.data = data;
		left = new EmptyTree<>();
		right = new EmptyTree<>();
	}
	
	public NonEmptyTree(T data, Tree<T> left, Tree<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isEmpty() {
	
		return false;
	}

	@Override
	public int cardinality() {
		
		return 1 + left.cardinality() + right.cardinality();
	}

	@Override
	public boolean isMember(T t) {
		if(t.equals(data)) {
			return true;
		}else {
			if(t.compareTo(data) < 0) {
				return left.isMember(t);
			}else {
				return right.isMember(t);
			}
		}

	}

	@Override
	public NonEmptyTree<T> add(T t) {
		if(t.equals(data)) {
			return this;
		}else {
			if(t.compareTo(data) < 0) {
				return new NonEmptyTree<T>(data, left.add(t), right);
			}else {
				return new NonEmptyTree<T>(data, left, right.add(t));
			}
		}
		
	}

}
