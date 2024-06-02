package com.winer.s1;

public class StackStudy {

	public int[] add(int[] ar) {
		// 받은 배열에서 하나의 임의의 데이터를 추가하면
		// 제일 앞에 추가
		// 추가된 배열을 리턴
		int [] newArray = new int [ar.length+1];   //새 배열 생성
		newArray[0]=0;                            //제일앞에추가
		for(int i =0;i<ar.length;i++) {           //배열 복사 
			newArray[i+1]=ar[i];
		}						
		return newArray;
	}

	public int[] remove(int[] ar) {
		// 맨앞의 요소를 삭제하고
		// 삭제된 배열을 리턴
		if(ar.length == 0) {
			return new int[0];
		}
		int []newArray = new int[ar.length-1];
		for(int i = 0;i<ar.length;i++) {
			newArray[i]=ar[i+1];
		}
		return newArray;	
		
		
		
		
		
	}

	// 스택구조를 흉내내려고 하는 코드

}
