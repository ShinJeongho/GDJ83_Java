package com.winer.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		// 학생 수를 입력 받아서 학생 수 만큼 이름과 국어점수, 영어점수, 수학점수를 입력 받아서 최종 출력
		// 학생의 이름이 a 면 a는 80
		Scanner sc = new Scanner(System.in);

		// 1번 누르면 학생정보 입력 2번 누르면 학생 정보 출력 3번누르면 프로그램 종료
		boolean flag = true;

		String[] names = null;
		int[] kuk = null;
		int[] eng = null;
		int[] math = null;
		int[] number = null;
		int[] totals = null;
		double[] avgs = null;

		while (flag) {
			System.out.println("1.학생정보입력 2.학생 정보 출력 3.학생정보 검색 4.성적순출력 5.프로그램종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("학생 수 입력");
				int count = sc.nextInt();

				names = new String[count];
				kuk = new int[count];
				eng = new int[count];
				math = new int[count];
				number = new int[count];
				totals = new int[count];
				avgs = new double[count];

				for (int i = 0; i < names.length; i++) {
					number[i] = i + 1;
					System.out.println("학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] + "의 국어점수");

					kuk[i] = sc.nextInt();
					System.out.println(names[i] + "의 영어점수");
					eng[i] = sc.nextInt();
					System.out.println(names[i] + "의 수학점수");
					math[i] = sc.nextInt();
					totals[i] = kuk[i] + eng[i] + math[i];
					avgs[i] = totals[i] / 3.0;
				}
				break;
			case 2:

				System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
				for (int i = 0; i < names.length; i++) {
					System.out.print(number[i] + "\t");
					System.out.print(names[i] + "\t");
					System.out.print(kuk[i] + "\t");
					System.out.print(eng[i] + "\t");
					System.out.print(math[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.println(avgs[i] + "\n");
				}
				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				int n = sc.nextInt();
				for (int i = 0; i < number.length; i++) {
					if (n == number[i]) {
						System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
						System.out.print(number[i] + "\t");
						System.out.print(names[i] + "\t");
						System.out.print(kuk[i] + "\t");
						System.out.print(eng[i] + "\t");
						System.out.print(math[i] + "\t");
						System.out.print(totals[i] + "\t");
						System.out.println(avgs[i] + "\n");
					}
				}

				break;
			case 4:
				for (int i = 0; i < avgs.length - 1; i++) {
					for (int j = i + 1; j < avgs.length; i++) {
						if (avgs[i] < avgs[j]) {

							int tempNumber = number[i];
							number[i] = number[j];
							number[j] = tempNumber;

							String tempName = names[i];
							names[i] = names[j];
							names[j] = tempName;

							int tempkuk = kuk[i];
							kuk[i] = kuk[j];
							kuk[j] = tempkuk;

						}
					}
				}
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점");
				for (int i = 0; i < names.length; i++) {
					System.out.print(number[i] + "\t");
					System.out.print(names[i] + "\t");
					System.out.print(kuk[i] + "\t");
					System.out.print(eng[i] + "\t");
					System.out.print(math[i] + "\t");
					System.out.print(totals[i] + "\t");
					System.out.println(avgs[i] + "\n");
				}

				break;
			default:
				flag = false;
			}
		}

	}
}
