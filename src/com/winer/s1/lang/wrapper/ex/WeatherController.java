package com.winer.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	private WeatherDTO[] dtos;
	private WeatherService weatherService;
	private WeatherView weatherView;
	private Scanner scanner;

	// start 메서드 호출
	// dtos와 weatherService와 weatherView의 초기화는 WeatherController 생성자 내에서 하기
	// 1. 날씨전체정보출력
	// 2. 종료 2번을 누를때까지 실행

	public WeatherController() { // WeatherController의 생성자
		this.weatherService = new WeatherService();
		this.weatherView = new WeatherView();
		this.dtos = this.weatherService.init();
		this.scanner = new Scanner(System.in);
	}

	public void start() { // start 메서드
		boolean flag = true;
		while (flag) {
			System.out.println("1.날씨전체정보출력");
			System.out.println("2.날씨정보검색"); // 도시명으로 검색하는 코드를 WeatherService에 만듬
			System.out.println("3.날씨정보추가");
			System.out.println("4.종료");

			int choice = scanner.nextInt();

			if (choice == 1) {
				this.weatherView.view(dtos);
			} else if (choice == 2) {
				WeatherDTO weatherDTO = weatherService.findByCity(this.scanner, this.dtos);
				weatherView.view(weatherDTO);

			} else if (choice == 3) {
				dtos = weatherService.addWeather(scanner, dtos);
			} else {
				System.out.println("프로그램이 종료 됩니다");
				break;
				// return;
			}
		}

	}

}