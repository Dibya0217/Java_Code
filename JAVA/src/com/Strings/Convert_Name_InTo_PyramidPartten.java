package com.Strings;

public class Convert_Name_InTo_PyramidPartten {

	public static void main(String[] args) {
		String name = "Dibya";
		
		for (int i = 0; i < name.length(); i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(name.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
//D 
//D i 
//D i b 
//D i b y 
//D i b y a 