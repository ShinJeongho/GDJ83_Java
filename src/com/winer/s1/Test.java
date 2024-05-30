package com.winer.s1;

public class Test {
	// 안쓰면 default 같은 package에서만 사용가능
	int num;
	private String name; // 같은 클래스에서만 사용가능

	public void info() {
		System.out.println(this.name);
	}

}
