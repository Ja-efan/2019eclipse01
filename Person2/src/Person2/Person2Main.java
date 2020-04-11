package Person2;

public class Person2Main 
{
	public static void main(String[] args)
	{
		Person2 p = new Person2();
		
		p.printAge(22); // 나이세팅
		p.printName("연재환"); // 이름 세팅
		p.printAddr("청주시"); // 주소 세팅
		p.printGender(true); // 성별 세팅
	}
}
