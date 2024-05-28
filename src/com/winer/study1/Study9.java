package com.winer.study1;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {

		// 로그인 검증
		// id=1234, pw=5678

		// 로그인시도전에 1번 누르면 로그인,2번 누르면 종료
		// 사용자의 id와 pw를 입력 받아서 로그인 시도를 n번시도
		// 틀리면 로그인 실패 출력 로그인 성공하면 로그인 성공 출력하고 반복문 종료

		// 반복문 종료 후 종료를 선택 했다면 프로그램 종료
		// 로그인 성공 후 반복문이 종료 되었다면 게임을 시작하자

		// mmorpg: 로그인 성공했을 때만 실행
		// 시작레벨은 1로시작해서 15가 만렙
		// gold : 0으로 시작
		// 1레벨에서 2레벨 3마리 잡아야 레벨업 , 몬스터를 잡았습니다 잡은횟수만큼나오게
		// 2레벨에서 3렙:6마리 잡아야 레벨업
		// 3레벨에서 4렙:9마리 잡아야 레벨업
		// 14->15렙:42마리
		// 5레벨 달성시 1000g 지급 10레벨 달성시 2000g 지급
		// 10레벨 달성시 2000g 지급 15레벨 달성시 3000g 지급
		// 현재 레벨 현재 gold 출력하고 종료

		Scanner sc = new Scanner(System.in);// 키보드로부터 입력받을 준비 1개만 필요
		int id = 1234; // 저장된 ID
		int pw = 5678; // 저장된 PW

		boolean login = true;// while 시작하기 위한 용도

		while (login) {
			System.out.println("1.로그인 2.종료");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("id를 입력하세요");
				int inputid = sc.nextInt();

				System.out.println("pw를 입력하세요");
				int inputpw = sc.nextInt();

				if (inputid == id && inputpw == pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}
			} else {
				System.out.println("종료");
				login = false;
			}
		} // 로그인 검증 끝

		if (login) {
			System.out.println("게임시작");
			int level = 1;
			int mon = 3;
			int gold = 0;
			for (level = 1; level < 15; level++) {
				System.out.println("1.사냥 2.종료");
				int select = sc.nextInt();
				if (select != 1) {
					break;
				}
				if (level % 5 == 0) {
					gold = gold + level / 5 * 1000;
					System.out.println(level + "축하금" + level / 5 * 1000 + "지급");
				}
				System.out.println("현재 레벨" + level);
				for (int j = 0; j < level * mon; j++) {
					System.out.println(j + 1 + "번째 사냥");
				}

			}
			gold = gold + 3000;
			System.out.println("최종 레벨" + level + "소유 골드" + gold);

		} // if 끝
		System.out.println("프로그램이 종료 됩니다");

	}
}
