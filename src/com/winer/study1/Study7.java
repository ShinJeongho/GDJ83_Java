package com.winer.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String[] args) {
		//3과목의 점수를 입력 받아서 합계 구하기
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0;i<3;i++){ //과목이100개면 i<100
			int num=sc.nextInt(); //입력 받아서
			//sum=sum+num;
			sum+=num;
		}
		
		//a 부터 z까지 출력
		int c=97;
		for(int i=0;i<25;i++) {
			System.out.println((char)c);
			c++;
		}
		
		
	
		System.out.print("abc");
		System.out.print("def");
		System.out.println("");
		System.out.println("123");
		
	}
	
}
