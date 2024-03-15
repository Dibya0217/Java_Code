package com.ArrayLists;

public class ArrayList {
	private Object [] a = new Object[5];
	private int count;
	
//	Add
	public void add(Object e) {
		if(count >= a.length) {
			increaseSize();
		}
		a[count++] = e;
	}
//	Increase Size
	private void increaseSize () {
		Object [] temp = new Object[a.length + 3];
		for(int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		a= temp;
	}
//	Size
	public int size() {
		return count;
	}
//	Get Element
	public Object get(int index) {
		if(index < -1 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
//	Add Element In Between
	public void add(int index, Object e) {
		if(index < -1 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		if(count >= a.length) {
			increaseSize();
		}
		for(int i = size()-1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		count++;
	}
//	Remove an Element
	public void remove(int index) {
		if(index < -1 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i];
		}
		count--;
		a[count] = null;
	}
//	Clear All
	public void clear() {
		a = new Object[5];
		count = 0;
	}
//	Print The Array
	public void print() {
		for(Object n : a) {
			if(n == null) continue;
			System.out.print(n+" ");
		}
	}
	//Remove an element for arrayList
	public void removeElement(Object e) {
		for(int i=size()-1; i>=0; i--) {
			if(a[i]==e) {
				for(int j=i+1; j<size(); j++) {
					a[j-1]=a[j];
				}
				count--;
				a[count]=null;
			}
		}
	}
}
