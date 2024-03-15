package com.FileHandeling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Student implements Serializable {
	transient String name;
	int rollNo;
}

public class Serialization {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student();
		s1.name = "Dibya Ranjan Samla";
		s1.rollNo = 126;
		
		String fileName = "C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt";
		
		FileOutputStream f = new FileOutputStream(fileName);
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(s1);
		f.close();
		o.close();
		System.out.println("Object save in file");
	}

}
