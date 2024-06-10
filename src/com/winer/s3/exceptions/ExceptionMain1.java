package com.winer.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {

			int num = 10;

			System.out.println("숫자 입력");
			int num2 = sc.nextInt();

			System.out.println(num / num2);
			// throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		} catch (InputMismatchException e) {
			System.out.println("숫자 이외에는 입력하지 마세요");
		} catch (Exception e) {

		} catch (Throwable e) {

		}

		Exception1 ex1 = new Exception1();
		try {
			ex1.ex1(0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램이 종료");

	}

}
