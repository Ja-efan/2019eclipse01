package student;

public class Student {

	String No;
	String Name;
	int Kor;
	int Eng;
	int Math;
	
	// ������ �Է�
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
	
	// �Է¹��� ������ ���
	public void printNo() {
		System.out.println("�й� :"+ No);
	}
	public void printName() {
		System.out.println("�̸� :"+ Name);	
	}
	public void printKor() {
		System.out.println("�������� :"+ Kor);
	}
	public void printEng() {
		System.out.println("�������� :"+ Eng);
	}
	public void printMath() {
		System.out.println("�������� :"+ Math);
	}
	
	// �հ����� ���
	public void sum() {
		int tot = Kor + Eng + Math;
		System.out.println("���� �հ� :"+ tot);
	}
	
	// ������� ���
	public void ave() {
		int Ave = (Kor + Eng + Math)/3;
		System.out.println("������� :" + Ave);
	}
}
