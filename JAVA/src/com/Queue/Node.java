package com.Queue;

public class Node {
	Object ele;
	Node next;
	
	public Node(Object e) {
		ele = e;
	}
	public Node(Object e, Node n) {
		ele = e;
		next = n;
	}
}
