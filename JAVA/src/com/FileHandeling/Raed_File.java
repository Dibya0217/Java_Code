package com.FileHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Raed_File {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt");
		FileInputStream f1 = new FileInputStream(f);
		int n = f1.read();
		while(n != -1) {
			System.out.print((char)n);
			if(f.canRead()) {
				n = f1.read();
			}
			else {
				System.out.println("We can't read");
			}
		}
		f1.close();
	}

}
