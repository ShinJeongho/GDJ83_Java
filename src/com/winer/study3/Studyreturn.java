package com.winer.study3;

import java.util.Random;

public class Studyreturn {
	// 접근지정자 [그외지정자] 리턴타입 매서드명([매개변수선언]) {}

	public int t1() { // return 이없으면 void
		int num = 3;
		int num2 = 2;
		int result = num * num2; // 결과여기서 끝남
		return result; // return 쓰려면 void에 result 타입을 써야함
						// return 데이터갯수는 하나만 가능 return num,num2(x)
	}

	public void t2() {
		Random random = new Random();
		// 0이상 10미만의 정수 하나를 랜덤하게 줌
		int num = random.nextInt(10);
		if (num % 2 == 0) {
			return;
		} else {
			System.out.println(num);
		}
	}

}
