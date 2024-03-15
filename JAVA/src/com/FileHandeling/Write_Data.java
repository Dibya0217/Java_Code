package com.FileHandeling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya");
		System.out.println(file.mkdir());
		file = new File("C:\\Users\\DIBYA\\OneDrive\\Desktop\\Dibya\\Self Introduction.txt");
		System.out.println(file.createNewFile());
		FileWriter write = new FileWriter(file);
		if(file.canWrite()) {
			write.write("Good Morning Mam/Sir. Thank You for the opportunity to introduce myself!. My name is Dibya Ranjan Samal. I am From Jajpur, Odisha. ​I am recently cpmplet my Bachelors in Technology with Computer Science stream from DRIEMS Autonomous Engg. College with 8.15 CGPA. Also, I did my 12th from CHSE Board in the year 2019 and & 10th from HSE Board in the year 2017. \r\n"
					+ "\r\n"
					+ "I am Very Good in C++, Java.\r\n"
					+ "\r\n"
					+ "To be honest, my goal is to get a job in a reputed company like \"EFI\" where I can use my skills and knowledge to deliver value-added result. if I talk about my strengths – I can say that I’m learning from my mistake, team player and adaptable – and I do guess that these strengths and Skills of mine are perfectly suitable for this job role.\r\n"
					+ "\r\n"
					+ "In my free time, I enjoy spending time with my family, Watching Movies and Series, reading, playing outdoor sports, and sometimes cooking.\r\n"
					+ "\r\n"
					+ "Considering my family background details – we’re 4 members in the family. Apart from my parents, I have a sibling – an younger sister.\r\n"
					+ "\r\n"
					+ "That’s all about me. Thank You Mam/Sir.");
		}
		else {
			System.out.println("Cant Write");
		}
		System.out.println("Executed");
		write.close();
	}
}
