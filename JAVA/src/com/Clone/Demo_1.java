package com.Clone;

class Test {
	int x, y;
	public Test() {
		x = 10;
		y = 20;
	}
}
public class Demo_1 {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.x+" "+t1.y);
		Test t2 = t1;
		t2.x = 100;
		t2.y = 200;
		System.out.println(t1.x+" "+t1.y);
		System.out.println(t2.x+" "+t2.y);
	}
}
/*
10 20
100 200
100 200
 */
