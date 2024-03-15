package com.LinkedList;

public class DoubleLinkedList {
	private Node first = null;
	private int count = 0;
	
//	Size
	public int size() {
		return count;
	}
//	Add in Last
	public void add(Object e) {
		if(first == null) {
			first = new Node(e, null, null);
			count++;
			return;
		}
		
		Node curr = first;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(e, null, curr);
		count++;
	}
//	Add in Between
	public void add(Object e, int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			Node n = new Node(e, first, null);
			first.prev = n;
			first = n;
			count++;
			return;
		}
		
		Node curr = first;
		for(int i = 1; i < index; i++) {
			curr = curr.next;
		}
		Node n = new Node(e, curr.next, curr);
		curr.next.prev = n;
		curr.next = n;
		count++;
	}
//	Get Element
	public Object get(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		Node curr = first;
		for(int i = 1; i <= index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
//	Remove Element
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			first = first.next;
			first.prev = null;
			count--;
			return;
		}
		Node curr = first;
		for(int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		if(curr.next != null) curr.next.prev = curr;
		count--;
	}
//	Display Element
	public void display() {
		if(first == null) {
			System.out.println("Node is Empty");
			return;
		}
		Node curr = first;
		while(curr != null) {
			System.out.print(curr.ele+" ");
			curr = curr.next;
		}
	}
}
