package com.List_Implemantation;


class ArrayList {
	private Object[] a = new Object[5];
	private int count = 0;
	
//	add
	public void add(Object e) {
		if(count >= a.length) {
			increaseSize();
		}
		a[count++] = e;
	}
	
//	Increase Size
	private void increaseSize() {
		Object [] temp = new Object[a.length + 3];
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a = temp;
	}
	
//	Size
	public int size() {
		return count;
	}
	
//	Get
	public Object get(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	
//	add in a particular index
	public void add(int index, Object e) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(count >= a.length) {
			increaseSize();
		}
		
		for(int i = size() - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		count++;
	}
	
//	Remove
	public void remove(int index) {
		if(index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];
		}
		count--;
		a[count] = null;
	}
}

public class Array_List_Demo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		System.out.println(a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		System.out.println(a.size());
		a.get(5);
		a.add(3, 45);
		System.out.println(a.size());
		a.remove(6);
	}

}
