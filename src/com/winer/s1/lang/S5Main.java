package com.winer.s1.lang;

public class S5Main {

	public static void main(String[] args) {

		String name = "    win     ter     ";
		System.out.println(name);
		System.out.println(name.length());
		name = name.strip();
		System.out.println(name);
		System.out.println(name.length());
		name = name.replace("  ", "");
		System.out.println(name);
		System.out.println(name.length());

		name = "winter-24*서울";
		name = name.replace("*", "-"); // 앞에껄 뒤로 바꾸기
		String[] datas = name.split("-"); // 나눠주기

		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}

		String s = String.valueOf(10.2);
		System.out.println(10.2 + "");// 객체가 더 만들어짐

	}

}
