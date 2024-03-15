package com.Stacks;

public class Node {
	Object ele;
	Node next;
	
	public Node(Object e) {
		ele = e;
	}
	public Node(Object e, Node n) {
		next = n;
		ele = e;
	}
}
