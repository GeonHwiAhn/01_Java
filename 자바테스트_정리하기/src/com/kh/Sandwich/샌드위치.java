package com.kh.Sandwich;

public class 샌드위치 {
//필드
	private String 고객명;
	private String 샌드위치종류;
	
	
//메서드
	//생성자 필수 alt shift s o 
	public 샌드위치(String 고객명, String 샌드위치종류) {
	super();
	this.고객명 = 고객명;
	this.샌드위치종류 = 샌드위치종류;
	}
	//Getter
	public String get고객명() {
		return 고객명;
	}


	public String get샌드위치종류() {
		return 샌드위치종류;
	}
	
	//Setter
	public void set고객명(String 고객명) {
		this.고객명 = 고객명;
	}
	public void set샌드위치종류(String 샌드위치종류) {
		this.샌드위치종류 = 샌드위치종류;
	}
	//@Override toString 고객명 샌드위치종류 alt shift s s
	@Override
	public String toString() {
		return "샌드위치 [고객명=" + 고객명 + ", 샌드위치종류=" + 샌드위치종류 + "]";
	}
	
	
}
