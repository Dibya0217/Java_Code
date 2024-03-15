package com.LinkedList;

public class Test_1 {

	public static void main(String[] args) {
		SingleLinkedList s1 = new SingleLinkedList();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(50);
		s1.add(60);
		s1.add(70);
		s1.display(); // 10 20 30 40 50 60 70 50
		s1.add(80, 2);
		s1.display(); // 10 20 80 30 40 50 60 70 40
		System.out.println(s1.get(4));
		
		
		DoubleLinkedList d1 = new DoubleLinkedList();
		System.out.println(d1.size()); // 0
		d1.add(10);
		d1.add(20);
		d1.add(30);
		d1.add(40);
		d1.add(50);
		d1.add(60);
		d1.add(70);
		d1.add(80);
		d1.display(); // 10 20 30 40 50 60 70 80
		d1.add(90, 4); 
		d1.display(); // 10 20 30 40 90 50 60 70 80 
		System.out.println(d1.get(4)); // 90
		d1.remove(4);
		d1.display(); // 10 20 30 40 50 60 70 80
	}
}
