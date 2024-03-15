package com.Clone;

class Test3 implements Cloneable {
	int x;
	int y;
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Test4 implements Cloneable {
	int a;
	int b;
	Test3 c = new Test3();
	
	public Object clone() throws CloneNotSupportedException {
		Test4 t2 = (Test4)super.clone();
		t2.c = (Test3)t2.c.clone();
		return t2;
	}
}

public class Deep_Clone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test4 t2 = new Test4();
		t2.c.x = 10;
		t2.c.y = 20;
		t2.a = 30;
		t2.b = 40;
		System.out.println(t2.c.x+" "+t2.c.y+" "+t2.a+" "+t2.b);
		Test4 t_2 = (Test4)t2.clone();
		t_2.c.x = 100;
		t_2.c.y = 200;
		t_2.a = 300;
		t_2.b = 400;
		System.out.println(t2.c.x+" "+t2.c.y+" "+t2.a+" "+t2.b);
		System.out.println(t_2.c.x+" "+t_2.c.y+" "+t_2.a+" "+t_2.b);
	}
}
/*
10 20 30 40
10 20 30 40
100 200 300 400
 */
