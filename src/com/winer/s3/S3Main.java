package com.winer.s3;

public class S3Main {

	public static void main(String[] args) {
		// 배열 선언
		Tiger tiger = new Tiger();
		tiger.age = 5;
		tiger.name = "호돌이";
		tiger.power = 500;

		Penguin penguin = new Penguin();
		penguin.age = 3;
		penguin.name = "펭수";
		penguin.wing = 2;

		// tiger is a animal 상속
		Animal animal = tiger;
		animal = penguin;

		System.out.println(animal.name);
		// System.out.println(animal.power); //부모 animal 에서는 power가없기에 못씀

		// animal 형을 Tiger변환해서 씀
		// tiger = (Tiger)animal;
		penguin = (Penguin) animal;

		Animal[] dropShip = new Animal[8];

		dropShip[0] = tiger;
		dropShip[1] = penguin;

		Tiger ani = (Tiger) dropShip[0]; //

		Eagle eagle = new Eagle();
		Airplane airplane = new Airplane();

		Fly fly = eagle;
		fly = airplane;
	}

}
