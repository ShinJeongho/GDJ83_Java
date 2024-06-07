package com.winer.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		String name = "winter";
		int num = 2;
		ar.add(name); // object 개념 모든부모는 object 0
		ar.add(num); // Integer로 바꼈다가 object로 바껴서 들어감 1
		ar.add(3.12);// Outo Boxing 개념 2
		ar.add('a'); // 3
		ar.add(false); // 4
		ar.add(num);

		ar.add(1, "test"); // 해당 인덱스에 추가해라 나머지뒤로 보냄

		ar.set(0, 'c'); // 해당 인덱스 번호에 값을 수정

		ar.remove(0); // 0번인덱스 삭제
		ar.remove(2);
		ar.clear();// 모든요소삭제

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}

		LinkedList lk = new LinkedList();
		lk.add("ad");

	}

}
