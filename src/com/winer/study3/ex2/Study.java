package com.winer.study3.ex2;

public class Study {

	public int[] remove(int[] ar) {
		int[] newar = new int[ar.length - 1];
		for (int i = 0; i < newar.length; i++) {
			newar[i] = ar[i];
		}
		return newar;

	}

	public int[] add(int[] ar) {
		System.out.println(ar.length);
		int[] newar = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			newar[i] = ar[i];
		}

		return newar;
	}

}
