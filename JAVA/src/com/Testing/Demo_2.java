package com.Testing;

interface A {
	public void m1();
}

class B {
	public int add() {
		System.out.println("Hi.....");
		System.out.println("Hello");
		return 0;
	}
}

//class C implements A {
//	public void m1() {
//		System.out.println("Dibya");
//	}
//}

public class Demo_2 {
	public static void main(String[] args) {
		B b1 = new B();
		A a1 = b1::add;
		a1.m1();
//		a1 = new C();
//		a1.m1();
	}
}
