package com.kh.Hamburger;

import java.util.*;

public class BurgerShop {
	public static void main(String[] args) {
		//ArrayList 사용 주문리스트
		List<HamburgerOrder> 주문리스트 = new ArrayList<>();
		/*
		HamburgerOrder 주문1 = new HamburgerOrder("동그라미", "치즈버거");
		주문리스트.add(주문1);
		HamburgerOrder 주문2 = new HamburgerOrder("안세모", "베이컨버거"); 
		주문리스트.add(주문2);
		HamburgerOrder 주문3 = new HamburgerOrder("박네모", "상하이버거"); 
		주문리스트.add(주문3);
		HamburgerOrder 주문4 = new HamburgerOrder("금각진", "치킨버거"); 
		주문리스트.add(주문4);
		HamburgerOrder 주문5 = new HamburgerOrder("동그라미", "빅맥"); 
		주문리스트.add(주문5);
		*/
		//new BurgerOrder("동그라미" , "치즈버거")
		//new BurgerOrder("안세모" , "베이컨버거")
		//new BurgerOrder("박네모" , "상하이버거")
		//new BurgerOrder("금각진" , "치킨버거")
		//new BurgerOrder("동그라미" , "빅맥")
		
		주문리스트.add(new HamburgerOrder("동그라미", "치즈버거"));
		주문리스트.add(new HamburgerOrder("안세모", "베이컨버거"));
		주문리스트.add(new HamburgerOrder("박네모", "상하이버거"));
		주문리스트.add(new HamburgerOrder("금각진", "치킨버거"));
		주문리스트.add(new HamburgerOrder("동그라미", "빅맥"));
		
		//toString 출력 sysout 주문리스트
		System.out.println(주문리스트);
		
		//ArrayList에 담긴 중복으로 된 사람들을 중복으로 주문하지 못하게 하고 싶습니다.
		//HashSet
		
		System.out.println("고객님 중복 주문이시네요!!");
		System.out.println("마지막 주문으로 중복주문을 처리해드릴게요.^^");
		
		//HashSet 사용해서 중복 주문을 방지하기 위한 set 중복주문방지
		//중복된 주문정보 제거한거 출력
		
		Set<String> 중복고객제거 = new HashSet<>();
		
		//중복 고객을 제거한 다음에 중복되지 않은 고객만 ArrayList에 다시 담기
		
		List<HamburgerOrder> 중복제거주문 = new ArrayList<>(); //중복고객을 제거한 내용만 담을 예정
		
		//for - each문을 활용해서 중복이 있는지 한바퀴 돌면서 확인한다음
		//중복이 되지 않는 내용만 추가
		for(HamburgerOrder 주문 : 주문리스트) {
			//존재하는 고객만 추가하겠다 라는 의미이기 때문에 추가가 안됨
			//if(중복고객제거.contains(주문.get고객명())) {
			if(!중복고객제거.contains(주문.get고객명())) { // 고객이 존재하지 않는다면
				중복제거주문.add(주문);					//주문 내용 추가
				중복고객제거.add(주문.get고객명());
			}
		}
		
		System.out.println(중복제거주문);//중복제거주문에는 처음에 주문한 리스트만 받을 수 있게 됨
	}
}
