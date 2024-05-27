package com.winer.study1;

public class Study3 {
	
	public static void main(String [] args) {
		System.out.println("1"+1);
		System.out.println(1+"1"+1);
		System.out.println(1+'a'+"1");
		
		//물건을 고르고,물건의 총합계,돈을 내고,
		int total = 25760;
		int don= 50000;
		//잔돈 계산
		int jandon= don-total;
		
		//만원갯수
		int man=0;
		int chan=0;
		int back=0;
		int ship=0;
		
 
		
		man=jandon/10000;
		chan=(jandon%10000)/1000;
		back=(jandon%1000)/100;
		ship=(jandon%100)/10;
		
		
		
		System.out.println("잔돈: " + jandon);
		System.out.println("만원: " + man +"장" );
		System.out.println("천원: " + chan +"장" );
		System.out.println("백원: " + back +"개" );
		System.out.println("십원: " + ship +"개" );
		
	}

}
