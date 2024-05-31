package com.winer.s3;

public class Tiger extends Animal {
	int power;

	// 메서드 오버로딩
	// 메서드 오버라이딩
	// 메서드의 선언부(헤더)는 동일하게 접근지정자 같은범위나 더 넓은 범위로는 수정가능
	public void sleep() {
		System.out.println("누워자기");
	}

}
