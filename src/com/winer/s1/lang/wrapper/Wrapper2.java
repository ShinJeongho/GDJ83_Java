package com.winer.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번길이는 최소 6글자 이상
		// 대소문자,숫자 1개 이상이 있어야 함 isDigit()
		Scanner sc = new Scanner(System.in);

		// 문자를 받아서 글자를 한글자씩 꺼내와서 대문자가 있는지 확인
		// 대문자는 한개이상 있으면 통과 하나도 없으면 대문자는 한개이상 있어야합니다 표시.
		System.out.println("pw를 입력");
		String pw = sc.next();
		String result = "최소 1 이상의 대문자가 있어야 함";

		int upper = 0;
		int lower = 0;
		int digit = 0;
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				upper++;
			} else if (Character.isLowerCase(ch)) {
				lower++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {

			}
		}
		if (upper > 0 && lower > 0 && digit > 0) {
			System.out.println("통과");
		} else {
			System.out.println("fail");
		}

		System.out.println(result);
	}

}
