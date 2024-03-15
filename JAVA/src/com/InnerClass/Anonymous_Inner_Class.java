package com.InnerClass;

class Theater {
	
	public void show() {
		System.out.println("Dibya Ranjan Samal");
	}
}
class BookMyShow {
	public static void main(String[] args) {
		Theater theater = new Theater();
		theater.show(); // Dibya Ranjan Samal
		
		new Theater() {
			@Override
			public void show() {
				System.out.println("Override Method");
			}
		}.show(); // Override Method
	}

}
