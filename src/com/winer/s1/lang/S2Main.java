package com.winer.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);
		t1.age = 9;
		flag = t2.equals(t1);
		System.out.println(flag);

		String name = "winter";
		System.out.println("이름 입력");
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name = name2);// false 다른 주소에 만들어져서
		System.out.println(name == name3);// 같은주소를 봐서 true
		System.out.println(name.equals(name2));// 실제 값을 비교 equals
		name3 = name3 + name2;// 두개이상 더하면 새로운 객체생성하고 그주소를 반환
		System.out.println(name3 + name2);

		System.out.println("1" + 1 + 1 + '1');

	}

}
