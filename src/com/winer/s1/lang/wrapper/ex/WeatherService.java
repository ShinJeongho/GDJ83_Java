package com.winer.s1.lang.wrapper.ex;

public class WeatherService {

	// Controller Layer
	// Business Layer
	// DAO
	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울   , 29.3 - 맑음 -  60");
		this.sb.append("-부산   , 33.6 - 흐림 -  90");
		this.sb.append("-제주   , 26.5 - 눈 -  30");
		this.sb.append("-광주   , 10.6 - 태풍 -  80");
	}

	public void init() {
		String info = sb.toString();

		System.out.println(info);
		// init를 main에서 호출했을때 sb에있는 것을 문자열 변수에 담아서 출력
		info = info.replace(",", "-");

		String[] infos = info.split("-");

		for (int i = 0; i < infos.length; i += 4) {

			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(infos[i].trim());
			weatherDTO.setGion(Double.parseDouble(infos[i + 1].trim()));
			weatherDTO.setStatus(infos[i + 2].trim());
			weatherDTO.setHumidity(Integer.parseInt(infos[i + 3].trim()));

			System.out.println(infos[i]);
		}

	}
}// weatherDTO를 4개만들어서 배열로해서 하나씩
