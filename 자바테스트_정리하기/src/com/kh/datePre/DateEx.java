package com.kh.datePre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {

		// Date로 현재 날짜를 받아서 년-월-일 출력하기

		// Date는 최초 1회만 호출 Date now = new Date();
		Date now = new Date();
		System.out.println(now);
		
		// 년-월-일 출력하기
		// SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		String a = sdf1.format(now);
		System.out.println(a);
		
		
		
		
		// 시 : 분 : 초
		// SimpleDateFormat sdf2 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
		String b = sdf2.format(now);
		System.out.println(b);
		
		//문자열(SimpleDateFormat - String)  → 날짜(Date) 변경
				//Date parseDate2
		String 문자열1 = "11:22:33";
			try {
				Date parseDate2 = sdf2.parse(문자열1);
				System.out.println(parseDate2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		// Date로 현재 날짜를 받아서 년-월-일 시:분:초 출력하기
		// SimpleDateFormat sdf3 = new SimpleDateFormat();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String c = sdf3.format(now);
		System.out.println(c);
		String 문자열2 = "2024-05-03 11:14:04";
		//문자열(SimpleDateFormat - String)  → 날짜(Date) 변경
		try {
			Date parseDate3 = sdf3.parse(문자열2);
			System.out.println(parseDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
