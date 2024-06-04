package com.winer.s1.lang.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 멤버변수는 private 설정
	// 외부에서 접근불가 Getters/Setters 필요

	private String city;// 도시명
	private double gion;// 기온
	private String status;// 날씨정보
	private int humidity;// 습도

	// 생성자는 여러개 만들어도 상관없지만 기본생성자는 필수

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getGion() {
		return gion;
	}

	public void setGion(double gion) {
		this.gion = gion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

}
