package Person2;

public class Person2 
{
	int age=456;
	String name="adf";
	String addr="sadf";
	boolean gender = true;
	
	public void printAge(int paramage)
	{
		age = paramage;
		System.out.println("���� :"+ age);
	}
	public void printName(String paramname)
	{
		name = paramname;
		System.out.println("�̸� :"+ name);
	}
	public void printAddr(String paramaddr)
	{
		addr = paramaddr;
		System.out.println("�ּ� :"+ addr);
	}
	public void printGender(boolean paramgender)
	{
		gender = paramgender;
		if (gender == true)
			System.out.println("����");
		else
			System.out.println("����");
	}
}
