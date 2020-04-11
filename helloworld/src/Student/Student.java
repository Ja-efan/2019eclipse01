package Student;

public class Student {
	
	int age;
	String no; // 학번
	String addr;
	String tel; // 전화번호

	/**
	 * 나이출력
	 */
	public void printAge() {
		System.out.println("나의 나이는 " + age);
	}
	/**
	 * 학번출력
	 */
	public void printNo() {
		System.out.println("나의 학번은 " + no);
	}
	/**
	 * 주소출력
	 */
	public void printAddr() {
		System.out.println("나의 주소는 " + addr);
	}
	/**
	 * 전화번호 출력
	 */
	public void printTel() {
		System.out.println("나의 전화번호는 " + tel);
	}
	
}