package student;

public class StudentMain {
	
	public static void main(String[] args)
	{
		Student S = new Student();
		
		// ������ �Է�
		S.setNo("123");
		S.setName("ȫ�浿");
		S.setKor(90);
		S.setEng(80);
		S.setMath(70);
		
		// ������ ���
		S.printNo();
		S.printName();
		S.printKor();
		S.printEng();
		S.printMath();
		
		// ���� ������ ��� ���� ���
		S.sum();
		S.ave();
	}

}
