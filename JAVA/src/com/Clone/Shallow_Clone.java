package com.Clone;


class Test1 {
	int x;
	int y;
}

class Test2 implements Cloneable {
	int a;
	int b;
	Test1 c = new Test1();
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Shallow_Clone  {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test2 t2 = new Test2();
		t2.c.x = 10;
		t2.c.y = 20;
		t2.a = 30;
		t2.b = 40;
		System.out.println(t2.c.x+" "+t2.c.y+" "+t2.a+" "+t2.b);
		Test2 t_2 = (Test2)t2.clone();
		t_2.c.x = 100;
		t_2.c.y = 200;
		t_2.a = 300;
		t_2.b = 400;
		t2.a=500;
		System.out.println(t2.c.x+" "+t2.c.y+" "+t2.a+" "+t2.b);
		System.out.println(t_2.c.x+" "+t_2.c.y+" "+t_2.a+" "+t_2.b);
	}
}
/*
10 20 30 40
100 200 500 40
100 200 300 400
 */
