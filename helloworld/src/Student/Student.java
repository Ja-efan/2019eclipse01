package Student;

public class Student {
	
	int age;
	String no; // �й�
	String addr;
	String tel; // ��ȭ��ȣ

	/**
	 * �������
	 */
	public void printAge() {
		System.out.println("���� ���̴� " + age);
	}
	/**
	 * �й����
	 */
	public void printNo() {
		System.out.println("���� �й��� " + no);
	}
	/**
	 * �ּ����
	 */
	public void printAddr() {
		System.out.println("���� �ּҴ� " + addr);
	}
	/**
	 * ��ȭ��ȣ ���
	 */
	public void printTel() {
		System.out.println("���� ��ȭ��ȣ�� " + tel);
	}
	
}