package com.winer.study3.student;

import java.util.Scanner;

public class StudentController {
	public void start() {
		System.out.println("print");

		// S2_2중에 1.학생정보입력 2.전체 출력 3.학생검색 4.프로그램종료
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		StudentService sv = new StudentService(); // 한번만
		Student[] students = null;
		while (flag) {
			System.out.println("1.학생정보입력 2.전체출력 3.학생검색 4.종료");
			int select = sc.nextInt();

			if (select == 1) {
				System.out.println("학생정보입력 코드 작성해");
				students = sv.makestudent();

			} else if (select == 2) {
				System.out.println("전체출력 코드 작성해");
				for (int i = 0; i < students.length; i++) {
					Student s = students[i];
					System.out.println(s.name);
					System.out.println(students[i].avg);
				}
			} else if (select == 3) {
				System.out.println("학생검색 코드 작성해");
			} else if (select == 4) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못 입력");
			}
		}
	}
}
