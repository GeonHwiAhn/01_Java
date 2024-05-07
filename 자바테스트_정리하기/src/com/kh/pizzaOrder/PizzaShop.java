package com.kh.pizzaOrder;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaShop {
	public static void main(String[] args) {
		//주문 목록을 저장할 ArrayList 주문리스트
		/*
		 "고영희", "페페로니"
		 "박철진", "마르게리따"
		 "안영식", "슈프림"
		 "고영희", "파인애플"
		 "박철진", "치즈"
		 */
		ArrayList<PizzaOrder> 주문리스트 = new ArrayList<>();
		
		ArrayList<String> 고객리스트 = new ArrayList<>(Arrays.asList("고영희", "박철진", "안영식", "고영희", "박철진"));
		ArrayList<String> 피자리스트 = new ArrayList<>(Arrays.asList("페페로니", "마르게리따", "슈프림", "파인애플", "치즈"));
		
		//for문을 활용해서 주문 추가
		for(int i = 0; i < 고객리스트.size(); i++) {
			PizzaOrder 오더 = new PizzaOrder(고객리스트.get(i), 피자리스트.get(i));
			주문리스트.add(오더);
		
		}
		
		System.out.println(고객리스트);
		System.out.println(피자리스트);
		System.out.println(주문리스트);
		//HashSet 사용해서 중복주문 방지하기
		
		//주문추가 PizzaOrder 를 사용해서 주문을 추가
		
		//주문한 내용 전체보기 toString
		
		//중복된 주문정보 제거한 것 출력
	}
}
