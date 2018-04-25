package com.danielsolawa.datastructures.stack;

public class ArrayStack <T> implements Stack<T> {
	
	
	
	private int top;
	private int size;
	private T[] arr;
	
	public ArrayStack() {
		this(10);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int size) {
		this.top = -1;
		this.size = size;
		this.arr = (T[]) new Object[size];
	}
	


	@Override
	public void push(T t) {
		if(top + 1 == size) {
			throw new FullStackException();
		}
		
		arr[++top] = t;
		
	}

	@Override
	public T pop() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		
		
		
		return arr[top--];
	}

	@Override
	public T peek() {
		if(top == -1) {
			throw new EmptyStackException();
		}
		
		
		return arr[top];
	}

	@Override
	public boolean isEmpty() {
		
		return top == -1;
	}



}

class FullStackException extends RuntimeException{
	
}

class EmptyStackException extends RuntimeException{
	
}
