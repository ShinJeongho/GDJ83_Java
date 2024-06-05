package com.winer.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민 번호 입력");
		// 991225-1234567
		String jumin = sc.next();
		// 입력받은 주민번호를 입력해서 성별을 검증 1이면 남자 2이면 여자 3이면 남자 4면 여자 나머지는 외국인들
		// 나이를 계산 2024-출생년도
		char ch = jumin.charAt(7);
		if (ch == '1' || ch == '3') {
			System.out.println("남자");
		} else if (ch == '2' || ch == '4') {
			System.out.println("여자");
		} else {
			System.out.println("외국인");
		}

		String y = jumin.substring(0, 2);
		int r = 1900;

		if (ch == '3' || ch == '4') {
			r = 2000;
		}
		int year = r + Integer.parseInt(y); // 1900+90 2000+1
		System.out.println(2024 - year);

		// 주민번호 유효성 검증
		// 9 5 1 2 2 6 - 1 2 3 4 5 6 7(검증용 숫자)
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
		// 18 15 4 10 12 42 8 18 6 12 20 30 = 다더하기
		// 총합을 11로 나눈 나머지를 구함
		// 이 나머지를 11로 뺸 결과를 검증용 숫자와 같은지 비교
		// 같으면 제대로된 번호 틀리면 다른번호
		// 11로 뺀 결과값이 2자리수라면 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 같은지 비교

		int c = 2;
		int sum = 0;
		for (int i = 0; i < jumin.length() - 1; i++) {
			char n1 = jumin.charAt(i);
			if (i == 6) {
				continue;
			}
			String n2 = String.valueOf(n1);
			int num1 = Integer.parseInt(n2);
			sum = sum + num1 * c;
			c++;
			if (c > 9) {
				c = 2;
			}
		}
		sum = sum % 11;
		sum = 11 - sum;
		if (sum > 9) {
			sum = sum % 10;
		}
		int a = Integer.parseInt(String.valueOf(jumin.charAt(jumin.length() - 1)));
		if (sum == a) {
			System.out.println("OK");
		} else {
			System.out.println("재발급");
		}

		if (sum == jumin.charAt(jumin.length() - 1))
			;

		char n1 = jumin.charAt(0);// 99 char타입
		String n2 = String.valueOf(n1); // "99" String타입
		int num1 = Integer.parseInt(n2); // 숫자로 변환 99 숫자로 변환
		System.out.println(num1 * 2); // 숫자 188 프린트
	}

}
