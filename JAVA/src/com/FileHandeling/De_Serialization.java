package com.FileHandeling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_Serialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		String fileName = "C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt";
		FileInputStream f = new FileInputStream(fileName);
		ObjectInputStream o = new ObjectInputStream(f);
		
		Student obj = (Student)o.readObject();
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
		o.close();
		f.close();
	}

}
