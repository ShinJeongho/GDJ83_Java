package com.winer.study3.student;

import java.util.Scanner;

public class StudentService {

	public Student findByNum(Student[] students) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호 입력");
		int n = sc.nextInt();

		for (int i = 0; i < students.length; i++) {
			if (n == students[i].num) {
				return students[i];
			}
		}
		return null;
	}

	public Student[] makestudent() {
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 수를 입력하세요");
		int count = sc.nextInt();

		Student[] students = new Student[count]; // count 변수에 저장된 숫자만큼의 크기를 가지는 Student 객체 배열 생성
		for (int i = 0; i < students.length; i++) {// 학생 객체 초기화 배열의 각 칸에 새로운 Student 객체를 하나씩 넣어주는 과정

			// students[i] = new Student(); // 3을 입력하면 students[0] = new Student();[1][2]
			// 3개만들어짐.
			Student s = new Student();
			System.out.println(i + 1 + " 번째 이름 입력");
			s.name = sc.next();
			System.out.println(s.name + "의 번호 입력");
			s.num = sc.nextInt();
			System.out.println(s.name + "의 국어 입력");
			s.kor = sc.nextInt();
			System.out.println(s.name + "의 영어 입력");
			s.eng = sc.nextInt();
			System.out.println(s.name + "의 수학 입력");
			s.math = sc.nextInt();
			s.total = s.kor + s.eng + s.math;
			s.avg = s.total / 3.0;
			students[i] = s;

		}

		return students;
	};

}
//findByNum 메서드 만들고 찾으려고하는 학생의 번호를 입력받아서  일치하는 학생의 객체를 리턴해서 view에서출력하게