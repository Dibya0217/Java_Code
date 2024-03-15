package com.TreeSet;

public class Test {
	public static void main(String[] args) {
		BinarySearchTree b1 = new BinarySearchTree();
		b1.add(50);
		b1.add(45);
		b1.add(49);
		b1.add(60);
		b1.add(55);
		b1.displayLVL(); // 50 45 60 49 55
		b1.displayIO(); // 45 49 50 60 55
		b1.displayPrO(); // 50 45 49 60 55
		b1.displayPoO(); // 45 49 60 55 50
		b1.remove(50);
		b1.displayLVL(); // 49 45 60 55
	}
}
