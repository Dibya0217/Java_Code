package com.TreeSet;

class Node {
	int ele;
	Node left;
	Node right;
	
	public Node(int e) {
		ele = e;
	}
	public Node(int e, Node l, Node r) {
		ele = e;
		left = l;
		right = r;
	}
}