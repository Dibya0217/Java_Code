package com.InnerClass;

class Outer {
	class Inner {
		public void m2() {
			System.out.println("Non-Static m1 is execute");
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); // 1st way
		inner.m2();
		
		new Outer().new Inner().m2(); // 2nd way
		
		Inner inner2 = new Outer().new Inner();
		inner2.m2(); // 3rd way
	}

}
/*
Non-Static m1 is execute
Non-Static m1 is execute
Non-Static m1 is execute
 */
