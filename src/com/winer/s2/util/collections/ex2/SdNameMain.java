package com.winer.s2.util.collections.ex2;

import java.util.ArrayList;

public class SdNameMain {

	public static void main(String[] args) {
		SdNameService sdNameService = new SdNameService();
		ArrayList<SdPersonDTO> list = sdNameService.init();
		sdNameService.addSdPerson(list);
		int result = sdNameService.removeSdPerson(list);

		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

	}

}
