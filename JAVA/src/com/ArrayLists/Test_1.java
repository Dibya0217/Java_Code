package com.ArrayLists;

public class Test_1 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size());
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.print(); // 10 20 30 40 50 60
		System.out.println(a1.size()); // 6
		a1.add(3, 70);
		a1.print(); // 10 20 30 70 40 50 60
		System.out.println(a1.size()); // 7
		a1.remove(3);
		a1.print(); // 10 20 30 40 50 60
		System.out.println(a1.size()); // 6
		System.out.println(a1.get(3)); // 40
		a1.clear();
		System.out.println(a1.size()); // 0
	}
}
