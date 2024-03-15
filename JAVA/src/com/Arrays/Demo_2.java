package com.Arrays;

class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "[radius = "+radius+"]";
	}
}

public class Demo_2 {
	public static void main(String[] args) {
		Circle [] c1 = new Circle[5];
		
		c1[0] = new Circle(10);
		c1[1] = new Circle(20);
		c1[2] = new Circle(30);
		c1[3] = new Circle(40);
		c1[4] = new Circle(50);
		
		for(Circle t : c1) {
			System.out.println(t);
		}
	}
}
/*
[radius = 10]
[radius = 20]
[radius = 30]
[radius = 40]
[radius = 50]
*/
