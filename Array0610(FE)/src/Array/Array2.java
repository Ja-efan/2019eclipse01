package Array;

public class Array2 {
	
	public static void main(String[] args) {
		
		int[] eng_grade = new int[5]; // �迭 ���� �� �ʱ�ȭ (int�� ������Ÿ���� 5�� ���� eng_grade��� �̸��� �迭 ����)
		eng_grade[0] = 100; // �ε��� 0�� �ʱ�ȭ
		eng_grade[1] = 90; // �ε��� 1�� �ʱ�ȭ
		eng_grade[2] = 80; // �ε��� 2�� �ʱ�ȭ
		eng_grade[3] = 70; // �ε��� 3�� �ʱ�ȭ
		eng_grade[4] = 60; // �ε��� 4�� �ʱ�ȭ
		
		for (int i=0 ; i<eng_grade.length ; i++) { // length: �迭�� ũ��
			System.out.println( (i+1) + "�� �л��� �������� : " + eng_grade[i]);
		}
		
		int[] arr = eng_grade.clone();
		
		for(int j =0 ; j < arr.length ; j++ ) {
			System.out.println("arr["+ (j+1)+ "]: " + arr[j] ); 
		}
		
	}

}
