package com.winer.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번길이는 최소 6글자 이상
		// 대소문자,숫자 1개 이상이 있어야 함 isDigit()
		Scanner sc = new Scanner(System.in);

		System.out.println("pw를 입력");
		String pw = sc.next();
		// 문자를 받아서 글자를 한글자씩 꺼내와서 대문자가 있는지 확인
		// 대문자는 한개이상 있으면 통과 하나도 없으면 대문자는 한개이상 있어야합니다 표시.

		String result = "최소 1 이상의 대문자가 있어야 함";
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (Character.isUpperCase(ch)) {
				result = "통과";
				break;
			}
		}
		System.out.println(result);
	}

}
