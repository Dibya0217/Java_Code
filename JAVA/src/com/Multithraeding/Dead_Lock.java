package com.Multithraeding;

class A {
	public synchronized void m1(B b) {
		System.out.println("M1 of A");
		System.out.println("Going to call t2() of B");
		b.t2();
	}
	public synchronized void t1() {
		System.out.println("t1() of A");
	}
}

class B {
	public synchronized void m2(A a) {
		System.out.println("M2 of B");
		System.out.println("Going to call t1() of A");
		a.t1();
	}
	public synchronized void t2() {
		System.out.println("t2 of B");
	}
}

class Th_1 extends Thread {
	A a = new A();
	B b = new B();
	
	public void help() {
		b.m2(a);
	}
	public void run() {
		a.m1(b);
	}
}

public class Dead_Lock {

	public static void main(String[] args) {
		Th_1 t = new Th_1();
		t.start();
		t.help();
		t.run();
	}

}
