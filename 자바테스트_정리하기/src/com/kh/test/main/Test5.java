package com.kh.test.main;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번쨰 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("두번쨰 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();

		// 두 수가 모두 1부터 9까지의 수인지 한번에 확인!
		if (num1 >= 1 && num1 <= 9  && num2 >= 1 && num2 <= 9 ) {
			// 두 수가 1~9일 때 곱하기
			int 곱 = num1 * num2;
			if (곱 >= 1 && 곱 <= 9) {
				System.out.println("한자리 수 입니다.");
			} else {
				System.out.println("두자리 수 입니다.");
			}
		} else {
			System.out.println("입력한 수 중에서 1~9가 아닌 수가 있습니다.");
		}

	}
}
