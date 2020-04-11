package student;

public class StudentMain {
	
	public static void main(String[] args)
	{
		Student S = new Student();
		
		// 데이터 입력
		S.setNo("123");
		S.setName("홍길동");
		S.setKor(90);
		S.setEng(80);
		S.setMath(70);
		
		// 데이터 출력
		S.printNo();
		S.printName();
		S.printKor();
		S.printEng();
		S.printMath();
		
		// 총합 점수와 평균 점수 출력
		S.sum();
		S.ave();
	}

}
