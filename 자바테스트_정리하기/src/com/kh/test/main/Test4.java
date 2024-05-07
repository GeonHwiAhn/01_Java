package com.kh.test.main;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		/*
		 1부터 9까지 값을 스캐너로 각각 입력받아
		 
		 더하기 뺴기 곱하기 몫 출력하기
		 
		 int 숫자1
		 int 숫자2
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요 : ");
		int 숫자1 = sc.nextInt();
		
		//만약에 숫자1이 1~9가 아니라면
		//한번에 여러줄 복사하기 단축키 - shift를 누르고 원하는 위아래 방향 화살표 입력
		if(숫자1 < 1  || 숫자1 > 9) {
			System.out.println("1부터 9사이의 정수를 입력하세요");
			return;
		}
		
		
		System.out.println("숫자 2를 입력하세요 : ");
		int 숫자2 = sc.nextInt();
		if(숫자2 < 1  || 숫자2 > 9) {
			System.out.println("1부터 9사이의 정수를 입력하세요");
			return;
		}
		
		
		int 합 = 숫자1 + 숫자2;
		int 뺴기 = 숫자1 - 숫자2;
		int 곱 = 숫자1 * 숫자2;
		int 몫 = 숫자1 / 숫자2;
	
		
		System.out.println(숫자1 + " + " + 숫자2 + " = " +합); 
		System.out.println(숫자1 + " - " + 숫자2 + " = " +뺴기); 
		System.out.println(숫자1 + " * " + 숫자2 + " = " +곱); 
		System.out.println(숫자1 + " / " + 숫자2 + " = " +몫); 
		
		
		
		
		
	
	}
}
