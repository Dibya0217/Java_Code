package com.FileHandeling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DIBYA\\OneDrive\\Desktop\\File Handeling\\Two.txt");
//		System.out.println(file.mkdir()); // To create folder
		System.out.println(file.createNewFile()); // To create file
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		File file1 = new File("C:\\Users\\DIBYA\\OneDrive\\Desktop\\File Handeling\\Three.txt");
		file.renameTo(file1); // To change file name
		System.out.println(file1.getAbsolutePath()); // To get file location
	}
}
