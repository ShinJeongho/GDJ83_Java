package com.winer.study3.student;

public class StudentView {

	public void view3(String str) {
		System.out.println(str);
	}

	public void view(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);

		}

	}

	public void view2(Student student) {
		System.out.println(student.num);
		System.out.println(student.name);
	}

}
