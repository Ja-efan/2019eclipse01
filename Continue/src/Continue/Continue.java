package Continue;

public class Continue {
	
	public static void main(String[] args)
	{
		for(int i=0 ; i<10 ; i++)
		{
			if(i%2==0) continue;
			System.out.println(i+" 특정위치 스킵기능");
		}
	}

}
