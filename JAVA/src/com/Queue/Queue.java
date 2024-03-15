package com.Queue;

public class Queue {
	private Node head;
	private Node tail;
	private int count;
	
//	Size
	public int size() {
		return count;
	}
//	Is Empty
	public boolean isEmpty() {
		return count == 0;
	}
//	Peek Element
	public Object peek() {
		if(isEmpty()) throw new NullPointerException();
		else return head.ele;
	}
//	Poll Element
	public Object poll() {
		if(isEmpty()) throw new NullPointerException();
		else {
			Object ele = head.ele;
			head = head.next;
			count--;
			return ele;
		}
	}
//	Add Element
	public void add(Object e) {
		if(head == null) {
			head = new Node(e);
			tail = head;
			count++;
			return;
		}
		else {
			tail = new Node(e, tail.next);
			count++;
		}
	}
}
