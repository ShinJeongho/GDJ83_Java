package com.winer.s2.util.collections.ex2;

import java.util.ArrayList;

public class SdNameView {
	public void printMessage(String message) {
		System.out.println(message);
	}

	public void printList(ArrayList<SdPersonDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			SdPersonDTO person = list.get(i);
			System.out.println("Name: " + person.getName() + ", Company: " + person.getCompany() + ", Age: "
					+ person.getAge() + ", Number: " + person.getNumber());
		}
	}
}
