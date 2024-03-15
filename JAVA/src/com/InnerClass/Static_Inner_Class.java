package com.InnerClass;

class Outer1 {
	
	static class Inner {
		static int i = 10;
		int j = 20;
		
		public void m1() {
			System.out.println("M1 is executed");
		}
	}
	
	public static void main(String[] args) {
		Outer1.Inner inner = new Inner();
		inner.m1(); // M1 is executed
		System.out.println(Outer1.Inner.i); // 10
		System.out.println(inner.j); // 20
	}

}
