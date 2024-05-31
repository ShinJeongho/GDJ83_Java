package com.winer.s2;

public class MiddleStudent extends Student {
	private int history;

	public MiddleStudent() {
		super(10);
	}

	public void midinfo() {
		super.info();// 히스토리빼고 다찍어줌
		System.out.println(this.history);
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}
