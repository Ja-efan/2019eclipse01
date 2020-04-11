package car;

public class Car {
	String maker;
	int year;
	int wheelsize;
	boolean light;
	
	// 입력 함수
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
	
	// 출력 함수
	public void printMaker()
	{
		System.out.println("제조사 :" + maker);
	}
	public void printYear()
	{
		System.out.println("연식 :" + year);
	}
	public void printWhsize()
	{
		System.out.println("휠 사이즈 :" + wheelsize);
	}
	public void printLight()
	{
		if(light == true)
			System.out.println("라이트 on");
		else
			System.out.println("라이즈 off");
	}
	
}
