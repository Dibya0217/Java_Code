package com.Association;

class A {
	public void m1() {
		System.out.println("m1 Method");
	}
}

class B {
	public void m2() {
		System.out.println("m2 Method");
		A a = new A();
		a.m1();
	}
}

public class Demo_1 {
	public static void main(String[] args) {
		System.out.println("main Method");
		B b = new B();
		b.m2();
	}
}
/*
main Method
m2 Method
m1 Method
 */
