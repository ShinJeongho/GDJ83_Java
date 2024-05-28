package com.winer.study2;

public class S2 {

	public static void main(String[] args) {
		int[] ray = new int[3]; // 배열 선언 변수명 첫글자 소문자
		String[] names = new String[2];
		System.out.println(ray);
		System.out.println(names);
		String name = null;

		int[] ar = new int[3];
		int[] ar2 = { 1, 2, 3 };

		System.out.println(ar[0]);
		System.out.println(names[0]);
		ar[0] = 50;
		ar = ar2;
		System.out.println(ar[0]);

	}

}
