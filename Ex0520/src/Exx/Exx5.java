package Exx;

public class Exx5 {
	
	public static void main(String[] args)
	{
		for(int i =0 ; i<5 ; i++) // ÁÙ °³¼ö (ÃÑ ¹Ýº¹È½¼ö)
		{
			for (int j = 0 ; j<i ; i++)
			{
				System.out.print(" ");
			}
			for (int k = 0 ; k<(9-2*i) ; k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
