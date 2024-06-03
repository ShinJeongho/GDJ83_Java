package com.winer.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Object obj = new Object();
		Object obj2 = new Object();

		String n = new String("winter");
		String n2 = new String("winter");

		System.out.println(obj.toString());// 참조변수찍으면 toString 자동호출
		System.out.println(n.toString());

		char ch = n.charAt(1);// int index
		System.out.println(ch);

		int l = n.length();
		System.out.println(l);

		System.out.println("문자열 입력");
		n = sc.next();
		for (int i = 0; i < n.length(); i++) {
			ch = n.charAt(i);// n에서 charat 한글자씩 꺼내자
			System.out.println(ch);
		}

		System.out.println(n.length() * 1000 + "원입니다");
	}

}
