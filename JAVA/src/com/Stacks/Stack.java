package com.Stacks;

public class Stack {
	private Node first;
	private int count;
//	Size
	public int size() {
		return count;
	}
//	Check Is Empty or Not
	public boolean isEmpty() {
		return count == 0;
	}
//	Peek Element
	public Object peek() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		return first.ele;
	}
//	Push Element
	public void push(Object e) {
		if(first == null) {
			first = new Node(e);
			count++;
			return;
		}
		else {
			first = new Node(e, first);
			count++;
		}
	}
//	Pop Element
	public Object pop() {
		if(isEmpty()) {
			throw new NullPointerException();
		}
		Object ele = first.ele;
		first = first.next;
		count--;
		return ele;
	}
}
