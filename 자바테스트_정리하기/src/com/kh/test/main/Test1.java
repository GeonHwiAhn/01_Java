//프로젝트명 : 자바테스트_정리하기
package com.kh.test.main;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner 스캐너 = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int 숫자 = 스캐너.nextInt();
		
		//만약에 숫자가 1 ~ 100 사이일 때 
		if(숫자 <= 100 && 숫자 >= 1) {
			if(숫자 %2 == 0)  {
			System.out.println(숫자 + "는 2의 배수입니다.");
		} else {
			System.out.println(숫자 + "는 2의 배수가 아닙니다.");
		} 
			
		}else {
			System.out.println("1 ~ 100 사이의 값만 입력해주세요.");
		}
				//2의 배수인지 아닌지 if else 확인
		//1~100 사이가 아니면 1~100사이의 값만 입력해주세요. 출력
		
		System.out.println("=== if   else if   else");
		int 숫자1 = 5;
		
		 if(숫자1 > 0) {
			 System.out.println("양수입니다.");
		 } else if(숫자1 < 0) {
			 System.out.println("음수입니다");
		 } else {
			 System.out.println("0입니다.");
		 }
		
	}
}
