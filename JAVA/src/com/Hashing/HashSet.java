package com.Hashing;


public class HashSet {
	private Node [] a = new Node[10];
	private int count = 0;
	
//	add
	public boolean add(int k) {
		int index = k % a.length;
		if(a[index] == null) {
			a[index] = new Node(k, null);
			count++;
			return true;
		}
		
//		Node prev = null;
		Node curr = a[index];
		
//		while(curr != null) {
//			if(k == curr.key)return false; // For not taking duplicate
//			prev = curr;
//			curr = curr.next;
//		}
//		prev.next = new Node(k, curr);
		
		while(curr.next != null) {
			if(k == curr.key)return false; // For not taking duplicate
			curr = curr.next;
		}
		curr.next = new Node(k, null);
		
		
		count++;
		return true;
	}
//	Size
	public int size() {
		return count;
	}
//	Iterate
	public void iterate() {
		for(int i = 0; i < a.length; i++) {
			Node curr = a[i];
			while(curr != null) {
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
			System.out.println();
		}
	}
}
