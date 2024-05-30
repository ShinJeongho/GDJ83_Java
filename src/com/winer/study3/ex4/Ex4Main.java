package com.winer.study3.ex4;

public class Ex4Main {

	public static void main(String[] args) {

		// new 생성자호출 생성자이름은 class와 동일
		Car car = new Car();

		car.info();

		Car car2 = new Car(200);
		car2.info();
	}

	Bike bike = new Bike("", 4);

}
