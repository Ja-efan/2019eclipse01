package Array;

public class Array1 {
	
	public static void main(String[] args)
	{
		int[] eng_grade = new int[] {100,90,95}; // 배열 선언과 초기화 동시 진행
		int[] mat_grade = {99,95,70};
		
		for (int i=0; i<eng_grade.length; i++) {
			System.out.println((i+1) + "번 학생의 영어점수 : " + eng_grade[i]);
		}
		
		for (int i=0; i<mat_grade.length; i++) {
			System.out.println((i+1) + "번 학생의 수학점수 : " + mat_grade[i]);
		}
		
	}

}
