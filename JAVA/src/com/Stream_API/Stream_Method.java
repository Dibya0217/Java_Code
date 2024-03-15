package com.Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Method {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(50);
		l1.add(60);
		l1.add(60);
		l1.add(70);
		
		int[] arr = l1.stream().filter(i -> (i > 50)).mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
