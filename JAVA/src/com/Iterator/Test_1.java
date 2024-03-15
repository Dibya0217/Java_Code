package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		
		Iterator<Integer> i1 = a1.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");    // 10 20 30 40 50 60 70 
		}
		i1.remove();
		while(i1.hasNext()) {
			System.out.print(i1.next()+" ");    // 
		}
	}
}
