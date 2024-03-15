package com.FileHandeling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Reader {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt");
		try(BufferedReader b = new BufferedReader(f)) {
			String s = b.readLine();
			while (s != null) {
				System.out.println(s);
				s = b.readLine();
			}
		}
	}

}
