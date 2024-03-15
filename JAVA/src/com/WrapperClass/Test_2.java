package com.WrapperClass;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Circle)) return false;
		return radius == ((Circle)obj).radius;
	}
	
	public String toString() {
		return ""+radius;
	}
}

public class Test_2 {
	public static void main(String[] args) {
		Circle c1 = new Circle(50);
		Circle c2 = new Circle(50);
		System.out.println("C1 = "+c1);
		System.out.println("C2 = "+c2);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}
}
// C1 = 50
// C2 = 50
// false
// true
