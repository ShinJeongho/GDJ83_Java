package com.winer.s2;

public class Member {

	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter getter 메서드
	public void setAge(int age) {

		this.age = age;
	}

	public int getAge() {

		return this.age;
	}

}
