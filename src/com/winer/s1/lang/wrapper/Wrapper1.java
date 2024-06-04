package com.winer.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// 클래스
		// int long
		System.out.println(Integer.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		Integer i = new Integer("10");

		int num = 10;
		i = new Integer(num);

		int n = Integer.parseInt("10");
		Double.parseDouble("3.13");
		Long.parseLong("10");

		// wrapper

		num = 10;
		// auto boxing
		Integer n1 = num;

		// auto unboxing
		num = n1;

		Double d1 = 3.12;

		n1 = (int) 3.12;

	}

}
