package Student;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(); // Student Ŭ������ ��ü st1 ����
		st1.age=100;
		st1.no="1";
		st1.addr="û�ֽ�";
		st1.tel="010-1111-1111";
		st1.printAge();
		st1.printNo();
		st1.printAddr();
		st1.printTel();
		System.out.println("-------------------------");
		
		Student st2 = new Student(); // Student Ŭ������ ��ü st2 ����
		st2.age=200;
		st2.no="2";
		st2.addr="����Ư����";
		st2.tel="010-2222-2222";
		st2.printAge();
		st2.printNo();
		st2.printAddr();
		st2.printTel();
		System.out.println("-------------------------");
		
		Student st3 = new Student(); // Student Ŭ������ ��ü st3 ����
		st3.age=100;
		st3.no="3";
		st3.addr="����������";
		st3.tel="010-3333-3333";
		st3.printAge();
		st3.printNo();
		st3.printAddr();
		st3.printTel();
	}

}
