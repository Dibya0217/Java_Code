package com.LinkedList;

public class SingleLinkedList {
	private Node first = null;
	private int count = 0;
	
//	Add Element Last
	public void add(Object e) {
		if(first == null) {
			first = new Node(e, null);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(e, null);
		count++;
	}
//	Add Element In Between
	public void add(Object e, int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index == 0) {
			first = new Node(e, first);
			count++;
			return;
		}
		Node curr = first;
		for(int i = 1; i < index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(e, curr.next);
		count++;
	}
//	Size
	public int size() {
		return count;
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
			count--;
			return;
		}
		Node curr = first;
		for(int i = 0; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
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
