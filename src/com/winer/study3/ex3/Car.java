package com.winer.study3.ex3;

public class Car {
	String color;
	String brand;
	String company;

	public void info() {
		System.out.println("info");
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(brand);
		int result = this.go("df");
	}

	public int go(String name) {
		System.out.println(this.company);
		return 0;
	}

}
