package 자바_예제문제실습;
/*
 캡슐화
 String 사람이름 김영희
 int 나이 10
 생성자 모두 만들기
 toString 내용출력
 
 PersonMain person.txt 저장
 
 */
public class Person {
	private String 사람이름 = "김영희";
	private int 나이 = 10;
	
	
	//Setter
	
	public void set사람이름(String 사람이름) {
		this.사람이름 = 사람이름;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	//Getter
	public String get사람이름() {
		return 사람이름;
	}
	public int get나이() {
		return 나이;
	}
	
	//기본
	public Person() {
		// TODO Auto-generated constructor stub
	}
	//필수
	public Person(String 사람이름, int 나이) {
		this.사람이름 = 사람이름;
		this.나이 = 나이;
	}
	
	//toString
	@Override
	public String toString() {
		return "사람이름=" + 사람이름 + ", 나이=" + 나이;
	}
	
	
	
}
