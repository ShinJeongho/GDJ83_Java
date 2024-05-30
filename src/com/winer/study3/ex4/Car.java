package com.winer.study3.ex4;

public class Car { // 멤버변수 실행순서 1번
	String color = "white";
	String brand;
	String company;
	int price = 1000;

	// 생성자 constructor
	// {인스턴스 초기화 블럭}

	{
		price = 200; // 인스턴스 실행순서2번
	}

	public Car() { // 매개변수가없는 기본 생성자 메서드 실행순서3번
		// System.out.println("자동차가 만들어집니다");
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "Kia";
//		this.price = 2500;
		// 자기자신의 또다른 생성자를 호출하는 this()
		// this() 생성자내에서 제일첫줄에 위치 해야함, 위에 코드가 없어야 함
		this(2500); // car 호출해서 가격은 2500

	} // 태어날 때 이걸로 태어나겠다.

	// 생성자 오버로딩
	public Car(int price) {
//		this.price = price;
//		this.color = "Black";
//		this.brand = "K3";
//		this.company = "Kia";
		this(price, "black");
	}

	public Car(int price, String color) {
//		this.price = price;
//		this.color = color;
//		this.brand = "K3";
//		this.company = "Kia";
		this(price, color, "k3");
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "Kia";
	}

	public void info() {
		System.out.println("info");

		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);

	}

}
