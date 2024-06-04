package com.winer.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		// 문자열을 누적 시키고 싶을 때
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();
		// winter + iu
		// 객체가 새로안만들어지고 누적
		sb2.append(false);

		sb.append("winter");
		sb.append("iu");
		sb.append(10);

		String result = sb.toString(); // (문자열로 변경)
		System.out.println(sb);// tostring 가져옴 오버라이딩
		System.out.println(result);

	}

}
