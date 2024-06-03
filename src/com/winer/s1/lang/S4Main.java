package com.winer.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "computer Science"; // 문자는 불변

		String result = name.substring(3); // puter Science 3포함
		result = name.substring(3, 5);// p u 3포함 5불포함

		System.out.println(result);

		System.out.println("파일명을 입력하세요 확장자 포함");

		// 받은 것에서 확장자만 분리
		// jpg, png, gif,jpeg,jiff 이미지 파일인지 아닌지 확인하는 코드 맞으면 맞습니다 아니면 아니다
		name = sc.next();
		int idx = name.lastIndexOf(".");
		result = name.substring(idx + 1);
		System.out.println(result);
		if (result.equals("jpg") || result.equals("png") || result.equals("gif") || result.equals("jpeg")
				|| result.equals("jiff")) {
			System.out.println("맞습니다");
		} else {
			System.out.println("아닙니다");
		}
		sc.close();
	}

}
