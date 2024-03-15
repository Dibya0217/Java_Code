package com.Arrays;

import java.util.Arrays;

@SuppressWarnings("rawtypes")
class Circle_1 implements Comparable {
	int radius;
	public Circle_1(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int compareTo(Object a) {
		return radius - ((Circle_1)a).radius;
	}
	
	public String toString() {
		return "Circle[radius = "+radius+"]";
	}
	
}

public class Demo_5 {

	public static void main(String[] args) {
		Circle_1 [] circles = {
				new Circle_1(40),
				new Circle_1(10),
				new Circle_1(50),
				new Circle_1(30)
		};
		Arrays.sort(circles);
		for(Circle_1 c : circles) {
			System.out.println(c);
		}
	}
}
/*
Circle[radius = 10]
Circle[radius = 30]
Circle[radius = 40]
Circle[radius = 50]
 */
