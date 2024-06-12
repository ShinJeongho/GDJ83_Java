package com.winer.s4.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadMain {

	public static void main(String[] args) {
		File file = new File("C:\\study", "study.java");
		Scanner sc = new Scanner(System.in);
		sc.close();
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(file); // 문자
			br = new BufferedReader(fr);// 문자들을 연결해서 문자열로

			while (true) {
				String s = br.readLine();
				if (s == null) {
					break;
				}
				System.out.println(s);
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료");
	}

}
