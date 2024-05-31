package com.winer.s4;

public class S4Main {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.brand = "Samsung";
		tv.price = 500;
		tv.point = 50;
		tv.size = 100;

		Computer computer = new Computer();
		computer.brand = "Lg";
		computer.price = 300;
		computer.point = 30;
		computer.cpu = "G2";

		Phone phone = new Phone();
		phone.brand = "Apple";
		phone.price = 150;
		phone.point = 15;
		phone.color = "Pink";

		Customer customer = new Customer();
		customer.don = 1000;
		customer.point = 0;

		customer.buy(tv);
		customer.buy(phone);
		customer.buy(computer);

	}

}
