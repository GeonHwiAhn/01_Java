package com.kh.PropertiesPre;

import java.util.*;

public class UserSetting {
	public static void main(String[] args) {
		//Properties 객체와 인스턴스 생성 = setting
		Properties setting = new Properties();
		
		//속성 설정
		// name		" john"
		// age		"17"
		// city		"seoul"
		setting.setProperty("name", "john");
		setting.setProperty("age", "17");
		setting.setProperty("city", "seoul");

		// city 조회하기
		String 도시조회 = setting.getProperty("city");
		
		//조회내용 출력
		System.out.println("도시 : " + 도시조회);
		
		//전체조회하기 Map.Entry<Object, Object>		key value 출력
		System.out.println("전체조회하기");
		for(Map.Entry<Object, Object>  e  :setting.entrySet()) {
			Object key = e.getKey();
			Object value = e.getValue();
			System.out.println(key + " : " + value);
		}
		
		
	}
}
