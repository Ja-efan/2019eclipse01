package car;

public class Car {
	String maker;
	int year;
	int wheelsize;
	boolean light;
	
	// �Է� �Լ�
	public void setMaker(String paramMaker)
	{
		maker = paramMaker;
	}
	public void setYear(int paramYear)
	{
		year = paramYear;
	}
	public void setWheelsize(int paramWhsize)
	{
		wheelsize = paramWhsize;
	}
	public void setLight(boolean paramLight)
	{
		light = paramLight;
	}
	
	// ��� �Լ�
	public void printMaker()
	{
		System.out.println("������ :" + maker);
	}
	public void printYear()
	{
		System.out.println("���� :" + year);
	}
	public void printWhsize()
	{
		System.out.println("�� ������ :" + wheelsize);
	}
	public void printLight()
	{
		if(light == true)
			System.out.println("����Ʈ on");
		else
			System.out.println("������ off");
	}
	
}
