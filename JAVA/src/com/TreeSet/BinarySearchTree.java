package com.TreeSet;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	private Node root;
	private int count;
	
	/*
//	Add
	public void add(int e) {
		if(root == null) {
			root = new Node(e);
			count++;
			return;
		}
		
		Node curr = root;
		while(curr != null) {
			if (e < curr.ele) {
				curr = curr.left;
			}
			else if (e > curr.ele) {
				curr = curr.right;
			}
			else {
				return;
			}
		}
		curr = new Node(e);
		count++;
	}
	*/
//	Add Using recursion
	private boolean flag = false;
	public boolean add(int e) {
		flag = true;
		root = addNode(root, e);
		return flag;
	}
	private Node addNode(Node n, int e) {
		if(n == null) {
			n = new Node(e);
			return n;
		}
		else if (e < n.ele) {
			n.left = addNode(n.left, e);
		}
		else if (e > n.ele) {
			n.right = addNode(n.right, e);
		}
		else {
			flag = false;
		}
		return n;
	}
	
	public void remove(int e) {
		root = removeNode(root, e);
	}
	private Node removeNode(Node n, int e) {
		if(n == null) {
			return n;
		}
		if(e < n.ele) {
			n.left = removeNode(n.left, e);
		}
		else if(e > n.ele) {
			n.right = removeNode(n.right, e);
		}
		else {
			if(n.left == null & n.right == null) {
				n = null;
			}
			else if(n.left == null) {
				n = n.right;
			}
			else if(n.right == null) {
				n = n.left;
			}
			else {
				Node bigNode = biggestKeyNode(n.left);
				int temp = n.ele;
				n.ele = bigNode.ele;
				bigNode.ele = temp;
				n.left = removeNode(n.left, e);
			}
		}
		return n;
	}
	private Node biggestKeyNode(Node n) {
		if(n.right == null) {
			return n;
		}
		return biggestKeyNode(n.right);
	}
	
	
//	Size
	public int size() {
		return count;
	}
	
	
	
	
//	Display Element
//	Level ordering
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void displayLVL() {
		Queue q1 = new LinkedList();
		if(root != null) q1.add(root);
		while(!q1.isEmpty()) {
			Node n = (Node)q1.poll();
			System.out.print(n.ele+" ");
			if(n.left != null) q1.add(n.left);
			if(n.right != null) q1.add(n.right);
		}
		System.out.println();
	}
//	Pre-Order  <root><left><right>
	public void displayPrO() {
		pre(root);
		System.out.println();
	}
	private void pre(Node n) {
		if(n == null) return;
		System.out.print(n.ele+" ");
		pre(n.left);
		pre(n.right);
	}
//	In-Order  <left><root><right>
	public void displayIO() {
		in(root);
		System.out.println();
	}
	private void in(Node n) {
		if(n == null) return;
		pre(n.left);
		System.out.print(n.ele+" ");
		pre(n.right);
	}
//	Pre-Order  <left><right><root>
	public void displayPoO() {
		post(root);
		System.out.println();
	}
	private void post(Node n) {
		if(n == null) return;
		pre(n.left);
		pre(n.right);
		System.out.print(n.ele+" ");
	}
}
