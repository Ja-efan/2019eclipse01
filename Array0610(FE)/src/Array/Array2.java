package Array;

public class Array2 {
	
	public static void main(String[] args) {
		
		int[] eng_grade = new int[5]; // 배열 생성 후 초기화 (int형 데이터타입을 5개 가진 eng_grade라는 이름의 배열 선언)
		eng_grade[0] = 100; // 인덱스 0번 초기화
		eng_grade[1] = 90; // 인덱스 1번 초기화
		eng_grade[2] = 80; // 인덱스 2번 초기화
		eng_grade[3] = 70; // 인덱스 3번 초기화
		eng_grade[4] = 60; // 인덱스 4번 초기화
		
		for (int i=0 ; i<eng_grade.length ; i++) { // length: 배열의 크기
			System.out.println( (i+1) + "번 학생의 영어점수 : " + eng_grade[i]);
		}
		
		int[] arr = eng_grade.clone();
		
		for(int j =0 ; j < arr.length ; j++ ) {
			System.out.println("arr["+ (j+1)+ "]: " + arr[j] ); 
		}
		
	}

}
