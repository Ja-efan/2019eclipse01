package Array;

public class Array1 {
	
	public static void main(String[] args)
	{
		int[] eng_grade = new int[] {100,90,95}; // �迭 ����� �ʱ�ȭ ���� ����
		int[] mat_grade = {99,95,70};
		
		for (int i=0; i<eng_grade.length; i++) {
			System.out.println((i+1) + "�� �л��� �������� : " + eng_grade[i]);
		}
		
		for (int i=0; i<mat_grade.length; i++) {
			System.out.println((i+1) + "�� �л��� �������� : " + mat_grade[i]);
		}
		
	}

}
