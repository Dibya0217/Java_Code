package com.Generics;

public class A<T> {
	private T ele;
	public void add(T e) {
		ele = e;
	}
	public T get() {
		return ele;
	}
}
