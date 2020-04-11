package student;

public class Student {

	String No;
	String Name;
	int Kor;
	int Eng;
	int Math;
	
	// 데이터 입력
	public void setNo(String a) {
		No = a;			
	}
	public void setName(String b) {
		Name = b;
	}
	public void setKor(int c) {
		Kor = c;
	}
	public void setEng(int d) {
		Eng = d;
	}
	public void setMath(int e) {
		Math = e;
	}
	
	// 입력받은 데이터 출력
	public void printNo() {
		System.out.println("학번 :"+ No);
	}
	public void printName() {
		System.out.println("이름 :"+ Name);	
	}
	public void printKor() {
		System.out.println("국어점수 :"+ Kor);
	}
	public void printEng() {
		System.out.println("영어점수 :"+ Eng);
	}
	public void printMath() {
		System.out.println("수학점수 :"+ Math);
	}
	
	// 합계점수 출력
	public void sum() {
		int tot = Kor + Eng + Math;
		System.out.println("점수 합계 :"+ tot);
	}
	
	// 평균점수 출력
	public void ave() {
		int Ave = (Kor + Eng + Math)/3;
		System.out.println("평균점수 :" + Ave);
	}
}
