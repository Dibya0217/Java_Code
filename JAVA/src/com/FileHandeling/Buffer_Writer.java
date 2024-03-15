package com.FileHandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt");
		try(BufferedWriter b = new BufferedWriter(f)) {
			b.write("Dibya");
			b.newLine();
			b.write("Ranjan");
			b.newLine();
			b.write("Samal");
		}
	}
}
