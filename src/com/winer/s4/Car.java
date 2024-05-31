package com.winer.s4;

public final class Car {

	// 접근지정자[그외지정자] 데이터타입 변수명;
	public static final String COMPANY = "abc"; // 초기화

	// 멤버변수
	public final int MAX_PRICE;
//	{
//		this.price=30;
//	}

	public Car() {
		this.MAX_PRICE = 100;
	}

	public static void info() {
		System.out.println(Car.COMPANY);
		// System.out.println(this.price); 인스턴스변수 사용불가
		System.out.println("static method");
		// this.info2(); 인스턴수 변수 사용 불가
	}

	public final void info2() {
		Car.info(); // 프로그램 시작시 Car.info 만들어져있어서 사용가능
		System.out.println(Car.COMPANY);
		final int num = 30;
	}

}
