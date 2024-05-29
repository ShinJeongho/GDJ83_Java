package com.winer.study3.ex1;

public class ObjectMonster {

	public static void main(String[] args) {
		Monster m = new Monster();
		m.name = "블루슬라임";
		m.species = "슬라임";
		m.level = 1;
		m.hp = 100;
		m.exp = 10;

		Dokki d = new Dokki();
		d.name = "엑스칼리버";
		d.ap = 30000; // 공격력
		d.Durability = 100; // 내구도
		d.enforce = 1; // 강화수치
		d.range = 100; // 사거리

		m.dokki = d;// 몬스터 클래스의 도끼 는 도끼의 주소

		System.out.println(m.dokki.name);// 엑스칼리버

		d = new Dokki();
		d.name = "황금도끼";

		System.out.println(m.dokki.name);// 엑스칼리버

		Monster m2 = new Monster();
		m2.dokki = d;
		System.out.println(m2.dokki.name); // 황금도끼

		System.out.println(m.name);
		System.out.println(m.species);
		System.out.println(m.level);
		System.out.println(m.hp);
		System.out.println(m.exp);

	}

}
