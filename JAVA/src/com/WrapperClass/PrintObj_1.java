package com.WrapperClass;

class A {
	String name;
	public A(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
public class PrintObj_1 {
	public static void main(String[] args) {
		A a1 = new A("Dibya");
		System.out.println(a1);
	}
}
// Dibya