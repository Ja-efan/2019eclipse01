package Exx;

public class Exx5 {
	
	public static void main(String[] args)
	{
		for(int i = 0 ; i<5 ; i++) // 줄 개수 (총 반복횟수) 
		{
			for (int j = 0 ; j<=i ; i++) // 공백 개수 ( 0 1 2 3 4 )
			{
				System.out.print(" "); // 공백출력
			}
			for (int k = 0 ; k<(9-2*i) ; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
