package com.kh.NumberSystem;

public class 숫자시스템 {
	public static void main(String[] args) {
		int 숫자 = 42;
		
		//42라는 숫자를 2진수로 변환
		//정수로 된 숫자 -> 문자열로 변환해서 모두 출력해서 보기 위해 String 변환
		String 이진수 = Integer.toBinaryString(숫자);
		System.out.println(이진수);
		
		//42라는 숫자를 8진수로 변환
		String 팔진수 = Integer.toOctalString(숫자);
		System.out.println(팔진수);
		
		//42라는 숫자를 -> 2진수로 변환한 값을 가져와서 10진수로 변환
		String 이진수2 = "101010";
		int 십진수 = Integer.parseInt(이진수2, 2);
		System.out.println(십진수);
		
		// (2 ~ 16) 어떤 진수 -> 십진수 parseInt를 사용해서 변경
		
		//팔진수를 십진수 변환
		String 팔진수2 = "52"; //8진법 52 == 42
		/*
		 		4		   2
		 	  4 * 8¹	 2 * 80
		 	   32		   2
		 	   나머지를 역순으로 나열하면 52
		 */
		
		int		십진수2 = Integer.parseInt(팔진수2, 8);
		System.out.println(십진수2);
		
		//십육진수를 십진수로 변환
		String 십육진수 = "2A";
		/*
		 16진법에서 'A'는 10 '2' 는 2
		 2A16 = 2 X 16¹ + A X 16
		 2A16 = 2 X 16 + 10 X 16 = 2 * 16 + 10 * 1 = 32 + 10 = 42 		 
		 */
		int 십진수3 = Integer.parseInt(십육진수, 16);
		System.out.println(십진수3);
	}
}
