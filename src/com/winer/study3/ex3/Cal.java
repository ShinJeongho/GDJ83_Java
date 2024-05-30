package com.winer.study3.ex3;

public class Cal {

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 + n2);
	}// 중복선언이 아니다 오버로딩 똑같은 이름의 hap 메서드이름 사용가능

	public int hap(long n1, int n2) {
		System.out.println(n1 * n2);
		return 0;
	}// 중복선언 아니다 똑같은 이름의 hap 메서드이름 사용가능
}