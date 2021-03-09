package edu.smg;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class GenericStack2<E> extends ArrayList<E>{
//	private java.util.ArrayList <E> list = new java.util.ArrayList<>();
//
//	public GenericStack2() {
//		
//	}
//	
//	public int getSize() {
//		return list.size();
//	}

	public E peek() {
		return get(size() - 1);
	}

	public void push(E o) {
		add(o);
	}

	public E pop() {
		E o = get(size() - 1);
		remove(size() - 1);
		return o;
	}

	public boolean isEmpty() {
		return isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + toString();
	}
}