package Star5;

public class Star5 {
	
	public static void main(String[] args)
	{
		for(int i = 0 ; i < 5 ; i++) // �� ���� (�� �ݺ�Ƚ��) 
		{
			for (int j = 0 ; j <= i ; i++) // ���� ���� ( 0 1 2 3 4 )
			{
				System.out.print(" "); // ���� ���
			}
			for (int k = 0 ; k < (9-2*i) ; k++) // �� ���� ( 9 7 5 3 1 )
			{
				System.out.print("*"); // �� ���
			}
			System.out.println(""); // ����
		}
	}
}
