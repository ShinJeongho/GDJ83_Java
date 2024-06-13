package com.winer.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {

		// 문자열-> 문자->01
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력");
		String fileName = sc.next();

		File file = new File("C:\\study", fileName);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true); // 이어서 씀 true false 면 덮어씀

			while (true) {
				System.out.println("입력");
				String s = sc.next();
				if (s.toLowerCase().equals("e")) {
					break;
				}

				fw.write(s + "\r\n"); //
			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
	}

}
