package com.Arrays;

interface Animal {
	public void makeSound();
}

class Cat implements Animal {
	public void makeSound() {
		System.out.println("Meow Meow..........");
	}
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("Bow Bow.................");
	}
}

public class Demo_3 {
	public static void main(String[] args) {
		Animal [] a = new Animal[5];
		a[0] = new Dog();
		a[1] = new Dog();
		a[2] = new Cat();
		a[3] = new Dog();
		a[4] = new Cat();
		
		for(Animal c : a) {
			c.makeSound();
		}
	}
}
/*
Bow Bow.................
Bow Bow.................
Meow Meow..........
Bow Bow.................
Meow Meow..........
*/
