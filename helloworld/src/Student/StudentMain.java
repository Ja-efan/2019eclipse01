package Student;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Student st1 = new Student(); // Student 클래스의 객체 st1 생성
		st1.age=100;
		st1.no="1";
		st1.addr="청주시";
		st1.tel="010-1111-1111";
		st1.printAge();
		st1.printNo();
		st1.printAddr();
		st1.printTel();
		System.out.println("-------------------------");
		
		Student st2 = new Student(); // Student 클래스의 객체 st2 생성
		st2.age=200;
		st2.no="2";
		st2.addr="서울특별시";
		st2.tel="010-2222-2222";
		st2.printAge();
		st2.printNo();
		st2.printAddr();
		st2.printTel();
		System.out.println("-------------------------");
		
		Student st3 = new Student(); // Student 클래스의 객체 st3 생성
		st3.age=100;
		st3.no="3";
		st3.addr="대전광역시";
		st3.tel="010-3333-3333";
		st3.printAge();
		st3.printNo();
		st3.printAddr();
		st3.printTel();
	}

}
