package com.winer.study1;

import java.util.Scanner;

public class Study4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");//0이상의 정수를 입력
		
		int num = sc.nextInt();
		
		int result=(num/2);
		
		System.out.println(num);
		System.out.println(result);
		
		//0->0  1-> 1 2->2  3->3  4->10  5->11  6->12 7->12  10->22
		
		
		System.out.println("프로그램을 종료합니다");
	}

}
