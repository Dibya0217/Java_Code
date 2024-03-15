package com.WrapperClass;

class B {
	int i;
	public B(int i) {
		this.i = i;
	}
	@Override
	public boolean equals(Object arg) {
		if(!(arg instanceof B))return false;
		return i == ((B)arg).i;
	}
}

public class PrintObj_2 {
	public static void main(String[] args) {
		B b1 = new B(10);
		B b2 = new B(10);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
	}
}
// false
// true
