package com.kh.test.main;

public class Test7 {
	public static void main(String[] args) {
		//배열에 들어있는 데이터 중 홀수의 값들을 출력하고 합을 구한다.
		//단, continue를 이용하여 작성한다.
		
		int[] 배열 = {1,2,3,4,5,6,7,8,9,10};
		double 합 = 0;
		//for each문을 사용해서 모두 돌고
		for(int i : 배열) {
			
			//if문을 사용해서 (% 2 != 0)
			//아니면 += 해주기
			
			//숫자 % 2 == 0 짝수구하기
			//숫자 % 2 != 0 홀수구하기
			if(i%2 != 0) {
				System.out.println(i);
				
				//합계 출력하기
				합 += i;
			}
			
		}
		System.out.println(합);
		
		
		
		
		
	}
}
