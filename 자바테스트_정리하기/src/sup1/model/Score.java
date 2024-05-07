package sup1.model;

public class Score {
//필드
	private int 국어;
	private int 영어;
	private int 수학;
	private int 총점;
	private double 평균;

//메서드
	// 필수 생성자
	public Score(int 국어, int 영어, int 수학) {
		super();
		this.국어 = 국어;
		this.영어 = 영어;
		this.수학 = 수학;
		
	}

	// void 점수
	public void 점수() {
		총점 = 국어 + 영어 + 수학;
		평균 = 총점 / 3.0;
		// 평균 50점 이상이면 합격
		// 삼항연산자로 합격 불합격
		String 결과 = (국어 >= 50 && 영어 >= 50 && 수학 >= 50) ? "합격" : "불합격";
		// 각 점수가 50 이상 평균 50점 이상
		// 출력문으로 국어 영어 수학점수
		System.out.println("국어 점수 : " + 국어);
		System.out.println("영어 점수 : " + 영어);
		System.out.println("수학 점수 : " + 수학);
		// 삼항연산자에 대한 결과 출력
		System.out.println(결과);
	}

}
