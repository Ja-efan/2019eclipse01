package Person1;

public class Person1 {
	
	int age = 20;
	String name = "ㅇㅈㅎ";
	String address= "ㅊㅈㅅ";
	boolean sex= true;
	
	public void printAge() {
		System.out.println("나이 :"+age);
	}
	
	public void printName() {
		System.out.println("이름 :"+name);
	}
	
	public void printAddr() {
		System.out.println("주소 :"+address);
	}
	
	public void printSex() {
		if (sex==true) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("성별 : 여자");
		}
	}
}
