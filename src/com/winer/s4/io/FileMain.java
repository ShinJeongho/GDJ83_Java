package com.winer.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit(byte) ->문자로 ->문자열
		// 파일정보를 담고있는 객체

		File file = new File("C:\\study");

		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());

		// file = new File("C:\\study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());

		if (!file.exists()) {
			file.mkdir();
		}

		file = new File("c:\\study\\sub2\\student");

		file.mkdirs();

		file = new File("c:\\study\\test.txt");
		file.delete();

		file = new File("c:\\Study\\sub2");
		file.delete();

		file = new File("c:\\Study");

		String[] list = file.list();

		for (String filename : list) {
			System.out.println(filename);
		}

		file.listFiles();
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.isFile()) {
				System.out.println("파일: " + f.getName());
			} else if (f.isDirectory()) {
				System.out.println("폴더: " + f.getName());
			}

		}
	}
}
