package com.winer.s5.date;

public class Single {

	// 싱글톤 기법
	private static Single single;

	private int num = 10;

	private Single() {

	}

	public static Single get() {
		if (single == null) {
			Single.single = new Single();
		}
		return single.single;
	}
}
