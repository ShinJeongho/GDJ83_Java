package com.winer.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherService {

	// Controller Layer
	// Business Layer
	// DAO
	private StringBuffer sb; // 동적으로 날씨정보 저장

	public WeatherService() { // 서비스의 생성자
		this.sb = new StringBuffer(); // 날씨데이터를 StringBuffer에 추가
		this.sb.append("서울   , 29.3 - 맑음 -  60"); // 각 도시의 데이터 -기준으로 저장
		this.sb.append("-부산   , 33.6 - 흐림 -  90");
		this.sb.append("-제주   , 26.5 - 눈 -  30");
		this.sb.append("-광주   , 10.6 - 태풍 -  80");
	}

	public WeatherDTO[] init() { // 날씨데이터 초기화 init dto배열로 반환
		String info = sb.toString(); // 문자열로 반환

		System.out.println(info);
		// init를 main에서 호출했을때 sb에있는 것을 문자열 변수에 담아서 출력
		info = info.replace(",", "-"); // ,를 -변경

		WeatherDTO[] dtos = this.getWeathers(info); // 문자열정보를 dto배열로 반환

		return dtos;
	}

	private WeatherDTO[] getWeathers(String info) {
		String[] infos = info.split("-");
		WeatherDTO[] dtos = new WeatherDTO[infos.length / 4];

		int idx = 0;

		for (int i = 0; i < infos.length; i = i + 4) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());
			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));
			weatherDTO.setStatus(infos[i + 2].trim());
			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));
			dtos[idx] = weatherDTO;
			idx++;
		}

//		for (int i = 0; i < dtos.length; i++) {
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setCity(infos[idx].trim());
//			weatherDTO.setGion(Double.parseDouble(infos[++idx].trim()));
//			weatherDTO.setStatus(infos[++idx].trim());
//			weatherDTO.setHumidity(Integer.parseInt(infos[++idx].trim()));
//			dtos[i] = weatherDTO;
//	}
		return dtos;
	}

	// 날씨정보를 도시명으로 검색해서 해당 날씨정보를 리턴해서 출력은 view
	// 메서드명은 findByCity

	public WeatherDTO findByCity(Scanner scanner, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = null;

		System.out.println("검색할 도시를 입력하세요");
		String cityName = scanner.next();

		for (int i = 0; i < ar.length; i++) {
			if (cityName.equals(ar[i].getCity())) {
				weatherDTO = ar[i];
				break;
			}
		}

		return weatherDTO;
	}

	// 날씨정보 추가
	// addWeather
	// 도시명 기온 습도 상태 입력받아서 기존의 날씨정보에 추가
	public WeatherDTO[] addWeather(Scanner scanner, WeatherDTO[] ar) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력");
		weatherDTO.setCity((scanner.next()));
		System.out.println("기온을 입력");
		weatherDTO.setGion(scanner.nextDouble());
		System.out.println("현재 상태 입력");
		weatherDTO.setStatus(scanner.next());
		System.out.println("습도 입력");
		weatherDTO.setHumidity(scanner.nextInt());

		WeatherDTO[] newAr = new WeatherDTO[ar.length + 1];
		for (int i = 0; i < ar.length; i++) {
			newAr[i] = ar[i];
		}

		newAr[ar.length] = weatherDTO;

		return newAr;

	}

}
