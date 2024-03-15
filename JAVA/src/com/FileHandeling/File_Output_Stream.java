package com.FileHandeling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_Output_Stream {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream file = new FileOutputStream("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt")) {
			String s = "\n Dibya Ranjan Samal";
			byte[] b = s.getBytes();
			file.write(b);
		}
	}
}
