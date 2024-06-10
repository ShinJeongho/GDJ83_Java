package com.winer.s2.util.collections.ex2;

import java.util.ArrayList;

public class SdNameMain {

	public static void main(String[] args) {
		SdNameService sdNameService = new SdNameService(); // 객체생성
		ArrayList<SdPersonDTO> list = sdNameService.init();// 초기화된 리스트 가져오기
		sdNameService.addSdPerson(list); // 리스트에 새 사람추가

		if (result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}

	}

}
