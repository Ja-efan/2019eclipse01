package Person1;

public class Person1 {
	
	int age = 20;
	String name = "������";
	String address= "������";
	boolean sex= true;
	
	public void printAge() {
		System.out.println("���� :"+age);
	}
	
	public void printName() {
		System.out.println("�̸� :"+name);
	}
	
	public void printAddr() {
		System.out.println("�ּ� :"+address);
	}
	
	public void printSex() {
		if (sex==true) {
			System.out.println("���� : ����");
		}else {
			System.out.println("���� : ����");
		}
	}
}
