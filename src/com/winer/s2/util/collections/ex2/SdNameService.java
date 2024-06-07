package com.winer.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SdNameService {

	private StringBuffer sb; // StringBuffer= sb 를 문자열로 만듬
	private Scanner sc; // 입력받기위한 Scanner

	public SdNameService() {
		sb = new StringBuffer(); // 객체초기화
		sb.append("이태수,삼성,33,010-3943-2030,"); // append =sb에 붙임
		sb.append("남태민,롯데,43,010-2030-2011,");
		sb.append("진민수,애플,24,010-4052-5033,");
		sb.append("오태식,쿠팡,30,010-9920-0343,");
		sc = new Scanner(System.in); // 객체초기화
	}

	public ArrayList<SdPersonDTO> init() { // init()=데이터분리 해서 반환
		ArrayList<SdPersonDTO> list = new ArrayList<SdPersonDTO>(); // DTO담을 가방 만듬
		StringTokenizer st = new StringTokenizer(sb.toString(), ","); // toString() =문자열

		while (st.hasMoreTokens()) {
			SdPersonDTO sdPersonDTO = new SdPersonDTO();
			sdPersonDTO.setName(st.nextToken().trim());
			sdPersonDTO.setCompany(st.nextToken().trim());
			sdPersonDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			sdPersonDTO.setNumber(st.nextToken().trim());
			list.add(sdPersonDTO); // 완성된 객체 list 에 추가
		}
		return list;
	}

	public void addSdPerson(ArrayList<SdPersonDTO> list) {
		SdPersonDTO sdPersonDTO = new SdPersonDTO();
		System.out.println("이름을 입력하세요");
		sdPersonDTO.setName(sc.next());
		System.out.println("회사를 입력하세요");
		sdPersonDTO.setCompany(sc.nextLine());
		System.out.println("나이를 입력하세요");
		sdPersonDTO.setAge(sc.nextInt());
		System.out.println("번호를 입력하세요");
		sdPersonDTO.setNumber(sc.nextLine());
		list.add(sdPersonDTO); // 새로운 사람 list에 추가

	}

	public int removeSdPerson(ArrayList<SdPersonDTO> list) {
		System.out.println("삭제할 상품명 입력");
		String name = sc.next();
		int result = 0;

		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}

}
