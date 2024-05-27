package com.winer.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String[] args) {
		//이중 for문
		
		//FPS(배그,서든,배필,)
		//총알(30발,탄창 3개)
		//점사,단발

		//1.단발모드  2.점사모드 선택
		//1번 누르면 탕 문장 30번 탄창을 갈면서 단발로할거야 점사로할거야 물어봄
		//점사면 탕탕탕 문장 10번 탄창을 갈면서 단발로 할거야 점사로 할거야 물어봄
		
		Scanner sc = new Scanner(System.in); //키보드에서 입력받는것 1번만 
		for(int e=0; e<3;e++) {  
				
		int a = sc.nextInt();  //입력    
		int count=10;
		String sound="탕탕탕";
		if(a==1) {
		 count=30;
		 sound="탕";
			
		}
		for(int b=0;b<count;b++) {
			System.out.println(sound);
		}
		//for문 한번쓰기
	}		
		
		
		
		
	}
}
