package com.winer.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object)

//		WeatherDTO[] dtos = new WeatherService().init();
//
//		WeatherView v = new WeatherView();
//		v.view(dtos);
		WeatherController c = new WeatherController();
		c.start();
	}

}
