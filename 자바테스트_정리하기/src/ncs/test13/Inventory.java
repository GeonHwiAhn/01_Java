package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
//필드 전역변수
	private String productName; //제품명
	private Date putDate; //입고
	private Date getDate; //출고
	private int putAmount; //입고양
	private int getAmount; // 출고양
	private int inventroyAmount; //남은갯수
	


	//메서드
	//기본생성자 ctrl shift enter
	public Inventory() {
		
	}
	
	//필수생성자 alt shift s o
	// 핸드폰 이름 출시일 재고량 		판매와 판매후 남은 재고는 알 수 없기 때문에 지워줘야 함
	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		//this.getDate = getDate;
		this.putAmount = putAmount;
		//this.getAmount = getAmount;
		//this.inventroyAmount = inventroyAmount;
	}

	//GetterSetter


	public String getProductName() {
		return productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public int getInventroyAmount() {
		return inventroyAmount;
	}

	
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
	}

	public void setGetAmount(int getAmount) {
		this.getAmount = getAmount;
	}

	public void setInventroyAmount(int inventroyAmount) {
		this.inventroyAmount = inventroyAmount;
	}
	
	//toString @Override alt shift s s

	@Override
	public String toString() {
		
		//날짜 형식을 변경
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		String 문자열변환 = dateFormat.format(putDate);
		
		String 출고일변환 = dateFormat.format(getDate);
					//현재재고	   -   판매량
		int 남은재고 = putAmount - getAmount;
		
		
		return "제품명 = " + productName
				+ ", 입고일 = " + 문자열변환 
				+ ", 출고일 = " + 출고일변환
				+ ", 상품재고 = " + putAmount  
				+ ", 판매량 = " + getAmount  
				+ ", 팔고 남은 양 = " + inventroyAmount;
				
	}
	
	
	
	
}
