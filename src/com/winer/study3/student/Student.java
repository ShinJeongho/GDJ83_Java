package com.winer.study3.student;

public class Student {
	int num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public void info() {
		int num = 10; // 지역변수 스택
		System.out.println("info 실행"); // 정의
	};

}
