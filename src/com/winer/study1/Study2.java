package com.winer.study1;

public class Study2 {
	
	public static void main(String [] args) {
		String name="winter";
		Object obj = new Object();
		
		//형 변환
		long num1=30L;
		int num2=(int)num1;
		
		float f1 = 1.2F;
		double d1=(double)f1; //작은거에서 큰거로 변환할때 ()생략가능 묵시적 형변환, 자동 형변환
		
		int total = 100;
		double avg = total/3;
		
		avg=33.22;
		total=(int)avg*10;
		
		System.out.println(avg);
		System.out.println(total);
		
		
	}
}