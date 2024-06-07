package com.winer.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter,25, iu,30,hani,29, 철수,18, 영희,20";

		StringTokenizer st = new StringTokenizer(names, ",");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name.trim());
		}

		String[] n = names.split(",");

	}

}
